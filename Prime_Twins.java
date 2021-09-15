import java.lang.*;

class Prime_Twins {

    public static void main(String args[]){

        int i , num , isprime ,a , b;
       
        int prev = 2;

        for(num = 2 ; num <= 100 ; num++){
            isprime = 1 ;

            for(i=2 ; i< num ; i++){
                if(num%i == 0){
                    isprime = 0;
                }
            }
            if(isprime == 1){
                if(num-prev == 2){
                    System.out.println(prev+":"+num);
                }
                prev = num ;
            }
        }
    }
}