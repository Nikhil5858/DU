import java.util.Scanner;

public class train {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number Of train : ");
        int numOfTrain = sc.nextInt();

        float[] arrivingtime = new float[numOfTrain];
        float[] departuretime = new float[numOfTrain];

        for (int i = 0; i < numOfTrain; i++) {
            System.out.println("Enter train " + (i + 1) + " Arriving Time : ");
            arrivingtime[i] = sc.nextFloat();
            System.out.println("Enter train " + (i + 1) + " Departure Time : ");
            departuretime[i] = sc.nextFloat();
        }

        float temp, temp1;
        for (int i = 0; i < numOfTrain; i++) {
            for (int j = i + 1; j < numOfTrain; j++) {
                if (arrivingtime[i] > arrivingtime[j]) {
                    temp = arrivingtime[i];
                    arrivingtime[i] = arrivingtime[j];
                    arrivingtime[j] = temp;

                    temp1 = departuretime[i];
                    departuretime[i] = departuretime[j];
                    departuretime[j] = temp1;
                }
            }
        }

        for (int i = 0; i < numOfTrain; i++) {
            System.out.println(arrivingtime[i] + " " + departuretime[i]);
        }

        int count = 0;
        for (int i = 0; i < numOfTrain; i++) {
            for (int j = i + 1; j < numOfTrain; j++) {
                if (departuretime[i] > arrivingtime[j]) {
                    count++;
                }
            }
        }

        System.out.println("Minimum Number Of Platforms Required : " + count);

    }
}