package chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box mybox = new Box ();
        double vol;

        mybox.width = 20.5;
        mybox.height = 15.5;
        mybox.depth = 10.0;

       vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Объем равен " + vol );



    }
}
