// the following java application shows how the transcations ina abank can be carried out concurrently

class Account {
    public int balance ;
    public int accountNo;
    void DisplayBalance(){
        System.out.println("Account no : "+accountNo+"Balance : "+balance);

    }

    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount+" is deposited ");
        DisplayBalance();
    }

    synchronized void withdraw(int amount){
        balance = balance - amount;
        System.out.println(amount+" is withdraw ");
        DisplayBalance();

    }
}

class TransactionDeposit implements Runnable {
    int amount ;

    Account accountX ;
    TransactionDeposit(Account x , int amount){
        accountX = x ;
        this.amount = amount ;
        new Thread(this).start();

    }
    public void run(){
        accountX.deposit(amount);
    }
}

class Transactionwithdraw implements Runnable {
    int amount ;
    Account accountY;

    Transactionwithdraw(Account y , int amount){
        accountY = y;
        this.amount = amount;
        new Thread(this).start();
    }

    public void run() {
        accountY.withdraw(amount);

    }
}

class Thread8 {
    public static void main(String args[]){
        Account ABC = new Account();
        ABC.balance = 1000;
        ABC.accountNo = 111;
        TransactionDeposit t1 ;
        Transactionwithdraw t2;
        t1 = new TransactionDeposit(ABC , 500);
        t2 = new Transactionwithdraw(ABC,900);

    }
}