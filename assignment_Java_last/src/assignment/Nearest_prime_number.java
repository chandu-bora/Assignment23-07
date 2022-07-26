package assignment;
public class Nearest_prime_number {
	public class NearestPrimeNumber
	{
	    public static void main(String[] args) {    
	   int number=10; 
	   int temp=number; 
	   int count=0; 
	   for(int i=2;i<number;i++)	    
	   {
	       count=0;  
	       if(number%i==0)    
	       {    
	           number++;	    
	           count++;   
	       }    
	   }    
	   if(count==0)
	   {
	     System.out.println(number+ "is the nearest prime to"+temp+"in increasing order");
	   }
	   number=temp;
	   for(int i=2;i<number;i++)
	   {
	       count=0;
	       if(number%i==0)
	       {
	           number--;
	           count++;
	       }	    
	   }
	   if(count==0)
	   {	    
	     System.out.println(number+" is the nearest prime to"+temp+" in decreasing order");
	   }
	 }
  }
}