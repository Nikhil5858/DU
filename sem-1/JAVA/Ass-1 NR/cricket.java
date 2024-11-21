import java.util.Scanner;

class Team {
    private String name;
    private int totalRuns;
    private int lostWickets;
    private int totalsix;
    private int totalnoball;
    private int totalwide;
    private int totalfour;

    public Team(String name) {
        this.name = name;
        this.totalRuns = 0;
        this.lostWickets = 0;
        this.totalsix = 0;
        this.totalnoball = 0;
        this.totalwide = 0;
        this.totalfour = 0;
    }

    public int getTotalSixes() {
        return totalsix;
    }

    public int getTotalFour() {
        return totalfour;
    }

    public int getTotalNoball() {
        return totalnoball;
    }

    public int getTotalWide() {
        return totalwide;
    }

    public String getName() {
        return name;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getLostWickets() {
        return lostWickets;
    }

    public double getAverage(int overs) {
        if (overs == 0)
            return 0;
        return totalRuns / overs;

    }

    public boolean addRuns(int runs) {
        if (runs == 0 || runs == 1 || runs == 2 || runs == 3 || runs == 4 || runs == 6) {
            this.totalRuns += runs;
            return true;
        } else {
            System.out.println("Invalid Input");
            return false;
        }
    }

    public void addWicket() {
        this.lostWickets++;
    }

    public boolean isAllOut() {
        return lostWickets == 10;
    }

    public void addNoball() {
        this.totalnoball++;
    }

    public void addWide() {
        this.totalwide++;
    }

    public void addSix() {
        this.totalsix++;
    }

    public void addfour() {
        this.totalfour++;
    }

}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

interface GameInfo {
    public void selectGameFormat();
}

abstract class Game {

    public abstract void playGame();

    public abstract void rules();

    public void selectGameFormat() {
        System.out.println("Select Game Format!");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        System.out.println("4. IPL");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String format;
        switch (choice) {
            case 1:
                format = "ODI";
                break;
            case 2:
                format = "T20";
                break;
            case 3:
                format = "Test";
                break;
            case 4:
                format = "IPL";
                break;
            default:
                System.out.println();
                System.out.println("Invalid choice, defaulting to T20 format.");
                format = "T20";
                break;
        }
        System.out.println("You selected " + format + " format.");
    }
}



class Cricket extends Game implements GameInfo {
    private Team team1;
    private Team team2;
    public Scanner sc;

    public Cricket() {
        sc = new Scanner(System.in);
        team1 = new Team("Team 1");
        team2 = new Team("Team 2");
    }

    

    public void rules() {
        System.out.println();
        System.out.println("Enter 'N' for No Ball.");
        System.out.println("Enter 'W' for Wicket.");
        System.out.println("Enter 'WD' for Wide Ball.\n");
    }

    public void playGame() {
        int overs = getNumberOfOvers();
        playInnings(team1, overs,Integer.MAX_VALUE);
        System.out.println();
        System.out.println("========== First Inning is Over Score is ==========");
        System.out.println(team1.getTotalRuns() + " / " + team1.getLostWickets());
        System.out.println();

        System.out.println("Second Inning Start\n");
        int target = team1.getTotalRuns() + 1;
        System.out.println("Target : "+target);
        playInnings(team2, overs,target);
        System.out.println("========== Second Inning is Over Score is ==========");
        System.out.println(team2.getTotalRuns() + " / " + team2.getLostWickets());
        System.out.println();

        displayResults(overs);

    }

    public int getNumberOfOvers() {
        System.out.print("Enter Number of Overs: ");
        return sc.nextInt();
    }

    public String getRunsForBall(int ballNumber, String teamName) {
        System.out.print("Enter Runs for " + teamName + ", Ball " + (ballNumber + 1) + ": ");
        return sc.next();
    }

    public void playInnings(Team team, int overs,int target) {

        int totalBalls = overs * 6;

        for (int i = 0; i < totalBalls; i++) {

            String input = getRunsForBall(i, team.getName());

            try {
                switch (input.toUpperCase()) {
                    case "W":
                        team.addWicket();
                        System.out.println("Wicket Down!!");
                        break;
                    case "WD":
                        team.addWide();
                        team.addRuns(1);
                        System.out.println("Wide ball! 1 Run & Ball added.");
                        i--;
                        break;
                    case "N":
                        team.addNoball();
                        team.addRuns(1);
                        System.out.println("No ball! 1 Run & Ball added.");
                        i--;
                        break;
                    default:
                        int runs;
                        try {
                            runs = Integer.parseInt(input);
                            if (runs == 6) {
                                team.addSix();
                            } else if (runs == 4) {
                                team.addfour();
                            }
                        } catch (NumberFormatException e) {
                            throw new InvalidInputException("Invalid Input: Please enter a valid Run.");
                        }
                        if (!team.addRuns(runs)) {
                            throw new InvalidInputException("Invalid run input. Only 0, 1, 2, 3, 4, or 6 allowed.");
                        }
                        break;
                }
                if (team.getTotalRuns() > target) {
                    System.out.println("Team 2 was Win!");
                    break;
                }

                if (team.isAllOut()) {
                    System.out.println("All wickets are fallen for " + team.getName() + "!");
                    break;
                }

                if ((i + 1) % 6 == 0) {
                    System.out.println("Over " + ((i + 1) / 6) + " is Complete!");
                }

            } catch (InvalidInputException e) {     
                System.out.println(e.getMessage());
                i--;
            }
        }
    }

    public void displayResults(int overs) {
        System.out.println("-----------------Match Results-----------------\n");
        System.out.println(team1.getName() + ": " + team1.getTotalRuns() + "/" + team1.getLostWickets());
        System.out.println("Average Runs per Over for" + team1.getName() + ": " + team1.getAverage(overs));
        System.out.println("Total Four : " + team1.getTotalFour());
        System.out.println("Total Sixes : " + team1.getTotalSixes());
        System.out.println("Total Noball : " + team1.getTotalNoball());
        System.out.println("Total Wide : " + team1.getTotalWide());

        System.out.println();
        System.out.println(team2.getName() + ": " + team2.getTotalRuns() + "/" + team2.getLostWickets());
        System.out.println("Average Runs per Over for" + team2.getName() + ": " + team2.getAverage(overs));
        System.out.println("Total Four : " + team2.getTotalFour());
        System.out.println("Total Sixes : " + team2.getTotalSixes());
        System.out.println("Total Noball : " + team2.getTotalNoball());
        System.out.println("Total Wide : " + team2.getTotalWide());

        if (team1.getTotalRuns() > team2.getTotalRuns()) 
        {
            System.out.println("\n" + team1.getName() + " wins!");
        } 
        else if (team2.getTotalRuns() > team1.getTotalRuns()) 
        {
            System.out.println("\n" + team2.getName() + " wins!");
        } 
        else 
        {
            System.out.println("It's a tie!");
        }
    }

    static{
        System.out.println();
        System.out.println("===============================");
        System.out.println("Welcome to Cricket Game!");
    }   

    public static void main(String[] args) {

        Cricket c = new Cricket();

        c.selectGameFormat();

        c.rules();

        c.playGame();

    }
}
