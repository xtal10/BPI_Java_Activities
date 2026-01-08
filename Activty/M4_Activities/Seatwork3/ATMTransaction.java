package Activty.M4_Activities.Seatwork3;

public class ATMTransaction {

		//CheckBalance methods
	public void checkBalance(String accountNumber, double balance)
	{
		try 
			{
				System.out.println("Processing balance inquiry...");
				char accountType = accountNumber.charAt(0);
				int accnum=Integer.parseInt(accountNumber);
				
				
				if (accountType=='1') 
					{
						System.out.println("Account Type: Savings");
					}
				else if (accountType=='2')
					{
					System.out.println("Account Type: Checking");
					}
				else 
					{
					System.out.println("Account Type: Unknown");
					}
				System.out.println("Account Number: " + accountNumber);
				System.out.println("Current Balance: ₱" + balance);
				System.out.println("Balance inquiry successful!");
			}catch (NumberFormatException e)
					{
						//exceptions handling for invalid number input
						System.out.println("Error: Invalid account number format! Account numbers must be numeric.");
					}
			catch(StringIndexOutOfBoundsException e)
					{
						//exceptions handling for empty account number and invalid
						System.out.println("Error: Account number is empty or invalid!");
					}
		finally
			{
				System.out.println("");
				System.out.println("\n========== RECEIPT ==========");
				System.out.println("Transaction Date: December 3, 2025");
				System.out.println("Transaction Type: Balance Inquiry");
				System.out.println("ATM Location: Main Branch");
				System.out.println("Thank you for banking with us!");
				System.out.println("==============================\n");
			}
		
	}
}
