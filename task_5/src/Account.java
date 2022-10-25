public class Account {
    public int accId;
    public String acctType;
    public Customer customer;
    public int accBalance;

    public Account(int Id, String type, Customer cus, int bal) {
        accId = Id;
        acctType = type;
        accBalance = bal;
        customer = cus;
    }

    public void display() {
        System.out.println("Customer Name: " + customer.custName);
        System.out.println("Customer id: " + customer.custId);
        System.out.println("Address: " + customer.custAddress);
        System.out.println("Account Id: " + accId);
        System.out.println("Account Type: " + acctType);
        System.out.println("Account Balance: " + accBalance);
    }
}










