Email Management System 

Project Description : 

This Java project implements a simple Email Management System for creating and managing employee email accounts. The system automatically generates email addresses, creates random passwords, and allows for various email account configurations.


Features :

Automatic email generation based on employee's first name, last name, and department
Random password generation
Department selection
Mailbox capacity management
Alternate email address setup
Password change functionality




Classes : 
EmailMain
This is the main class that handles the email account creation and management.

Constructor : 

EmailMain(String firstName, String lastName): Creates a new email account for an employee

Methods:

setDepartment(): Allows the user to select their department
randomPassword(int length): Generates a random password
setMailboxCapacity(int capacity): Sets the mailbox capacity
setAlternateEmail(String alternateEmail): Sets an alternate email address
changePassword(String password): Changes the account password
getMailboxCapacity(): Returns the mailbox capacity
getAlternateEmail(): Returns the alternate email address
getPassword(): Returns the current password
showInfo(): Displays the account information

EmailAppMain : 
This class contains the main method to run the application.


How to Use :

Create a new EmailMain object with the employee's first and last name:

EmailMain em1 = new EmailMain("Jane", "Doe");
The system will prompt to enter a department code:
1 for sales
2 for dev
3 for marketing
0 for none
A random password will be generated and displayed.
Use the various methods to manage the email account:

em1.setMailboxCapacity(500);
em1.setAlternateEmail("jane.alternate@example.com");
em1.changePassword("newPassword123");
Display account information:
java
System.out.println(em1.showInfo());


Note : 
This project is a basic implementation and can be extended with additional features such as database integration, GUI, or more advanced email functionalities.
