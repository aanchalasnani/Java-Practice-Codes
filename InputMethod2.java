class InputMethod2 
{
    public static void main(String args[]){
        if(args.length>0){
            System.out.println("THE COMMAND LINE ARGUMENTS ARE : ");

            for(String i : args){
                System.out.println(i);
            }
        }
        else {
            System.out.println("NO COMMAND LINES ARGUMENTS PASSED ");
        }
        
    }
}