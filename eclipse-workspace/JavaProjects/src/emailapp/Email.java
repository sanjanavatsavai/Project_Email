package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defualtPasswordLength =10;
	private String department;
	private int mailCapacity;
	private String alternateEmail;
	
	//constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println( "Email Created: "+ this.firstName+ " "+ this.lastName);
		this.department = setDepartment();
		System.out.println("Your Department is : "+this.department);
		this.password = randomPassword(defaultPasswordLength);
		
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
	

}
