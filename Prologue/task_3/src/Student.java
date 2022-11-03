public class Student {
    public int rollNum;
    public String studName;
    public int mark1, mark2, mark3, totalMarks;

    //constructor of the student class
    public Student(){

    }

    public void setStudDetails(int roll_Num, String stud_Name, int mrk1, int mrk2, int mrk3){
        rollNum = roll_Num;
        studName = stud_Name;
        mark1 = mrk1;
        mark2 = mrk2;
        mark3 = mrk3;

    }

    public void calculateTotal(){
        totalMarks = mark1 + mark2 + mark3;
    }

    public void displayStuDetails(){
        System.out.println("Student Name: " + studName);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Totalmarks: " + totalMarks);

    }

}
