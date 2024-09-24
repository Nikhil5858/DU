import java.util.Scanner;

public class VowelCounter {
    private int aCount, eCount, iCount, oCount, uCount;
    private int totalACount, totalECount, totalICount, totalOCount, totalUCount;

    public VowelCounter() {
        aCount = eCount = iCount = oCount = uCount = 0;
        totalACount = totalECount = totalICount = totalOCount = totalUCount = 0;
    }

    public void countVowels() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String sen = sc.nextLine().toLowerCase();

            if (sen.equals("quit")) {
                break;
            }

            aCount = eCount = iCount = oCount = uCount = 0;

            for (char c : sen.toCharArray()) {
                switch (c) {
                    case 'a':
                        aCount++;
                        break;
                    case 'e':
                        eCount++;
                        break;
                    case 'i':
                        iCount++;
                        break;
                    case 'o':
                        oCount++;
                        break;
                    case 'u':
                        uCount++;
                        break;
                }
            }

            System.out.println("Vowel counts for sentence:");
            System.out.println("A: " + aCount);
            System.out.println("E: " + eCount);
            System.out.println("I: " + iCount);
            System.out.println("O: " + oCount);
            System.out.println("U: " + uCount);

            totalACount += aCount;
            totalECount += eCount;
            totalICount += iCount;
            totalOCount += oCount;
            totalUCount += uCount;
        }

        System.out.println("\nTotal vowel counts:");
        System.out.println("A: " + totalACount);
        System.out.println("E: " + totalECount);
        System.out.println("I: " + totalICount);
        System.out.println("O: " + totalOCount);
        System.out.println("U: " + totalUCount);
        sc.close();
    }

    public static void main(String[] args) {
        VowelCounter vc = new VowelCounter();
        vc.countVowels();
    }
}
