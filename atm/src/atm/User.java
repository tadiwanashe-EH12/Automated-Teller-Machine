package atm;
import java.util.ArrayList;

public class User {

//	The first name of the user 
	private String userName;
	
//	The last name of the user
	private String lastName;
	
//	The id of the user
	private String uuid;
	
//	The MD5 hash of the user's pin number
	private byte pinHash[];
	
//	The list of accounts of the user
	private ArrayList <Account> accounts;
	
}
