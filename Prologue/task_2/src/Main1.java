public class Main1 {

    public static void main(String[] args){
        Account account = new Account();

        account.setAccountDetails(24883483, "Savings Account", 5000);
        account.withdraw(2000);
        account.deposit(1000);
        account.displayAccountDetails();
    }
}
