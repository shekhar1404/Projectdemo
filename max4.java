import java.io.*;
import java.util.*;
class max4
{
		public static void main(String args[])
		{

			int a[]=new int[10];
			int max1=0,max2=0,max3=0;

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 5 elements");
			for(int i=0;i<5;i++)
			{
				a[i]=sc.nextInt();
			}
			max1=0;

			if(a[0]>a[1])

				max1=a[0];
			else
				max1=a[1];

			
			if(a[2]>a[3])

				max1=a[2];
			else
				max1=a[3];


			if(max1>max2)
			{
				System.out.println(max1);
			}
			else
			{
				System.out.println(max2);
			}
		}
	}
