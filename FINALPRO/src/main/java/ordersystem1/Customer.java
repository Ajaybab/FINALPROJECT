/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DELL
 */


package ordersystem1;



public class Customer
 {
    
	private int customerID;
	
private String firstName;
	
private String lastName;
	
private String phoneNumber;
 
	
 
public Customer(int customerID, String firstName, String lastName, String phoneNumber)
	 {
	    
super();
		
this.customerID = customerID;
		
this.firstName = firstName;
		
this.lastName = lastName;
		
this.phoneNumber = phoneNumber;
	
}


public int getCustomerID()
	 {
	    
return customerID;
	
}


public void setCustomerID(int customerID)
	{
	   
this.customerID = customerID;

	}
	

public String getFirstName()
	 {
	    
return firstName;
	 
}


public void setFirstName(String firstName)
	 {
		
this.firstName = firstName;

	 }


public String getLastName() 
	{
	   
return lastName;

	}


public void setLastName(String lastName)
	{
	     
this.lastName = lastName;
	
}
	

public String getPhoneNumber() 
	{
	    
return phoneNumber;
	
}


public void setPhoneNumber(String phoneNumber)
	 {
		
this.phoneNumber = phoneNumber;
	
}


  
@Override
public String toString()
	 {
		
String string = "";
 
		 
string += "Name: " + this.firstName + " " + this.lastName + "\n";
		
string += "Customer ID: " + this.customerID + "\n";

		string += "Phone Number: " + this.phoneNumber + "\n";

		  
return string;

	}	

}

