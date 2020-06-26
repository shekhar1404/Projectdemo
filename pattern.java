import java.io.*;
import java.util.*;

class pattern
{
		public static void main(String args[])
		{
			int n,i,k,j,sp=2;

			Scanner sc=new Scanner(System.in);

			System.out.println("Enter the no of rows");
			n=sc.nextInt();

			for(i=0;i<n;i++)
			{
				for(j=n;j>=i;j--)
				{
					System.out.print(" ");
				}
				
				for(k=0;k<=i;k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}

		}
}