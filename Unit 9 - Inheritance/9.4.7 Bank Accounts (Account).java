public class Account
{
    private int accountNumber;
    private double balance;
    
    // Initialize values in constructor
    public Account(int accountNumber, double openingBal){
       this.accountNumber = accountNumber;
       balance = openingBal;
    }
    
    // Complete the accessor method
    public double getBalance(){
        return balance;
        
    }
    
    // Add amount to balance
    public void deposit(double amount){
       balance += amount;
       
    }
    
    // Subtract amount from balance
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        
    }
    
    // Should read: Regular account current balance $__.__
    public String toString(){
       return "Regular account current balance $" + balance;
       
    }
}