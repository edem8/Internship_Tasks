public class Main{

    public static void main(String[] args){
        Customer customer =new Customer(6473932, "kelvinchrist", "22B West-Legon");
        customer.display();

        System.out.println("");
        System.out.println("");

        Account account = new Account(894372, "Savings account", customer, 5000);
        account.display();
    }
}
