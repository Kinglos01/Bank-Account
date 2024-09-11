public class CreditAccount extends Account {
    CreditAccount() {
        super();

    }

   double _creditLimit = 1000;
    boolean limCheck = true;

    @Override
    public boolean withdraw(double _amount) {
        while( limCheck = true) {
            if (_creditLimit > 1000) {
                System.out.println("You are over your credit limit");

                return false;
            }

            if (_creditLimit <= 1000) {
                double remaining = _creditLimit - _amount;

                if (remaining < 0) {
                    System.out.println("Cannot have a negative credit limit");
                    break;
                }
                System.out.println("You have $" + remaining + " limit remaining");
                _creditLimit = remaining;
                return true;
            }
            break;
        }
        return false;
    }

    @Override
    public boolean deposit(double _amount){

        while(limCheck = true) {
            if (_amount >= 1) {
                if(_amount + _creditLimit > 1000 || _creditLimit > 1000) {
                    System.out.println("Credit Limit cannot go above set limit.");
                    break;
                }
                _creditLimit = _creditLimit + _amount;

                return true;
            }

            if (_amount < 1) {
                System.out.println("Cannot deposit a negative amount");
                break;
            }
        }
return true;
    }

    public double getCreditLimit() {return _creditLimit;}

    public String credString() {
        String creditBlanace = "Your new credit limit is $" + _creditLimit + "\n";
        return creditBlanace;
    }

}

