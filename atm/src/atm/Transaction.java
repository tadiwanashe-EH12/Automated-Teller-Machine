package atm;
import java.util.Date;
public class Transaction {

//	The amount of this transaction
	private double amount;
	
//	The time and date of the transaction
	private Date timestamp;
	
//	a memo of the transaction
	private String memo;
	
//The account in which the transaction was performed 
	private Account inAccount;
	
	public Transaction(double amount, Account inAccount) {
		this.amount = amount;
		this.inAccount = inAccount;
		this.timestamp = new Date();
		this.memo = "";
	}
	public Transaction(double amount, String memo, Account inAccount) {
//		call the two Arg constructor first
		this(amount, inAccount);
	}
}
