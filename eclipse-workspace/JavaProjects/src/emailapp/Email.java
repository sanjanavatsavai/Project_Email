package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defualtPasswordLength =10;
	private String email;
	private String department;
	private int mailCapacity = 250;
	private String alternateEmail;
	private String companySuffix = "outlook.com";
	
	//constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//department
		this.department = setDepartment();
		
		//password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("your password is : "+this.password);
		//email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
	}
	
	//creating method for department
	private String setDepartment() {
		System.out.println("Department codes\n 1 for sales\n 2 for dev\n 3 for marketing\n 0 for none\n Please Enter your department code : ");
		Scanner sc = new Scanner(System.in);
		int deptCode = sc.nextInt();
		if(deptCode==1) {return "sales";}
		else if(deptCode==2) {return "dev";}
		else if(deptCode==3) {return "marketing";}
		else {return "";}
	}
	
	//generating random password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length];
			for(int i=0;i<length;i++) {
				int random = (int) (Math.random()*passwordSet.length());	
				password[i] = passwordSet.charAt(random);
						
			}
			return new String(password);
			
			
		}
		
		//set mail box capacity
		public void setMailboxCapacity(int capacity) {
			this.mailCapacity = capacity;
		}
		
		//alternate email
		
		public void setAlternateEmail(String alternateEmail) {
			this.alternateEmail = alternateEmail;
		}
		
		//change password 
		public void changePassword(String password) {
			this.password = password;
		}
		
		public int getMailboxCapacity() {
			return mailCapacity;
		}
		
		public String getAlternateEmail() {
			return alternateEmail;
		}
		
		public String getPassword() {
			return password;
		}
		
		
		public String showInfo() {
			return "DISPLAY NAME : " + firstName + " " + lastName +
					"\nCOMPANY EMAIL : " + email + 
					"\nMAIL CAPACITY : "+ mailCapacity + "mb";
		}
	

}
