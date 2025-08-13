package atm;
import java.util.ArrayList;

public class Account {

//	the name of the account
	private String name;
	
//	the current balance of the account
	private double balance;
	
//	The current ID number
	private String uuid;
	
//	The user object that owns the account 
	private User holder;
	
// The transaction list for the account 
	private ArrayList<Transaction> transactions;
	
}
