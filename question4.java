import java.io.*;
import java.util.*;
class question4
{
public static void main(String a[])
{
int n;
Scanner cin=new Scanner(System.in);
System.out.println("Enter any number:");
n=cin.nextInt();
int i=2;
int cnt=0;
while(i<n)
{
	if(n%i==0)
	{
		cnt++;
	}
i++;
}
if(cnt==0)
System.out.println("YES, given number is PRIME");
else
System.out.println("NO, given number is NOT PRIME");


}

}
 