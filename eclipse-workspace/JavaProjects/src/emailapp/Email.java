package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
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
	

}
