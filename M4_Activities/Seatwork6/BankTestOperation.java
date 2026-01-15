package Activity.M4_Activities.Seatwork6;


@FunctionalInterface
public interface BankTestOperation  {
	
	void execute() throws InvalidAmountException, InsufficientFundsException;
}
