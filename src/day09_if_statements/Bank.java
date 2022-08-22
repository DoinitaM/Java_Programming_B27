package day09_if_statements;

public class Bank {
    public static void main(String[] args) {

        double balance = 1_000_000;
       double amounToWithdraw = 1_500_000;
       balance -= amounToWithdraw; // balance = balance - amounToWithdraw;
        System.out.println("Withdrew: " + amounToWithdraw);

      if (balance>= 0 ) {
          System.out.println("Account balance is: " + balance);
      }

        if(balance < 0) {
            System.out.println("Overdraft penalty");
            System.out.println("Penality due: " + amounToWithdraw * 0.25);

        }



    }

}
