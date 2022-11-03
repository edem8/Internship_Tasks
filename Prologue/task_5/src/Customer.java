public class Customer {
    public int custId;
    public String custName, custAddress;

    public Customer(int Id, String name, String adrs){
        custId = Id;
        custName = name;
        custAddress = adrs;
    }

    public void display(){
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer Id: " + custId);
        System.out.println("Customer address: " + custAddress);
    }

}
