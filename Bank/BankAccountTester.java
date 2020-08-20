package Bank;

public class BankAccountTester{
    /** Tests the methods of the BankAccount class. 8 @param args not used 9 */
    public static void main(String[] args){
        BankAccount harrysChecking = new BankAccount();
        harrysChecking.deposit(1000);
        harrysChecking.withdraw(500);
        System.out.println(harrysChecking.getBalance());
        System.out.println("Expected: 1500");
    }
}