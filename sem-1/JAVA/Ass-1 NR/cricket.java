import java.util.Scanner;

public class Cricket {
    static Scanner sc = new Scanner(System.in);
    static int totalRunsTeam1, lostWicketsTeam1, oversTeam1;
    static int totalRunsTeam2, lostWicketsTeam2, oversTeam2;
    static String gameFormat;

    static void welcomeMessage() {
        System.out.println();
        System.out.println("Welcome to Cricket Game!");
        System.out.println("Select Game Format!");
        System.out.println("1 . ODI");
        System.out.println("2 . T20");
        System.out.println("3 . Test");
        System.out.println("4 . IPL");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                gameFormat = "ODI";
                break;
            case 2:
                gameFormat = "T20";
                break;
            case 3:
                gameFormat = "Test";
                break;
            case 4:
                gameFormat = "IPL";
                break;
            default:
                System.out.println("Invalid input Default to T20");
                gameFormat = "T20";
                break;
        }

        System.out.println("You Have selected " + gameFormat + " Format");
        System.out.println("Enter Number of Overs!");
        System.out.println("Press 'W' to indicate a wicket");
        System.out.println("Press 'WD' to indicate a wide ball");
        System.out.println("Press 'N' to indicate a no ball");
    }

    static int getNumberOfOvers() {
        System.out.println();
        System.out.print("Enter Number of Overs: ");
        return sc.nextInt();
    }

    static void playInnings(String teamName, int overs) {
        int totalBalls = overs * 6;
        int i = 0;

        while (i < totalBalls) {
            String input = getRunsForBall(i, teamName);

            if (input.equalsIgnoreCase("W")) {
                if (teamName.equals("Team 1")) {
                    lostWicketsTeam1++;
                } else {
                    lostWicketsTeam2++;
                }
                System.out.println("Wicket Down!!");
                i++;
            } else if (input.equalsIgnoreCase("WD")) {
                totalRunsTeam1 += (teamName.equals("Team 1") ? 1 : 0);
                totalRunsTeam2 += (teamName.equals("Team 2") ? 1 : 0);
                System.out.println("Wide ball! 1 Run & Ball added.");
            } else if (input.equalsIgnoreCase("N")) {
                totalRunsTeam1 += (teamName.equals("Team 1") ? 1 : 0);
                totalRunsTeam2 += (teamName.equals("Team 2") ? 1 : 0);
                System.out.println("No ball! 1 Run & Ball added.");
                continue;
            } else {
                int runs = Integer.parseInt(input);
                if (runs == 1 || runs == 2 || runs == 3 || runs == 4 || runs == 6) {
                    if (teamName.equals("Team 1")) {
                        totalRunsTeam1 += runs;
                    } else {
                        totalRunsTeam2 += runs;
                    }
                    i++;
                } else {
                    System.out.println("Invalid input!");
                }
            }

            if ((teamName.equals("Team 1") && lostWicketsTeam1 == 10) || 
                (teamName.equals("Team 2") && lostWicketsTeam2 == 10)) {
                System.out.println("All wickets are fallen for " + teamName + "!");
                break;
            }

            if (i % 6 == 0 && i != 0) {
                System.out.println("Over " + ((i + 1) / 6) + " is complete for " + teamName + ".");
            }
        }
    }

    static String getRunsForBall(int ballNumber, String teamName) {
        int overNumber = (ballNumber / 6) + 1;
        int ballInOver = (ballNumber % 6) + 1;

        while (true) {
            System.out.print("Enter runs for " + teamName + ", Over " + overNumber + ", Ball " + ballInOver + ": ");
            String input = sc.next();

            if (input.equalsIgnoreCase("W") || input.equalsIgnoreCase("WD") || input.equalsIgnoreCase("N")) {
                return input;
            } else {
                try {
                    int runs = Integer.parseInt(input);
                    if (runs >= 0 && runs <= 6) {
                        return input;
                    } else {
                        System.out.println("Invalid input!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input!");
                }
            }
        }
    }

    static void displayResults() {
        System.out.println();
        System.out.println("===============================");
        System.out.println("---Match Results---");
        System.out.println("Team 1: " + totalRunsTeam1 + "/" + lostWicketsTeam1);
        System.out.println("Team 2: " + totalRunsTeam2 + "/" + lostWicketsTeam2);
        if (totalRunsTeam1 > totalRunsTeam2) {
            System.out.println("Team 1 wins!");
        } else if (totalRunsTeam2 > totalRunsTeam1) {
            System.out.println("Team 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        welcomeMessage();
        int overs = getNumberOfOvers();
        playInnings("Team 1", overs);
        playInnings("Team 2", overs);
        displayResults();
    }
}