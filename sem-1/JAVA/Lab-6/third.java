class Bank_Account{
    int accountno;
    String username;
    String email;
    String accounttype;
    double accountbalance;
    
    public Bank_Account(int accountno,String username,String email,String accounttype,double accountbalance){
        this.accountno = accountno;
        this.username = username;
        this.email = email;
        this.accounttype = accounttype;
        this.accountbalance = accountbalance;
    }

    public void displayaccountdetails(){
        System.out.println("\nAccount Details:");
        System.out.println("Account No : "+accountno);
        System.out.println("Username   : "+username);
        System.out.println("Email      : "+email);
        System.out.println("Account Type : "+accounttype);
        System.out.println("Account Balance : "+accountbalance);
    }
}

public class third {
    public static void main(String[] args) {
        Bank_Account b1 = new Bank_Account(1001, "Abc", "abc@gmail.com", "saveing", 10000);
        Bank_Account b2 = new Bank_Account(1002, "Xyz", "xyz@gmail.com", "current", 200251);
        // b1.getaccountdetails();
        b1.displayaccountdetails();
        b2.displayaccountdetails();
    }
}
