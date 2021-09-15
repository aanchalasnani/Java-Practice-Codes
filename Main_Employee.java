import java.lang.*;
import java.io.*;
import java.util.*;

class Employee {

    String name ;
    int age ;
    double salary ;

    int get_Age() {

       return age;

    }

    void set_Age(int age ) {
       
        this.age = age;
       
    }

    String get_name(){

        return name;

    }

    void set_name(String name){
        this.name = name ;
    }

    double  get_salary(){
        return salary;
    }

    void set_salary(double salary){
        this.salary = salary;
    }

    void printBiodata() {

        System.out.println("Name : "+get_name());
        System.out.println("Age : "+get_Age());
        System.out.println("Salary : "+get_salary());

    }

    void PrintPaySlip() {
        double hra = 800 ;
        double da = 0.25*salary;
        double tax = 0.15*salary;
        double total_salary = salary + da + hra  - tax ;
        System.out.println("PAY SLIP : " + total_salary);
    }


}

class Main_Employee {

    public static void main(String args[]){

        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        String name ; int age ; double salary;

        System.out.print("Enter Employee Name : ");
        name = sc.nextLine();

        System.out.print("Enter Age : ");
        age = sc.nextInt();

        System.out.print("Enter Salary : ");
        salary = sc.nextDouble();

        

        emp.set_Age(age);
        emp.set_name(name);
        emp.set_salary(salary);

        emp.printBiodata();

        emp.PrintPaySlip();

    }
}