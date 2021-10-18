package facade;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashtoWithdrawal) {

        if (cashtoWithdrawal > getCashInAccount()) {
            System.out.println("Error: You do not have enough money");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        }

        decreaseCashInAccount(cashtoWithdrawal);
        System.out.println("Withdrawal Complete: Current Balance: " + getCashInAccount());
        return true;
    }

    public void makeDeposit(double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete: Current Balance: " + getCashInAccount());
    }





}
