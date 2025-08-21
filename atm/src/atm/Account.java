package atm;
import java.util.ArrayList;

public class Account {

//	the name of the account
	private String name;
	
//	The current ID number
	private String uuid;
	
//	The user object that owns the account 
	private User holder;
	
// The transaction list for the account 
	private ArrayList<Transaction> transactions;
	
	/*
	 * Create new user
	 * @param name the name of the account
	 * @param holder the user object that holds this account
	 * @param theBank the bank issues the account
	 * */
	public Account(String name, User holder, Bank theBank) {
		
//		set the account name and holder
		this.name = name;
		this.holder = holder;
		
//		get new account UUID
		this.uuid = theBank.getNewAccountUUID();
		
//		initialize transactions
		this.transactions = new ArrayList<Transaction>();
		
//		add to holder and bank list
		holder.addAccount(this);
		theBank.addAccount(this);
		
	}
	/*
	 * Get account ID
	 * @return the uuid
	 * */
	public String getUUID() {
		return this.uuid;
	}
}
