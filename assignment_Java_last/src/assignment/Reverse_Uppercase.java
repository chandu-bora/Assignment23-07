package assignment;

public class Reverse_Uppercase {
	public static void main(String[] args) {
		String str = "this is java";
		String str1 =str.toLowerCase();       // in case the string is in Upper case
		StringBuilder sb = new StringBuilder();
		for (String s : str1.split(" "))
		{
			String revSt = new StringBuilder(s).reverse().toString();
			revSt =Character.toUpperCase(revSt.charAt(0))+ revSt.substring(1); 
		    sb.append(revSt).append(" ");
		}
		System.out.println(sb);
		}
	}