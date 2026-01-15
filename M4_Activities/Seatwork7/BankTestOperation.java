package Activity.M4_Activities.Seatwork7;


@FunctionalInterface
public interface BankTestOperation  {
	
	void execute() throws InvalidAmountException, InsufficientFundsException;
}
