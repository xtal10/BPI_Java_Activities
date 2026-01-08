package Activity.M4_Activities.Seatwork1;

public class BankAccount {
	
	private String accountName;
	private String accountNumber;
	
	public void setAccountnumber(String accountNumber) 
	{
		this.accountNumber=accountNumber;
	}
	
	public String getAccountName(String accountNumber)
	{
		
		if (this.accountNumber=="ACC-001") 
			{
				this.accountName="Juan Dela Cruz";
			}
		else if (this.accountNumber=="ACC-002")
			{
				this.accountName="Maria Santos";
			}
		else 
			{
				this.accountName=null;
			}
		return this.accountName;
	}

	
}

