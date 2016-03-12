//*********************************************************
//Name: Bikram Baral
//Title: Assignment3.java
//Author: Bikram Baral
//Description: HW#3
//Date: 9/15/2013
//*********************************************************
import java.util.Scanner;
public class Assignment3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("What is your first, middle and last names?");
		String fullName = scan.nextLine();
		int space0 = fullName.indexOf(" ");
		int space1 = fullName.lastIndexOf(" ");
		int x = fullName.length();
		String firstName = fullName.substring(1, space0);
		String middleName = fullName.substring((space0+2) + space1);
		String lastName = fullName.substring((space1+2), x);
		String firstIni = (fullName.substring(0, 1)).toUpperCase();
		String middleIni = (fullName.substring((space0+0), (space0+2))).toUpperCase();
		String lastIni = (fullName.substring((space1+1), (space1+2))).toUpperCase();
		String lasUppCas = (fullName.substring(space1, x)).toUpperCase();
		
		if (space0 !=space1);
		System.out.println("Your initials are:" + firstIni + middleIni + lastIni);
		System.out.println("Variable one:" + lasUppCas + "," + firstIni + firstName + "," +middleIni + ", ");
		System.out.println("Variable two:" + lastIni + lastName + ", "+firstIni + firstName + " " + middleIni + middleName);

	}

}
