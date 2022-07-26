package assignment;

public class Largest_smallest_number 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int max= a[0],min=a[0]; //initilization
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			  if (a[i]>max)
			   {
				 max=a[i];
        	   }
			  if (a[j]<min)
			   {
				 min=a[i];
			   }
			}
		}	
		System.out.println ("Largest number in the array is:" + max);
		System.out.println ("Smallest number in the array is:" + min);
	}
}
