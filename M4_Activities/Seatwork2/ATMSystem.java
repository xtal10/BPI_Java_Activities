package Activity.M4_Activities.Seatwork2;

public class ATMSystem {
	
	
	//array accounts declaration
	private double [] accounts = { 10000, 15000, 20000 };
	
	//processWithdrawal methods
	public void processWithdrawal(String accountIndex, String amountInput)
	 
	 {
		try 
			{
			int accIndex=Integer.parseInt(accountIndex);
			double amtInput=Double.parseDouble(amountInput);
			double newBalance = this.accounts[accIndex]-amtInput;
			System.out.println("Account="+accountIndex+", amount="+amountInput);
			System.out.println("Current balance:₱"+this.accounts[accIndex]);
			
				if (amtInput>this.accounts[accIndex])
					{
						System.out.println("Insufficient funds");
					}
				else 
					{
						System.out.println("New balance: ₱"+(newBalance));
						System.out.println("Withdrawal Succesful!");
					}
				
			}catch(NumberFormatException e)
				{
				//exception handling for invalid number input
					
				System.out.println("Account="+accountIndex+", amount="+amountInput);
			
					System.out.println("Error : Invalid Input!");
					System.out.println("Please Enter valid number.");
				}
			catch(ArrayIndexOutOfBoundsException e)
				{
				//exception handling not existing index in arrays
				System.out.println("Account="+accountIndex+", amount="+amountInput);
					System.out.println("Error : Account not found");
					System.out.println("Invalid account Index.");
				}
			catch(Exception e)
				{
					System.out.println("Transaction failed");
				}
		finally {}
	 }

}
 