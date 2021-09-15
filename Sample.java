import java.io.*;
import java.util.*;


interface Student
{
	
	void printBiodata();
	void printMarksheet();

}
abstract class GeneralStudent implements Student
{
	String std_name;
	int std_id;
	String std_address;
	String std_type;
	
	public String getName()
	{
	 
	return std_name;

	}
	public String getAddress()
	{
	
	return std_address;

	}
	public int getID()
	{
	return std_id;
	}
	public void setID(int id)
	{
	 std_id=id;
	}
	public void setName(String s)
	{
	std_name=s;
	}
	public void setAddress(String address)
	{
	
	std_address=address;

	}
	public void  setType(String type){
		std_type = type;
	}


}

class Graduate extends GeneralStudent
{
	int UGsubjects = 6;
	int PGsubjects = 2;
	int UGTotalMarks = UGsubjects*80;
	int PGTotalMarks = PGsubjects*90;
    double std_percentage;

	public void printMarksheet(){
		if(std_type=="UG"){

			System.out.println("Student Total Marks:"+get_total_marks());
			System.out.println("Student Percentage:"+get_percentage());
		}
	}
	public void printBio()
	{
	System.out.println("Student Type:"+std_type);
	System.out.println("Student ID:"+std_id);
	System.out.println("Student Name:"+std_name);
	System.out.println("Student Address:"+std_address);
	

	}
	public double get_total_marks()
	{
		if(std_type == "UG")
			return (UGTotalMarks);
		else
			return (PGTotalMarks);
	}
	public double get_percentage()
	{
		if(std_type=="UG"){
			std_percentage=(get_total_marks())/6;
			return std_percentage;
		}
		else {
			std_percentage=(get_total_marks())/2;
			return std_percentage;
		}
	}
	
}
class abstractStudent
{
	public static void main(String a[]) throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Student std=new Graduate();
	int id;
	String name;
	String address;
	String StudentType;
	
	System.out.println("Enter your ID:");
	id = Integer.parseInt(br.readLine());
	System.out.println("Enter your Name:");
	name=br.readLine();
	System.out.println("Enter your Address:");
	address=br.readLine();
	System.out.println("Enter your Student Type : UG/PG :");
	StudentType=br.readLine();


	std.setName(name);
	std.setAddress(address);
	std.setID(id);
	std.setType(StudentType);
	std.printBiodata();
	std.printMarksheet();
	}

}




















