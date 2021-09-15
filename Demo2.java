//Solution by Aanchal Asnani 
// roll no - 01
//Registration No - PCE19CS001

import java.io.*;
import java.util.*;


interface TypeOfAccounts {
    void Sdeposit(double amount);
    void Swithdrawal(double amount);
    int SenquireBalance();
    void ScalculateInterest();

    void Cdeposit(double amount);
    void Cwithdrawal(double amount);
    int CenquireBalance();
    void CcalculateInterest();
}


abstract class AccountsMain implements TypeOfAccounts{

    String AccountType;
    int AccountNo;
    double AccountBalance;

    String getAccountType();
	int getAccountNo();
	double getAccountBalance();

    void  SetAccountType(String s);
	void SetAccountNo(int N);
	void SetAccountBalance(double B);

    abstract void Sdeposit(double amount);
    abstract void Swithdrawal(double amount);
    abstract int SenquireBalance();
    abstract void ScalculateInterest();
    abstract void Cdeposit(double amount);
    abstract void Cwithdrawal(double amount);
    abstract int CenquireBalance();
    abstract void CcalculateInterest();

    public String getAccountType(){
        return AccountType;
    }
	public int getAccountNo(){
        return AccountNo;
    }
	public double getAccountBalance(){
        return AccountBalance;
    }
    public void  SetAccountType(String s){
        AccountType = s;
    }
	public void SetAccountNo(int N){
        AccountNo = N;
    }
	public void SetAccountBalance(double B){
        AccountBalance = B;
    }



}

class Accounts extends AccountsMain {

    public void Sdeposit(double amount) {
        AccountBalance = AccountBalance + amount;
    }

    public void Cdeposit(double amount) {
        AccountBalance = AccountBalance + amount ;
    }
    public void Swithdrawal(double amount){
        if(amount>AccountBalance){
            System.out.println("YOU DONT HAVE ENOUGH BALANCE TO WITHDRAW");
        }
        else{
            AccountBalance = AccountBalance - amount;
        }
    }
    public void Cwithdrawal(double amount) {
        AccountBalance = AccountBalance - amount;
    }
    public int SenquireBalance() {
        return AccountBalance;
    }
    public int CenquireBalance(){
        return AccountBalance;
    }

    public void CcalculateInterest(){
        int AccountBalance = AccountBalance -( AccountBalance*8)/100;
    }
    public void ScalculateInterest(){
        int AccountBalance = AccountBalance -( AccountBalance*4)/100;
    }
    
    
}


class Demo2 {

    public static void main(String args[]){
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	TypeOfAccounts Acc=new Accounts();
	String AccountType;
    int AccountNo;
    double AccountBalance;
	
	System.out.println("Enter your AccountNo :");
	AccountNo = Integer.parseInt(br.readLine());
	System.out.println("Enter your AccountType:");
	AccountType=br.readLine();
	System.out.println("Enter your AccountBalance:");
	AccountBalance=Double.parseDouble(br.readLine());
	
    SetAccountType(AccountType);
    SetAccountNo(AccountNo);
    SetAccountBalance(AccountBalance);

    double amount = 5000;

    if(AccountType=='Current'){
        // current account methods
        Cdeposit(amount);
        Cwithdrawal(2000);
        System.out.println("Account Balance " +CenquireBalance());
        CcalculateInterest;
        System.out.println("Account Balance " +CenquireBalance());

    }
    else{
        // saving account methodds
        Sdeposit(amount);
        Swithdrawal(2000);
        System.out.println("Account Balance " +SenquireBalance());
        ScalculateInterest;
        System.out.println("Account Balance " +SenquireBalance());

    }


    }
}