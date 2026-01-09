package Activity.M4_Activities.Seatwork4;

public class AccountValidator {
	
	public void validateAccountNumber(String accountNumber) throws Exception

		{
			if(accountNumber==null)
				{
					//System.out.println("Error:Cannot be null");
					
				throw new NullPointerException("Error: Cannot be null");

				}
			else if (accountNumber.length()!=10)
				{
				//System.out.println("Error: Must be 10 digits");
				throw new Exception("Error: Must be 10 digits");
				}
			else  
				{
				System.out.println("Valid account:"+accountNumber);
				}
		}

}
