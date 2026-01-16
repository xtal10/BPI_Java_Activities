package Activity.M4_Activities.Seatwork8;


@FunctionalInterface
public interface BankTestOperation  {
	
	void execute() throws InvalidAmountException, InsufficientFundsException;
}
