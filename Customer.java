/*-------------------------------------------------------------------------
// Name: Bikram Baral
// FILENAME: Customer.java
// SPECIFICATION: The class Customer describes information on a customer
// and has a first name (a String) and last name (String)
// YOUR Lab Letter and Name of the TA for your Closed lab
// FOR: CSE 110- homework #8- days and time of your class
// TIME SPENT: 3 hours
//----------------------------------------------------------------------*/

public class Customer
 {
   private String lastName;
   private String firstName;

   // This constructor sets the first name and last name to "???�
   public Customer()
   {
		  lastName = "???";
		  firstName = "???";
   }

  // This constructor constructs a Customer object  given the last name and first name
   public Customer(String customerInfo)
   {
         int space = customerInfo.indexOf(" ");
         firstName = customerInfo.substring(0, space).trim();
         lastName = customerInfo.substring(space+1).trim();

   }

   // This constructor cConstructs a Customer object using the string containing customer's info.
   // It uses the StringTokenizer to extract first name, last name, id, the number of matinee tickets,
   // and the number of normal tickets.
   public Customer(String lName, String fName)
   {
		 lastName = lName;
		 firstName = fName;

   }

   // This method sets the last name.
   public void setLastName(String lName)
   {
		 lastName = lName;
   }
   // This method sets the first name.
   public void setFirstName(String fName)
   {
		 firstName = fName;
   }

   // This method returns the last name.
   public String getLastName()
   {
		 return lastName;
    }
   // This method returns the first name.
   public String getFirstName()
   {
		 return firstName;
   }

   // This method checks if a customer object passed as a parameter and itself (customer object)
   // are same using their last names and first names.
   public boolean equals(Customer other)
   {
		 if (lastName.equals(other.lastName) && firstName.equals(other.firstName))
		     return true;
		 else
		     return false;
   }

   // This method returns a string containing a customer's initials
   // (first characters of firstName and lastName.)
   public String toString()
   {
		   String result = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
		   return result;
   }


 } // end of the class Customer

