package Activity.M4_Activities.Seatwork4;

public class Main {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		
		AccountValidator accountvalidor = new AccountValidator();
		
		
		try {
		accountvalidor.validateAccountNumber("1234567890");
		
		}catch(Exception e) {
			 System.out.println(e.getMessage());
		}try {
			accountvalidor.validateAccountNumber("123");
			
		}catch(Exception e) {
			 System.out.println(e.getMessage());
		}try {
			accountvalidor.validateAccountNumber(null);
		}catch(Exception e) {
			 System.out.println(e.getMessage());
		}
		/*catch(NullPointerException e)
		{
			System.out.println(e.getMessage());

		}
		catch(Exception e) {
			 System.out.println(e.getMessage());

		}*/

	}
	
		}
	
