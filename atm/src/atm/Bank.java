package atm;
import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList <User> user;
	private ArrayList <Account> accounts;
	
	public String getNewUserUUID() {
		
	}
	public String getNewAccountUUID() {
		
	}
	/*
	 * Add an account
	 * @param anAcct  the account to add
	 * */
	public void addAccount(Account anAcct) {
		this.accounts.add(anAcct);
	}
}
