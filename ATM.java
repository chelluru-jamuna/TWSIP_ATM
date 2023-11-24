import java.util.Scanner;
public class ATM {
    public static void main(String args[]){
        int balance=50000,withdraw,deposit;
        System.out.println("ATM Machine");
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice");
            System.out.println("Choose 1 for Withdraw\nChoose 2 for Deposit\nChoose 3 for Check Balance\nchoose 4 for Exit\n");
            System.out.println("Choose your operation:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter the Amount to withdraw :");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw){
                        balance=balance-withdraw;
                        System.out.println("Your Balance after Withdraw :"+balance);
                    }else{
                        System.out.println("Your withdraw amount is greater than balance");
                    }
                }
                break;
                case 2:{
                    System.out.println("Enter Amount to deposit:");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Your balance after deposit : "+balance);
                }
                break;
                case 3:{
                    System.out.println("Balance :"+balance);
                }
                break;
                case 4:{
                    System.exit(0);
    
                }
                default:System.out.println("Invalid choice ");
            }
        }
    }

}
