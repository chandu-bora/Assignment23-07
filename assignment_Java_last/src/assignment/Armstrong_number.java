package assignment;

import java.util.Scanner;

public class Armstrong_number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int Originalnumber,remainder,result=0;
		Originalnumber=number;
		while(Originalnumber>0)
			{
			   remainder=Originalnumber%10;
			   result=(int) (result+Math.pow(remainder,3));
			   Originalnumber=Originalnumber/10;
			}
		if (result==number) 
		    {
			   System.out.print("It is a armstrong number");
		    }
		else 
		    {
			   System.out.print("It is not a armstrong number");
	        }
	}
}