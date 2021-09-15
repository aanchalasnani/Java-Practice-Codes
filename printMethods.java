class printMethods {

    public static void main (String args[]){

        int x=100;
        System.out.printf("Printing Simple Integers : x = %d\n",x);

        System.out.printf("Formatted with precison : PI = %.2f\n",Math.PI);

        float n=51.2224f;

        System.out.printf("Formatter to specific width : n = %4.2f\n",n);

        n=2324435.3f;

        System.out.printf("Formatted to right margin : n = %20.2f\n",n);
    }
}