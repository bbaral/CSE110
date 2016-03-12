//****************************************************************
//Name: Bikram Baral
//Title: Assignment2.java
//Author: Bikram Baral
//Description: American measurement to matrix
//Date: 9/11/2013
//****************************************************************

//PART 1
//1 -System.out.printLn(myString.lenght());
//2 -import java.util.Scanner;
//   Scanner scan= new Scanner(System.in)
//   System.out.print("Please enter your age: ");
//   int age= in.nextInt();
//3 -Hy
import java.util.Scanner;
import java.text.*;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
		int Hf;         //Hf is a number of feet
		int Hi;         //Hi is a number of Inches
		double Hm;      //Hm is a height of person in meters
		Scanner scan= new Scanner(System.in);
		System.out.print("What is your name?");
		Name = scan.nextLine();
		System.out.print("What is your height?");
		System.out.print("\nFeet:");
		Hf = scan.nextInt();
		System.out.print("Inches:");
		Hi = scan.nextInt();
		Hm = ((Hf * 12) + Hi) * 2.54 / 100;
		//To convert the height to meters, you must first convert height from feet and inches to just inches
		//Then you can convert the inches to meters. Since there are 12 inches in a foot, 2.54 inches
		//in a centimeter and 100 centimeters in a meter, you can use one equation to do all the conversion:
		DecimalFormat fmt = new DecimalFormat("0.##");
		System.out.print(Name+ ", your height in meter is " +fmt.format(Hm));
		
		
		
		

	}

}
