import java.util.*;

class RecursiveFibonacci {
    int n;
    int Fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            return(Fibonacci(n-1)+Fibonacci(n-2));
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        RecursiveFibonacci rf = new RecursiveFibonacci();

        System.out.println("Enter the value of n : ");
        rf.n = sc.nextInt();

        for(int i=0;i<=rf.n;i++)
        System.out.println(i+1+" is : "+rf.Fibonacci(i));
        
    }
}