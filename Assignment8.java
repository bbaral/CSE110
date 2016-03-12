/*-------------------------------------------------------------------------
// Name: Bikram Baral
// FILENAME: Assignnment8.java
// SPECIFICATION: This program will read a series of customers' information
// from a file specified by a user. A user will also specify the size
// (the number of rows and columns for a movie theatre. Then the program
// will try to assign each customer to a seat.
//
// YOUR Lab Letter and Name of the TA for your Closed lab
// FOR: CSE 110- homework #8- days and time of your class
// TIME SPENT: 3 hours
//----------------------------------------------------------------------*/

//*** This program will read some information from a file and ***//
//** some information from a keyboard.                        ***//

import java.io.*;
import java.util.*;

public class Assignment8
{
   public static void main(String[] args) throws IOException
   {

       MovieSeating theatreSeating;
       Customer tempCustomer;
       int requestedRow, requestedCol, row, col, rowNum, columnNum;
       String line, fileName;

       // to read input from a KEYBOARD.
       Scanner stdin = new Scanner(System.in);

       // Ask a user to enter a number of rows for a movie theatre seating from a KEYBOARD.
       System.out.println("Please enter a number of rows for a movie theatre seating.");
       rowNum = stdin.nextInt();

       // Ask a user to enter a number of columns for a movie theatre seating from a KEYBOARD.
       System.out.println("Please enter a number of columns for a movie theatre seating.");
       columnNum = stdin.nextInt();

       // instantiate a MovieSeating object
       theatreSeating = new MovieSeating(rowNum, columnNum);

       // get a file name read from a KEYBOARD.
       System.out.println("Please enter a file name");
       fileName = stdin.next();

       // create FileReader and BufferedReader object to
       // read from a file.
       FileReader fr = new FileReader (fileName);
       BufferedReader inFile = new BufferedReader (fr);

       /*** reading a customer's information from a FILE ***/
       line = inFile.readLine();

       /*** we will read line by line until we read the end of a given file ***/
       while (line != null)
       {
           System.out.println("\nA customer information is read from a file.");
           // printing information read from a file.
           System.out.println(line);

           // creating a customer object using information from a file
           tempCustomer = new Customer(line);

           // Ask a user to decide where to seat a customer by asking for row and column of a seat
           System.out.println("Please enter a row number where the customer wants to sit.");
           requestedRow = stdin.nextInt();
           row = requestedRow -1;

           System.out.println("Please enter a column number where the customer wants to set.");
           requestedCol =  stdin.nextInt();
           col = requestedCol -1;

           // Checking if the row number and column number are valid (exist in the theatre that we created.)
           if (theatreSeating.checkBoundaries(row, col) == false)
           {
				System.out.println("\nrow or column number is not valid.");
				System.out.println("A customer " + tempCustomer.getFirstName() + " " + tempCustomer.getLastName() + " is not assigned a seat.");
		   }
           else
           {
			  // Assigning a seat for a customer
              if (theatreSeating.assignCustomerAt(row, col, tempCustomer) == true)
              {
				System.out.println("\nThe seat at row " + row + " and column " + col + " is assigned to the customer " + tempCustomer.toString());
                System.out.println(theatreSeating);
			  }
              else
              {
                System.out.println("\nThe seat is taken.");
		      }
		    }
           // Read next line in a FILE
           line = inFile.readLine();

       }//end of the while loop
         // Closing the file
       inFile.close();

     }

  }
