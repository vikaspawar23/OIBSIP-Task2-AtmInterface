import java.util.*;
public class AtmInterface {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // defining initial balance as 5000
        double bal = 5000;

        System.out.println("**** Welcome To The ATM ****");

        while (true) 
        {
            // Options for operations 
            
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
	        System.out.println("4. Transfer");
            System.out.println("5. Quit");

            System.out.print("Select a Option : ");
            int choice = sc.nextInt();

            switch (choice) {

                // Case 1 for transation history

                case 1:
		            System.out.println("Last transaction is on dd/mm/yyyy");
                    System.out.println("Your balance is $" + bal);
                    break;

                // Case 2 for Withdraw 

                case 2:
                    System.out.print("Enter amount for withdraw : ");
                    double amountToWithdraw =  sc.nextDouble();

                    if (amountToWithdraw > bal) 
                    {
                        System.out.println("Sorry ...! Insufficient balance...");
                    }
                    else 
                    {
                        bal -= amountToWithdraw;
                        System.out.println("Please Collect Your Cash");
                    }
                    break;

                // Case 3 for Deposit

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double amountToDeposit = sc.nextDouble();
                    bal += amountToDeposit;
                    System.out.println("$" + amountToDeposit + " has been deposited into your account.");
                    break;

                // Case 4 for Amount Transfer

			  case 4:
				  System.out.println("Enter the account number which you are willing to transfer");
				  long bnum= sc.nextLong();
				  System.out.println("Enter the required amount ");
				  double amountToTransfer = sc.nextDouble();
			      bal = bal-amountToTransfer;
				  System.out.println("Amount is transferred Succesfully to Account No :- "+bnum);
				  System.out.println("Your current balance is "+bal);
				  break;

                // Case 5 for exit

                case 5:
                    System.out.println("**** Thanks for using the ATM! ****");
                    return;
                
                // Default msg if user selects invalid option
                
                default:
                    System.out.println("Sorry ! Invalid Option Selected ...!");
                    break;
            }
            // sc.close();
        }
    }
}