public class Main {
   static int count;

    public Main(){
        count++;

    }

    public static void main(String[] args){
        Main objec0 = new Main();
        Main objec1 = new Main();
        Main objec2 = new Main();
        Main objec3 = new Main();

        System.out.println(count);

    }
}
