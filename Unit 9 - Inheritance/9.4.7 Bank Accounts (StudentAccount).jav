public class StudentAccount extends Account
{
    // Complete this class with Override methods.   
    
    public StudentAccount(int accountNumber, double openingBal){
        super(accountNumber, openingBal);
    }
    
    // Students get a 10% bonus on depositing
    @Override
    public void deposit(double amount){
        super.deposit(1.10 * amount);
    }
    
    
    
    // Students pay a $1.50 fee for withdrawing
    @Override
    public void withdraw(double amount){
        super.withdraw(amount + 1.5);
    }
    
    
    // toString() Should read: Student account current balance $__.__
    @Override
    public String toString(){
        return "Student account current balance $" + super.getBalance();
    }
    
}