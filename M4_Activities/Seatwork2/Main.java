package Activity.M4_Activities.Seatwork2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMSystem atmsystem = new ATMSystem();
		
		System.out.println("");
		System.out.println("=== ATM Withdrawal System ===\n");
		System.out.println("--- Test 1: Valid Withdrawal ---");
		atmsystem.processWithdrawal("1", "5000");
		System.out.println("\n--- Test 2: Invalid Account Index ---");
		atmsystem.processWithdrawal("abc", "5000");
		System.out.println("\n--- Test 3: Account Not Found ---");
		atmsystem.processWithdrawal("10", "5000");
		System.out.println("\n--- Test 4: Insufficient Funds ---");
		atmsystem.processWithdrawal("1", "20000");
		
		System.out.println("\n=== All tests completed! ===");
	}

}
