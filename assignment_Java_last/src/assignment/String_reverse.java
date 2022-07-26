package assignment;
public class String_reverse {
	public static void main(String[] args) {
		String str = "coach it";
		String rname="";
		char ch;
		for (int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			rname=ch+rname;
		}
		System.out.println(rname);
		String a="123";
		String Rname="";
		char Ch;
		for (int i=0;i<a.length();i++)
		{
			Ch=a.charAt(i);
			Rname=Ch+Rname;
		}
		System.out.println(Rname);
	}
}
