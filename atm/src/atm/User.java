package atm;
import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {

//	The first name of the user 
	private String firstName;
	
//	The last name of the user
	private String lastName;
	
//	The id of the user
	private String uuid;
	
//	The MD5 hash of the user's pin number
	private byte pinHash[];
	
//	The list of accounts of the user
	private ArrayList <Account> accounts;
	
	public User (String firstName, String lastName, String pin, Bank theBank) {
		
//		set user's name
		this.firstName = firstName;
		this.lastName = lastName;
		
//		store pin as MD5 hash not as plain text for security
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			this.pinHash = md.digest(pin.getBytes());
		} catch (NoSuchAlgorithmException e) {
			System.err.println("error, caught NoSuchAlgorithmException");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
