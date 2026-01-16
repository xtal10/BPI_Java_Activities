package Activity.M4_Activities.Seatwork9.exception;

public class InvalidAccountException extends Exception {
	
    public InvalidAccountException(String message) {
        super(message);
    }
    
    public InvalidAccountException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
