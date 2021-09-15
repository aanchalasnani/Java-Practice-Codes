class Exception3 {
    
    public static void main (String args[]){
        int i=0;
        String greetings[] = {"Hello Twinkle !","Hello Java !","Hello World !"};
        while(i<4){
            try {
                System.out.println(greetings[i]);
                i++;

            }
            catch(Exception e){
                System.out.println(e.toString()); // message of exception e in string format
            }
            finally 
            {
                System.out.println("HI !");
                if(i<3);
                else {
                    System.out.println("you should quit and reset index value ");break; 
                }
            }
            
        } // while closed


    } // main closed 


} // class closed