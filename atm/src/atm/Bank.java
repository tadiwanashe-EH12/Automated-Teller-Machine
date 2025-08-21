package atm;
import java.util.ArrayList;
import java.util.Random;

public class Bank {

	private String name;
	private ArrayList <User> users;
	private ArrayList <Account> accounts;
	
	/*
	 * Generate a new universally unique ID for each user
	 * @return the uuid 
	 * */
	
	public String getNewUserUUID() {
//		initialize
		String uuid;
		
		Random rng = new Random(); 
		int len = 6;
		boolean nonUnique ;
		
//		continue looping until we get a unique ID
		do {
			
//			generate the number 
			uuid = "";
			
			for(int c=0; c<len; c++) {
				uuid += ((Integer)rng.nextInt(10)).toString();
			}
			
//			check to make sure its unique 
			nonUnique = false;
			for(User u : this.users) {
				if(uuid.compareTo(u.getUUID()) == 0{
					nonUnique = true;
					break;
				}
			}
		}
		while (nonUnique);
		
		return uuid;
	}
	/*
	 * Generate a new universally unique ID for an account
	 * @return the uuid
	 * */
	public String getNewAccountUUID() {
		
//	 initialize
	String uuid;
	
	Random rng = new Random(); 
	int len = 10;
	boolean nonUnique ;
	
//		continue looping until we get a unique ID
	do {
		
//			generate the number 
		uuid = "";
		
		for(int c=0; c<len; c++) {
			uuid += ((Integer)rng.nextInt(10)).toString();
		}
		
//			check to make sure its unique 
		nonUnique = false;
		for(Account a : this.accounts) {
			if(uuid.compareTo(a.getUUID()) == 0{
				nonUnique = true;
				break;
			}
		}
	}
	while (nonUnique);
	
	return uuid;
	}
	/*
	 *  Add an account
	 * @param anAcct  the account to add
	 * */
	public void addAccount(Account anAcct){
		this.accounts.add(anAcct);
	}
	/*
	 * Create a new user for the Bank
	 * @param firstName  the user's first name
	 * @param lastName  the user's last name
	 * @param pin   the user's pin
	 * @return  the new user object
	 * */
public User addUser(String firstName, String lastName, String pin) {
	
//		create a new user object and add it to our list
	User newUser = new User(firstName, lastName, pin, this);
	this.users.add(newUser);
	
//	create a savings account for the user and add to User and Bank accounts Lists
	Account newAccount = new Account("Savings", newUser, this);
	newUser.addAccount(newAccount);
	this.accounts.add(newAccount);
	
	return newUser;
	}
}
