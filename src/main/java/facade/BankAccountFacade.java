package facade;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundsChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAccNumber, int newSecCode) {
        accountNumber = newAccNumber;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();
        accChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {

        if (accChecker.accountActive(getAccountNumber())
                && codeChecker.isCodeCorrect(getSecurityCode())
                // this should of course only give back boolean, and if true,
                // we should call a method which handles the withdrawal.
                && fundsChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double cashToDeposit) {

        if (accChecker.accountActive(getAccountNumber())
                && codeChecker.isCodeCorrect(getSecurityCode())) {

            fundsChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }

    }
}
