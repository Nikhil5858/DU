import java.util.Scanner;

public class cricket {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Number Of Over You Want to play : ");
        System.out.println("Press -1 to wicket : ");

        int overs = sc.nextInt();
        int totalballs = overs * 6;
        int lostwicket = 0;
        int totalruns = 0;

        int[] runsinoneball = new int[totalballs];

        for(int i = 0;i<totalballs;i++){

            int runs;

            while (true) {
                System.out.println("Enter runs for ball " + (i + 1));
                runs = sc.nextInt();
                if (runs == 1 || runs == 2 || runs == 4 || runs == 6 || runs == -1) {//run>=0&&run<=6
                    break;
                }
                else{
                    System.out.println("Invalid input!");
                }
            }

            if (runs == -1) {
                lostwicket++;
                System.out.println("Wicket Down!!");
            }else{
                totalruns +=runs;
                runsinoneball[i] =runs;
            }

            if (lostwicket == 10) {
                System.out.println("All Wicket are Fallen!!!");
                break;
            }
            if ((i + 1)%6 == 0) {
                System.out.println("Over " + ((i + 1) / 6) + " is complete.");
            }

        }

        double avgperover = totalruns / overs;

        System.out.println("-------- Game Results --------");
        System.out.println("Total Runs : "+totalruns);
        System.out.println("Total Wickets : "+lostwicket);
        System.out.println("Average per Over : "+avgperover);
        sc.close();
    }
}
