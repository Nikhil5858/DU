import java.util.*;
class student 
{
	String[] sub = {"java", "dbms", "wt", "foa"};
	int[] subject_credit = {6, 5, 5, 6};
	public int id_no;
	public int no_of_subject_registered;
	public String subject_code;
	public char grde_obtained;
	public float spi;
	public double totalcredits;
	public double sumpoints;
	int[] marks;

	public student(int id_no) {
		this.id_no = id_no;
		this.marks = new int[sub.length];
	}
}

public class First
 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        student[] s = new student[size];
		
        for (int i = 0; i < s.length; i++) {
            s[i] = new student(i + 1);
            System.out.println("Enter Marks for Student " + (i + 1) + ":");
            for (int j = 0; j < s[i].sub.length; j++) {
                System.out.println("Enter Marks for Subject " + s[i].sub[j] + ": ");
                s[i].marks[j] = sc.nextInt();
            }
        }
		
        for (int i = 0; i < s.length; i++) {
			System.out.println("Student " + (i + 1) + " Marks:");
            for (int j = 0; j < s[i].sub.length; j++) {
				System.out.println(s[i].sub[j] + ": " + s[i].marks[j]);
            }
        }
    }
}

