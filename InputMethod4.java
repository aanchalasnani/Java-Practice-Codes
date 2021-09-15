import java.util.Scanner;
class InputMethod4 {
    public static void main ( String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter two numbers to find maximum of two : ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.printf("Between %d and %d , maximum is %d ",a,b,a);
        }
        else {
            System.out.printf("Between %d and %d , maximum is %d ",a,b,b);
        }
    }
}