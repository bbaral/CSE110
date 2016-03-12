
import java.util.*;
public class Assignment6

{
   public static void main (String[] args) {

       Scanner console = new Scanner (System.in);

       String choice;
       char command;

        // print the menu
        printMenu();       

        Geek myGeek = new Geek("Geek");

        do
               {
                   // ask a user to choose a command
                   System.out.println("\nPlease enter a command or type ?");
                   choice = console.next().toLowerCase();
                   command = choice.charAt(0);

                   switch (command)
                    {
                         case 'a':
                        	 
                              // call the getName method
                        	 // print out myGeek.getName()
                        	 System.out.println(myGeek.getName());
                              break;
                         case 'b': //
                              // call the getNumberOfQuestions method
                        	 System.out.println(myGeek.getNumQuestions());
                              break;
                         case 'c': //
                        	 System.out.println("Enter three integers: ");
                        	 int num1 = console.nextInt();
                        	 // num2, num3
                        	 int num2 = console.nextInt();
                        	 int num3 = console.nextInt();
							boolean flag = myGeek.allTheSame(num1, num2 , num3);  
                        	 if (flag)
                        		 System.out.println("All numbers are the same: ");
                        	 else
                        		 System.out.println("All the numbers are not same: ");
                              break;
                         case 'd':
                        	 int number1;
                        	 int number2;
                        	 System.out.println(" Please enter the first number: ");
                        	 number1=console.nextInt();
                        	 System.out.println(" Please enter the second number: ");
                        	 number2 = console.nextInt();
                        	 
                        	 System.out.println(" The sum between "+number1+" and "+number2+" is "+myGeek.sum(number1, number2));

                               //ask for two integers
                        	 

                               // call the method sum and print the sum
                         case 'e': //
                        	 String str;
                        	 int n1;
                        	 System.out.println(" Please enter the string: ");
                        	 str=console.next();
                        	 System.out.println(" Please enter the integer: ");
                        	 n1 = console.nextInt();
                        	 
                        	 
                               // ask for a string and an integer (number of times to repeat)
                               // call the repeat and print the string n times
                            System.out.println(myGeek.repeat(str, n1));
                              break;
                         case 'f':

                              //ask for a string
                        	 String palindrome;
                        	 System.out.println(" enter the string: ");
                        	 palindrome=console.next();
                               if (myGeek.isPalindrome(palindrome))
                               System.out.println("The string "+palindrome+ " is palindrome ");
                               else
                               System.out.println(" The string "+palindrome + " is NOT plaindrome");

                              break;
                         case '?':
                              printMenu();
                              break;
                         case 'q':
                              break;

                         default:
                               System.out.println("Invalid input");

                    }

                } while (command != 'q');

            }  //end of the main method


          public static void printMenu()
           {
            System.out.print("\nCommand Options\n"
                           + "-----------------------------------\n"
                           + "a : Geek's name\n"
                           + "b: Num Questions asked\n"
                           + "c: All numbers are the same\n"
                           + "d: Sum between two integers\n"
                           + "e: Repeat the string\n"
                           + "f: It is palindrome\n"
                           + "?: Display\n"
                           + "q: Quit\n");
            } // end of the printMenu method


}
