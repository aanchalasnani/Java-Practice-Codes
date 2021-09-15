import java.io.*;
import java.util.*;
class question1
{
public static void main(String a[])
{

	String name;
	int age;
	double salary;
	Scanner cin=new Scanner(System.in);
	System.out.println("Enter your Name:");
	name=cin.nextLine();
	System.out.println("Enter your Age:");
	age=cin.nextInt();
	System.out.println("Enter your Salary:");
	salary=cin.nextDouble();
	System.out.println("Your Name is:"+name);
	System.out.println("Your Age is:"+age);
	System.out.println("Your Salary is:"+salary);

}

}