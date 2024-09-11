public class LoanAccount extends Account {
    LoanAccount(){
        super();
    }
    double principleBal = 0;
    double Rate = .09;
    double interestBal = 0;
    double loanWithInterest = 0;
    boolean interestPaid = false;

    @Override
    public boolean withdraw(double _amount){

       principleBal = _amount + principleBal;
        interestBal = principleBal * Rate;
        loanWithInterest = interestBal + principleBal;


       System.out.println("Your loan with interest has been set to $" + loanWithInterest);
       System.out.println("Your Interest balance is " + interestBal);
       System.out.println("Your interest rate is " + Rate + "%");

       return true;

    }

    @Override
    public boolean deposit(double _amount){

       if(interestBal != 0){
          interestBal = interestBal - _amount;

          if(interestBal <= 0){
              System.out.println("Your interest balance has been fully paid, thank you");
             interestPaid = true;
          }

          if(interestBal > 0){
              System.out.println("The remaining interest balance is " + interestBal);
          }

       }
        if(interestBal <= 0) {
            while (interestPaid = true) {

                    principleBal = interestBal + principleBal;

                    if (principleBal < 0) {
                        double holder = -1;
                        holder = holder * principleBal;
                        principleBal = 0;
                        System.out.println("You have over tendered your balance the remaining funds wil be returned");
                        System.out.println("Thank you, sending back " + holder);
                        break;
                    }
                    System.out.println("Your principle balance is: " + principleBal);
                break;

            }
        }


        return true;
    }

}
