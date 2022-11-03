public class Employee {
    public  int id;
    public int Salary;
    public String firstName;
    public String lastName;

    public Employee(int id, String firstName, String lastName, int Salary){
    this.id = id;
    this.firstName =firstName;
    this.lastName = lastName;
    this.Salary = Salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getAnnualSalary(){
        return Salary * 12;
    }

    public int raiseSalary(int percent){
        Salary += (0.1 * Salary);
        return (Salary);
    }

    public String toString(){
        return "Employee[id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Salary=" + Salary + "]";
    }
}
