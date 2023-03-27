public class BankTester
{
    public static void main(String[] args)
    {
        Account checking = new Account(12345, 34.56);
        
        System.out.println(checking);
        System.out.println(checking.getBalance());
        
        System.out.println("Depositing $40.25");
        checking.deposit(40.25);
        System.out.println(checking);
        
        System.out.println("Withdrawing $20");
        checking.withdraw(20);
        System.out.println(checking);
        
        System.out.println("Withdrawing $2000");
        checking.withdraw(2000);
        System.out.println(checking);
        
        
        System.out.println();
        StudentAccount student = new StudentAccount(98765, 100);
        
        System.out.println(student);
        System.out.println(student.getBalance());
        
        System.out.println("Depositing $50.50");
        student.deposit(50.50);
        System.out.println(student);
        
        System.out.println("Withdrawing $25");
        student.withdraw(25);
        System.out.println(student);
        
        System.out.println("Withdrawing $2000");
        student.withdraw(2000);
        System.out.println(student);
        
        
    }
}