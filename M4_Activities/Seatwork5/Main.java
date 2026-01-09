package Activity.M4_Activities.Seatwork5;

public class Main {

	public static void main(String[] args) throws InvalidAccountFormatException, InvalidAccountNumberException {
		// TODO Auto-generated method stub
		AccountValidator accvalidator = new AccountValidator();
		
		//System.out.println("Test 1");
		accvalidator.testValidation("1 : Valid account", "1234567890");
		//System.out.println("");
		accvalidator.testValidation("2 : Too short", "123");
		accvalidator.testValidation("3 : Contains letters", "12345ABC90");
		accvalidator.testValidation("4 : Contains space", "1234 567890");
		accvalidator.testValidation("5 : Null value", null);
	}
	

}
