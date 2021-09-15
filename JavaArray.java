class JavaArray {
    public static void main (String args[] ) {

        int a[] = {10,20,30,40,50}; //declartion , initialization and allocation taking place simultaneously
        for(int i=0;i<a.length;i++) //traversing
         {
            System.out.print(a[i]+ " ");
            
        }
        System.out.println();
        //average calculation :
        float sum=0,avg;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
        avg=sum/a.length;
        System.out.println("Average : "+avg);



    }
}