import java.awt.image.PackedColorModel;

public class Main {


    public static void main(String[] args){

        Student student = new Student();

        System.out.println("....printing the student class....");
        student.setStudDetails(2, "Kelvinchrist", 89, 94, 98);
        student.calculateTotal();
        student.displayStuDetails();

        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("....printing the Account class....");
        Account account = new Account();

        account.setAccountDetails(24883483, "Savings Account", 5000);
        account.withdraw(2000);
        account.deposit(1000);
        account.displayAccountDetails();
    }
}
