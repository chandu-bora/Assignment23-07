package assignment;

public class Null_pointer_Exception {
	    public static void main(String[] args)

	    {
	        String a=null;
	        try
	        {
	            System.out.println(a.length());
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	}
