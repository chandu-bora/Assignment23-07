package assignment;
import java.util.Scanner;
public class Vowels_consonants 
{
	    public static void main(String[] args)
	    {
	        int count=0;
	        int count1=0;
	        System.out.println("Enter a sentence:");
	        Scanner sc=new Scanner(System.in);
	        String sentence = sc.nextLine();
	        for (int i=0;i<sentence.length();i++)
	        {
	            char ch=sentence.charAt(i);
	            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	            {
	                count++;
	            }
	            else if(sentence.charAt(i) >= 'a' && sentence.charAt(i)<='z') 
	            {
	             count1++;   
	            }
	        }
	        System.out.println("number of ovels:"+count);
	        System.out.println("number of consonents:"+count1);
	    }
}

