import java.util.*;
class Account{

    int accno;
    double my_balance;

    Account(int accno){
        this.accno = accno;
        this.my_balance = 1000;
    }

    double deposit(double amt){
        my_balance = my_balance + amt; 
        return my_balance;
    }

    double withdraw(double amt){

        try{
            if (amt > my_balance) {
                System.out.println("Insuficient balance");
            }
            else if(my_balance - amt < 1000){
                throw new Exception("Cannot Withdraw below 1000 Amount!");
            }
            else{
                my_balance = my_balance - amt;
            }
            
        }catch(Exception e){
            System.out.println("Inside Catch Exception : " + e.toString());
        }
        return my_balance;
    }

    double checkBalance(){
        return my_balance;
    }
    
    void exit(){
        System.exit(0);
    }
}

public class BankManagement {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Account ac = new Account(101);

        
        while (true) {
            System.out.println("======= Bank Management System =======");
            System.out.println("Enter 1 to Deposite Balance\nEnter 2 to Withdraw Balance\nEnter 3 to Check Balance\nEnter 4 to exit");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Amount to Deposite : ");
                    double depositamt = sc.nextDouble();
                    ac.deposit(depositamt);
                    System.out.println("Updated Balance : "+ac.my_balance);
                break;
                
                case 2:
                    System.out.println("Enter Amount to Withdraw : ");
                    double withdrawamt = sc.nextDouble();
                    ac.withdraw(withdrawamt);
                    System.out.println("Updated Balance : "+ac.my_balance);
                break;

                case 3:
                    System.out.println("Your balance is : " + ac.checkBalance());
                break;

                case 4:
                    ac.exit();
                break;

                default:System.out.println("Invalid Choice Please Try Again!");
                    break;
            }
        }
    }

}