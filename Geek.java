import java.util.Scanner;


public class Geek {
	
	private String GeekName;
	private int NumQuestions;
	
	public Geek(String name)
	{
		GeekName = name;
	}
	public String getName() {
		return GeekName;
	}
	
	public int getNumQuestions(){
		return NumQuestions;
	}
	public boolean allTheSame(int num1, int num2, int num3){
	NumQuestions++;
	if((num1==num2) && (num1==num3) && (num2==num3))
		return true;
	else
		return false;
		// TODO Auto-generated method stub
	}
	public int sum(int num1, int num2){
		NumQuestions++;
		int sum = 0;
		for(int i = num1; i<=num2; i++)
			sum = sum+i;
		return sum;
	}
	public String repeat(String str, int n){
		NumQuestions++;
		String result = " ";
		for(int i=0; i<n; i++)
			result = result+str;
		return result;
		
	}
	Scanner scan = new Scanner(System.in);
	public boolean isPalindrome(String str){
		NumQuestions++;
		int begin = 0;
		int end = str.length()-1;
	    while (str.charAt(begin)==str.charAt(end) && begin<=end)
	      {
	         begin ++;
	         end--;
	      }
if (begin>end)
	return true;
else
	return false;
	}
	
	}



