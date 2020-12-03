/* This project was collaborated on by Neil, Altaf, Aibek */

package validationemailproject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Email {
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Email(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return  emailAddress  ;
	}
	public static final String regex = "^([A-Za-z0-9\\-_.]+)@(.+)$";
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Pattern pattern = Pattern.compile(regex);
		int ctr = 0;
		while(ctr != 1) {
		System.out.println("Pease enter an email ID ");
		String emailID=scanner.nextLine().toLowerCase();
		System.out.println(emailID);
		Matcher matcher =pattern.matcher(emailID);
		String valid=(matcher.matches() ? "valid" : "invalid");
		System.out.println("\nThe email is " + emailID +" "+ valid);
		List<Email> emailList = new ArrayList<Email>();
		emailList.add(new Email("altafmquadri@gmail.com"));
		emailList.add(new Email("ozhorov@gmail.com"));	
		if(valid.equals("valid"))
		System.out.println(emailList.toString().contains(emailID) ?"\nThe email ID exists\n" : "\nEmail not found!");
		System.out.println("Do you want to search again? y/n");
		String n = scanner.nextLine().toLowerCase();		
		if(n.equals("n"))
			ctr++;
		}
		//for (Email email : emailList) {	
			//if(emailID.contains(email.toString()))
			//Matcher matcher =pattern.matcher(email.toString());
			//System.out.println("The email is " + email + (matcher.matches() ? " valid" : " invalid"));
			//System.out.println(email);
	}
}