import java.util.*;

class student {
    String[] sub = {"java", "dbms", "wt", "foa"};
    int[] subject_credit = {6, 5, 5, 6}; 
    public int id_no;
    public int[] marks;
    public double spi;

    public student(int id_no) {
        this.id_no = id_no;
        this.marks = new int[sub.length];
    }

	public int calculateGradePoint(int marks) {
		if (marks >= 90) return 10;
		else if (marks >= 80) return 9;
		else if (marks >= 70) return 8;
		else if (marks >= 60) return 7;
		else if (marks >= 50) return 6;
		else if (marks >= 40) return 5;
		else return 0; // Fail
	}

    public void calculateSPI() {
        double totalPoints = 0;
        int totalCredits = 0;
        
        for (int i = 0; i < sub.length; i++) {
            int gradePoint = calculateGradePoint(marks[i]);
            totalPoints += gradePoint * subject_credit[i];
            totalCredits += subject_credit[i];
        }
        
        spi = totalPoints / totalCredits;
    }

}

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s = new student(1);
        System.out.println("Enter Marks for the Student:");
        
        for (int j = 0; j < s.sub.length; j++) {
            System.out.print("Enter Marks for Subject " + s.sub[j] + ": ");
            s.marks[j] = sc.nextInt();
        }

        s.calculateSPI(); 

        System.out.println("Student SPI: " + s.spi);
    }
}
