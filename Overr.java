import java.io.*;
import java.util.*;

class Vehicle
{
	void show()
	{
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle
{
	void show()
	{
		System.out.println("Bike is running");
	}
}
class Overr
{
	public static void main(String args[])
	{
			Bike b=new Bike();
			b.show();
	}
}