import java.util.*;

class constcallref{
    int hr,min,sec,total;

    public constcallref(int hr,int min,int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void getter(){
        System.out.println("Hour : "+hr);
        System.out.println("Minute : "+min);
        System.out.println("Second : "+sec);
    }

    public void add(constcallref cf){
        int totalsec = (this.hr*3600 + this.min*60 + this.sec) + (cf.hr*3600 + cf.min*60 + cf.sec);
        this.hr = totalsec/3600;
        this.min = (totalsec % 3600)/60;
        this.sec = totalsec % 60;
    }
}

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Time : ");
        System.out.println("Enter Hour :   ");
        int hr1 = sc.nextInt();
        System.out.println("Enter Minute : ");
        int min1 = sc.nextInt();
        System.out.println("Enter Second : ");
        int sec1 = sc.nextInt();

        constcallref cr1 = new constcallref(hr1,min1,sec1);
        // cr1.getter();

        System.out.println("Enter Second Time : ");
        System.out.println("Enter Hour : ");
        int hr2 = sc.nextInt();
        System.out.println("Enter Minute : ");
        int min2 = sc.nextInt();
        System.out.println("Enter Second :");
        int sec2 = sc.nextInt();

        constcallref cr2 = new constcallref(hr2,min2,sec2);
        // cr2.getter();

        cr1.add(cr2);

        System.out.println();
        cr1.getter();
        sc.close();
    }
}