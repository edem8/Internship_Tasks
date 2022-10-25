public class Rectangle {
    public int length;
    public int breadth;

    public Rectangle(int big, int small) {
        length = big;
        breadth = small;
    }

    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

}