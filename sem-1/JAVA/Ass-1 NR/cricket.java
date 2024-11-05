import java.util.Scanner;

public class Cricket {
    static Scanner sc = new Scanner(System.in);
    static int totalRuns, lostWickets, overs;
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

        System.out.println("You Have selected "+gameFormat + " Format");
        System.out.println("Enter Number of Overs!");
        System.out.println("Press 'W' to indicate a wicket");
        System.out.println("Press 'WD' to indicate a wide ball");
    }

    static int getNumberOfOvers() {
        System.out.println();
        System.out.print("Enter Number of Overs: ");
        return sc.nextInt();
    }

    static void playGame() {
        int totalBalls = overs * 6;
        int[] runsInOneBall = new int[totalBalls];

        for (int i = 0; i < totalBalls; i++) {
            String input = getRunsForBall(i);

            if (input.equalsIgnoreCase("W")) {
                lostWickets++;
                System.out.println("Wicket Down!!");
            } else if (input.equalsIgnoreCase("WD")) {
                totalRuns++;
                System.out.println("Wide ball! 1 run added.");
            } else {
                int runs = Integer.parseInt(input);
                if (runs == 1 || runs == 2 || runs == 4 || runs == 6) {
                    totalRuns += runs;
                    runsInOneBall[i] = runs;
                } else {
                    System.out.println("Invalid input!");
                    i--; // decrement i to retry input
                }
            }

            if (lostWickets == 10) {
                System.out.println("All wickets are fallen!");
                break;
            }

            if ((i + 1) % 6 == 0) {
                System.out.println("Over " + ((i + 1) / 6) + " is complete.");
            }
        }
    }

    static String getRunsForBall(int ballNumber) {
        int overNumber = (ballNumber / 6) + 1;
        int ballInOver = (ballNumber % 6) + 1;

        while (true) {
            System.out.print("Enter runs for Over " + overNumber + ", Ball " + ballInOver + ": ");
            String input = sc.next();

            if (input.equalsIgnoreCase("W") || input.equalsIgnoreCase("WD")) {
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

    static void displayGameResults() {
        double averagePerOver = (double) totalRuns / overs;
        System.out.println("\n-------- Game Results --------");
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Total Wickets: " + lostWickets);
        System.out.println("Average per Over: " + averagePerOver);
    }

    public static void main(String[] args) {
        welcomeMessage();
        overs = getNumberOfOvers();
        playGame();
        displayGameResults();
        sc.close();
    }
}
