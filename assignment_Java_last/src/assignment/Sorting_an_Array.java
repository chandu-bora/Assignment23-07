package assignment;
import java.util.Arrays;
public class Sorting_an_Array 
{
	public static void main(String[] args)
	{
       int a[]= {1,2,3,-1,-2,4};
       int count=0; //
       Arrays.sort(a);
       System.out.print("Array elements after sorting: ");
       for (int a1:a)
       {
           count++;
    	   if(count==1)
    	   System.out.print(a1+"");
    	   else 
    	   System.out.print(","+a1);
       }
	}
}
/*Arrays.sort(a);
System.out.println("Array elements After Sorting:");
for (int a1 : a) {
System.out.println(a1);
}*/