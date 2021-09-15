import java.io.*;
import java.util.*;
class question3
{
public static void main(String c[])
{
int a,b;
Scanner cin=new Scanner(System.in);

System.out.println("Enter the value of a:");
a=cin.nextInt();
System.out.println("Enter the value of b:");
b=cin.nextInt();
while(a!=b)
{
	if(a>b)
	a=a-b;
	else
	b=b-a;
}
System.out.println("The GCD of a and b is:"+a);

}
}