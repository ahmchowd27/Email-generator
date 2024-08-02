package test;
import java.util.Scanner;
public class EmailApp {
private String fname;
private String lname;
private String email;
private String password;
private String department;
private int passlength =10;
private int mailboxCapacity =500;
public String alternateEmail;
private String copmpany = "amazon.com";

public EmailApp(String fname, String lname){
    this.fname = fname;
    this.lname = lname;
    this.department = setDepartment();
    this.password = randomPassword(passlength);
    email = fname.toLowerCase() + lname.toLowerCase() + department + "."+ copmpany;
   
}
private String setDepartment(){
System.out.println("Enter the department\n1 for sale \n2 for development\n3 for Accounting\n0 for none\nEnter Code:");
    Scanner in = new Scanner(System.in);
   int deptChoice = in.nextInt();
    if(deptChoice == 1){
        return "sales";

    }
    else if( deptChoice == 2){
        return "development";
    }
    else if(deptChoice == 3){
        return "accounting";
    }
    
    else{
        return "" ;
    }


 } 
private String randomPassword( int length){
    String passwordSet = "ABCDEFGHIJLMNOPRSTUVWXYZ1234567890@#&*?";
    char[] password = new char[length];
    for(int i=0; i<length; i++){
        int rand = (int)(Math.random() * passwordSet.length());
       password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
}
public void setMailboxcpcity(int capacity){
    this.mailboxCapacity = capacity;

}
public void setalternateEmail(String altemail){
    this.alternateEmail = altemail;
}
public void changePassword(String pass){
    this.password = pass;
}
public int getMailboxCapacity(){ return mailboxCapacity;}
public String getalternateEmail(){return alternateEmail;}
public String getPassword(){return password;}
public String showInfo(){
    return "Display Name: " + fname + " " + lname + " "+
        "Company Email: " +email+ " "+
        "MAilBox Capacity: " + mailboxCapacity;

}


}
