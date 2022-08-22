package day38_encapsulation;

public class TestBank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(254358733, 34565768);

 //       account1.Balance() = 10000;
 //       account1.setBalance(10000);
 // balance is private and there is not setter method, so i can't change the value

        System.out.println(account1.getBalance());
        System.out.println(account1.getAccountNumber());
    }
}
