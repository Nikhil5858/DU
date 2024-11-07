import java.util.Scanner;

class Team {
    private String name;
    private int totalRuns;
    private int lostWickets;

    public Team(String name) {
        this.name = name;
        this.totalRuns = 0;
        this.lostWickets = 0;
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

    public boolean addRuns(int runs) {
        if (runs == 1 || runs == 2 || runs == 3 || runs == 4 || runs == 6) {
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
}

class Cricket {
    private Team team1;
    private Team team2;
    public Scanner sc;

    public Cricket() {
        sc = new Scanner(System.in);
        team1 = new Team("Team 1");
        team2 = new Team("Team 2");
    }

    public void welcomeMessage() {
        System.out.println();
        System.out.println("===============================");
        System.out.println("Welcome to Cricket Game!");
    }

    public void selectGameFormat() {
        System.out.println("Select Game Format!");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        System.out.println("4. IPL");
        
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
                System.out.println("Invalid choice, defaulting to T20 format.");
                format = "T20";
        }
        System.out.println("You selected " + format + " format.");
    }

    public int getNumberOfOvers() {
        System.out.print("Enter Number of Overs: ");
        return sc.nextInt();
    }

    public void playInnings(Team team, int overs) {
        int totalBalls = overs * 6;
        for (int i = 0; i < totalBalls; i++) {
            String input = getRunsForBall(i, team.getName());

            switch (input.toUpperCase()) {
                case "W":
                    team.addWicket();
                    System.out.println("Wicket Down!!");
                    break;
                case "WD":
                case "N":
                    team.addRuns(1);
                    System.out.println(input.equals("WD") ? "Wide ball! 1 Run & Ball added." : "No ball! 1 Run & Ball added.");
                    i--;
                    break;
                default:
                    int runs;
                    try {
                        runs = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Input");
                        i--; 
                        continue;
                    }
                    if (!team.addRuns(runs)) {
                        i--; 
                    }
                    break;
            }

            if (team.isAllOut()) {
                System.out.println("All wickets are fallen for " + team.getName() + "!");
                break;
            }
        }
    }

    public String getRunsForBall(int ballNumber, String teamName) {
        System.out.print("Enter runs for " + teamName + ", Ball " + (ballNumber + 1) + ": ");
        return sc.next();
    }

    public void displayResults() {
        System.out.println("-----------------Match Results-----------------\n");
        System.out.println(team1.getName() + ": " + team1.getTotalRuns() + "/" + team1.getLostWickets());
        System.out.println(team2.getName() + ": " + team2.getTotalRuns() + "/" + team2.getLostWickets());
        if (team1.getTotalRuns() > team2.getTotalRuns()) {
            System.out.println("\n"+team1.getName() + " wins!");
        } else if (team2.getTotalRuns() > team1.getTotalRuns()) {
            System.out.println("\n"+team2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        Cricket c = new Cricket();
        c.welcomeMessage();
        c.selectGameFormat(); 
        int overs = c.getNumberOfOvers(); 
        c.playInnings(c.team1, overs);
        System.out.println();
        System.out.println("========== First Inning is Over Score is ==========");
        System.out.println(c.team1.getTotalRuns() + " / " + c.team1.getLostWickets());
        System.out.println();
        System.out.println("Second Inning Start\n");
        c.playInnings(c.team2, overs);
        System.out.println("========== Second Inning is Over Score is ==========");
        System.out.println(c.team2.getTotalRuns() + " / " + c.team2.getLostWickets());
        System.out.println();
        c.displayResults();
    }
}
