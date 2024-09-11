public class Main {
    public static void main(String[] args) {
        DepitAccount dpt1 = new DepitAccount();
        DepitAccount dpt2 = new DepitAccount(25);

        dpt1.deposit(100);
        dpt1.withdraw(25);
       // System.out.println(dpt1.toString());

        dpt2.deposit(100);
        dpt2.withdraw(25);
       // System.out.println(dpt2.toString());

        CreditAccount cred1 = new CreditAccount();
        cred1.withdraw(800);
        cred1.deposit(200);
        System.out.println(cred1.credString());

        LoanAccount loan1 = new LoanAccount();
        loan1.withdraw(6000);
        loan1.deposit(2350);

    }
}