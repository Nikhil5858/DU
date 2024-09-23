import java.util.Scanner;

public class ConstrutCallByRef {

    int hr,min,sec,total;

    public ConstrutCallByRef(int hr,int min,int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        System.out.println("Object was Created");
    }

    public void add(ConstrutCallByRef cr){
        int totalsec = (this.hr *3600 + this.min*60 + this.sec) + (cr.hr *3600 + cr.min*60 + cr.sec);
        this.hr = totalsec / 3600;
        this.min = (totalsec % 3600) / 60;
        this.sec = totalsec % 60;
    }
    
    public void getter(){
        System.out.println("Hour : "+hr);
        System.out.println("Min : "+min);
        System.out.println("Seconds : "+sec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Time : ");  
        System.out.println("Hour: ");
        int hr1 = sc.nextInt(); 
        System.out.println("Min: ");
        int min1 = sc.nextInt(); 
        System.out.println("Sec: ");
        int sec1 = sc.nextInt(); 

        ConstrutCallByRef c1 = new ConstrutCallByRef(hr1,min1,sec1);
        c1.getter();

        System.out.println("Enter Second Time : ");
        System.out.println("Hour: ");
        int hr2 = sc.nextInt(); 
        System.out.println("Min: ");
        int min2 = sc.nextInt(); 
        System.out.println("Sec: ");
        int sec2 = sc.nextInt(); 

        ConstrutCallByRef c2 = new ConstrutCallByRef(hr2,min2,sec2);
        c2.getter();

        c1.add(c2);
        System.out.println("\nTotal Time : ");
        c1.getter();

        sc.close();
    }
}
