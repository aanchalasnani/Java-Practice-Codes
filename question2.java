import java.io.*;
import java.util.*;
class question2
{
public static void main(String a[])
{
double income;
double tax;
Scanner cin=new Scanner(System.in);
System.out.println("Enter your Income:");
income=cin.nextDouble();
if(income<=500000)
	{
	tax=0;
	System.out.println("You have to pay tax="+tax); 
	}
else if(income>500000&&income<=1000000)
	{
	tax=10;
	System.out.println("You have to pay tax="+tax);
	} 
else if(income>1000000&&income<=1500000)
	{
	tax=20;
	System.out.println("You have to pay tax="+tax);
	} 
else
	{
	tax=30;
	System.out.println("You have to pay tax="+tax);

	}

} 
}