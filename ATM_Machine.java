import java.util.Scanner;

public class ATM_Machine {
    static int withdraw(float w_amt,float amt){
        
        if(w_amt>amt){
            System.out.println("THE INSUFICIENT BALANCE.");
            return 0;
        }
        else {
            //code for limit transaction and withdraw operation
            if(w_amt<30000){
            amt-=w_amt;
             System.out.println("..............................");
            System.out.println("The Withdraw is Succesful.");
            System.out.println("The Available Balance:"+amt);
            System.out.println("..............................");
            }
            else{
                System.out.println("............................................................");
                System.out.println("THE WITHDRAW AMOUNT IS LARGE AND YOU CANNOT WITHDRAW AMOUNT.");
                System.out.println("PLEASE MAKE SURE YOU HAVE WITHDRWA AMOUNT LESS THAN 30,000");
                System.out.println("............................................................");

            }


        }
        return 0;

    }

    static void deposit(float d_amt,float amt){
        float interest;
        //code for if deposit amount is  high the tax has to pay
        if(d_amt>=100000){
            interest=d_amt/100;
            amt+=(d_amt-interest);}
            
        else{
            amt+=d_amt;
           
        }
            System.out.println("..............................");
            System.out.println("Deposit is Auccesful.");           
            System.out.println("The Available Aalance:"+amt);
            System.out.println("..............................");
            

    }
    static void check_balance(float amt ){
       
        

        System.out.println(".................................");
        System.out.println("The Available Balance:"+amt);
        System.out.println(".................................");
    }
    
    public static void main(String[] args){

        float amount=1000000;
        float deposit;
        float withdraw_amt;
        int n;
        Scanner sc=new Scanner(System.in);
         System.out.println("WELCOME YOU AND HOW CAN I HELP YOU...!");
         System.out.println();
         
         //the belove code repeat untill input become false
       
        System.out.println("1.Withdraw.");
        System.out.println("2.Deposit.");
        System.out.println("3.Check balance.");
        
        System.out.println("Enter the number which you want to do:");
        n=sc.nextInt();


        switch(n){
            case 1:
            System.out.println("The totale amount in your account:"+amount);
            System.out.println("Enter the withdraw amount:");
            withdraw_amt=sc.nextFloat();
            withdraw(withdraw_amt, amount);
            System.exit(0);
            break;

            case 2:
            System.out.println("Enter the deposit amount:");
            deposit=sc.nextFloat();
            deposit(deposit,amount);
            System.exit(0);
            break;

            case 3:
           check_balance(amount);
           System.exit(0);
           break;

          
           default:System.out.println("The invalid choice number and enter the correct choice.");

        }
        System.out.println("The invalid choice number and enter the correct choice.");

    }
}

