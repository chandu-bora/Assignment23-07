package assignment;
import java.util.Arrays;
public class Check_element_in_Array {
	public static void main(String[] args)
    {
		      int intArr[] = {1,3,5,7,9,11,12,15};
		    Arrays.sort(intArr);
		     for (int number : intArr) {
		      }
		      int searchVal = 12;
		      int retVal = Arrays.binarySearch(intArr,searchVal);
		      boolean res = retVal > 0 ? true : false;
		      System.out.println("Is element 12 in the array? = " + res);
		    System.out.println("The index of element 12 is : " + retVal);
    }
}
