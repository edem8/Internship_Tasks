public class Account {
    public int accountNo;
    public String accountType;
    public int accountBalance;

    public void setAccountDetails(int acc_no, String accType, int acc_Bal){
        accountNo = acc_no;
        accountType = accType;
        accountBalance = acc_Bal;
    }

    public void withdraw(int amount){
        if (accountBalance < amount){
            System.out.println("Insufficient Balance.");
        }
        else {
            accountBalance -= amount;
        }

    }

    public void deposit(int depositAmount){
        accountBalance += depositAmount;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }

}

