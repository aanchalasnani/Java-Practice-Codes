class RecursiveFactorial {
    int n;
    int Factorial(int n)
    {
        if(n==0){
            return 1;

        }
        else {
            return (n*Factorial(n-1));
        }
    }

    public static void main(String args[])
    {
        RecursiveFactorial x = new RecursiveFactorial();
        x.n = Integer.parseInt(args[0]);
        System.out.println("FActorial of n : " + x.n + " is " + x.Factorial(x.n));
    }
    
}