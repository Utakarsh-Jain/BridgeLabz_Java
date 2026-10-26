
/*
Program 10: Facade Design Pattern

Purpose:
Facade Pattern provides a simple interface to a complex subsystem.
Here, BankFacade coordinates account, balance, and transaction services.
*/

// Subsystem responsible for account validation
class AccountService {
    public void validateAccount() {
        System.out.println("Account validated");
    }
}

// Subsystem responsible for checking the account balance
class BalanceService {
    public void checkBalance() {
        System.out.println("Balance checked");
    }
}

// Subsystem responsible for processing transactions
class TransactionService {
    public void transfer() {
        System.out.println("Money transferred successfully");
    }
}

// Facade provides one simple method for the entire operation
class BankFacade {
    private AccountService accountService;
    private BalanceService balanceService;
    private TransactionService transactionService;

    public BankFacade() {
        // Create the subsystem service objects
        accountService = new AccountService();
        balanceService = new BalanceService();
        transactionService = new TransactionService();
    }

    public void transferMoney() {
        // Coordinate the steps through one method
        accountService.validateAccount();
        balanceService.checkBalance();
        transactionService.transfer();
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        // Client only needs to interact with the facade
        BankFacade bank = new BankFacade();

        // Facade handles all the internal steps
        bank.transferMoney();
    }
}
