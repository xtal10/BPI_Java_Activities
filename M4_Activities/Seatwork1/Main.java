package Activity.M4_Activities.Seatwork1;

import Activity.M3_Activities.Group_Activity_List.Library;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===Bank Account Name Display\n");
		testCase("ACC-001");
		testCase("ACC-999");
		System.out.println("===Program Completed successfully!===");
		
	}
	//testCase Methods
	public static void testCase(String accountNumber)
	{
		BankAccount bankacc= new BankAccount();
		bankacc.setAccountnumber(accountNumber);
		
		System.out.println("Looking up account :"+accountNumber);
		
		//
		try 
			{
				String name=bankacc.getAccountName(accountNumber);
				//;
				System.out.println("Account holder:"+name.toUpperCase()+"\n");
				
			}catch(NullPointerException e)
				{
					//exception handling for null value 
					System.out.println("Error:Account not found\n");
				} 
		
		
		
		finally {
				
		}
		
		
		
		
		//System.out.println("Account holder:");
		
	}

}