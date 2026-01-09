package Activity.M4_Activities.Seatwork5;


public class AccountValidator {
	
	
	
	public void validateAccountNumber(String accountNumber) throws InvalidAccountFormatException , InvalidAccountNumberException 
		{
		
		if (accountNumber==null)
			{
			throw new NullPointerException("Account number cannot be null\n");
			}
		
		for (char c : accountNumber.toCharArray())
			{
				if(!Character.isDigit(c)) 
					{
						throw new InvalidAccountFormatException("Account number must contain only digits\n");
					}
			}
		
		 if (accountNumber.length()!=10)
				{
				throw new InvalidAccountNumberException("Account number must be exactly 10 digits\n");
				}
		else 
			{
				System.out.println("Valid account number:"+accountNumber+"\n");
			}
		}
	
	public void testValidation(String testName, String accountNumber) throws InvalidAccountFormatException , InvalidAccountNumberException
		{
		
			try {
				
			
					
				System.out.println("Test "+testName+" ("+accountNumber+")");
				validateAccountNumber(accountNumber);
					
				
			}
				
			catch(InvalidAccountFormatException e)
			{
				
				
				System.out.println("Warning:"+e.getMessage());
				
			}
			catch(InvalidAccountNumberException e)
				{
				System.out.println("Error:"+e.getMessage());
				}
			catch(NullPointerException e)
				{
				
				System.out.println("Warning:"+e.getMessage());
				}
		}
	
}
