import java.io.*;
import java.util.*;
class max
{
		public static void main(String args[])
		{

			int a[]=new int[10];
			int max;

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 5 elements");
			for(int i=0;i<5;i++)
			{
				a[i]=sc.nextInt();
			}
			max=0;

			for(int i=0;i<5;i++)
			{
				if(a[i]>max)
				{
						max=a[i];
				}
			}
			System.out.println("MAx ="+max);
		}
}