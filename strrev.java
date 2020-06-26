import java.io.*;
import java.util.*;
class strrev
{
	public static void main(String args[])
	{
		//String rev="";

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The string");

		String str=sc.next();

		
		for(int i=str.length()-1;i>=0;i--)
		{
			//rev=rev+(str.charAt(i));
			System.out.print(str.charAt(i));
		}
		//System.out.println(rev);
	}
}