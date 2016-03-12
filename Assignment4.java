//**********************************************************
//Name: Bikram Baral
//Filename:conditional and repetation(loop) statements
//Author: Bikram Baral
//for: CSE 110 - HW#4
//Time spent: 1 hours
//Date: october 4 2013
//**********************************************************
/************* 
 * Part A
 * A - 10
 * B - 6
 * c - 3
 * D - 0
 * ***********/

import java.util.Scanner;
public class Assignment4 {
	public static void main(String[] args) {
		int num=0;
		int num1=0;
Scanner scan = new Scanner(System.in);

	System.out.print(" Enter the first integer: ");	//user should enter number
	num = scan.nextInt();
	int x = num;
System.out.print(" Enter the second integer: ");
	num1 = scan.nextInt();
	int y = num1;

while (num !=num1){
	if (num>=num1)
		num = num - num1;

	else 
	num1 = num1-num;
}
System.out.println(" The gcd of "+ x +" and "+y +" is: "+(num)); //gcd subtract smallest number from largest number

	}

}
