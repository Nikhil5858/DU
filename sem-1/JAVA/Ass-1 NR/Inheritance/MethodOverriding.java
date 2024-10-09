class Bank{

    int getRateofInterest(){
        return 0;
    }
}

class sbi extends Bank{

    int getRateofInterest(){
        return 8;
    }
}

class icici extends Bank{

    int getRateofInterest(){
        return 7;
    }
}

class axix extends Bank{

    int getRateofInterest(){
        return 9;
    }
}

public class MethodOverriding {
    
    public static void main(String[] args) {
        
        Bank s = new sbi();
        Bank i = new icici();
        Bank a = new axix();

        System.out.println("Sbi RateofInterest : "+s.getRateofInterest()+" %");
        System.out.println("icici RateofInterest : "+i.getRateofInterest()+" %");
        System.out.println("axix RateofInterest : "+a.getRateofInterest()+" %");
    }
}
