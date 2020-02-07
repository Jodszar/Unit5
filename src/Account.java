public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account(String first, String last, double balance){
        this.first= first;
        this.last= last;
        this.acctNum= (int)(Math.random()*999+1);
        this.balance= balance;
    }

    public Account(Account acct){this(acct.first, acct.last, acct.balance);}
    public Account(){this("","", 0);}

    public String getFirst(){return first;}
    public void setFirst(String first){this.first= first;}

    public String getLast(){return last;}
    public void setLast(String last){this.last=last;}

    public int getAcctNum(){return acctNum;}
    private double getBalance(){return balance;}
    public void deposit(double $deposited){balance+=$deposited;}
    public boolean withdrawal(double $withdrawn){
        if($withdrawn>balance)
            return false;
        else
            balance-=$withdrawn;
        return true;
    }
    public String toString(){
        return "Customer Name: " + getFirst()+ " " +getLast()+ "\nAccount #:" + getAcctNum()+ "\nCurrent Balanace: $"+ getBalance();
    }
}
