import java.util.Scanner;

public class stack {
    final static int MAX = 50;
    final static int LENGTH = 50;
    static String[] array = new String[MAX];
    static int top = -1;
    static Scanner scanner = new Scanner(System.in);

    static int push() {
        if (top >= MAX - 1) {
            System.out.println("===========  Stack is Overflow  ===========");
            return -1;
        } else {
            System.out.print("\nEnter Word to Add: ");
            String word = scanner.next();
            array[++top] = word;
            System.out.println("Added: " + word);
            return 0;
        }
    }

    static int pop() {
        if (top == -1) {
            System.out.println("===========  Stack is Underflow  ===========");
            return -1;
        } else {
            System.out.println("Undo: " + array[top]);
            array[top--] = null;
            return 0;
        }
    }

    static int display() {
        if (top == -1) {
            System.out.println("Array is empty.");
            return -1;
        }

        System.out.println("\nCurrent Array:");
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Text Editor");
        System.out.println("=============");

        while (true) {
            System.out.println("1. Add a word");
            System.out.println("2. Undo last word");
            System.out.println("3. Display Array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: push(); break;
                case 2: pop(); break;
                case 3: display(); break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}