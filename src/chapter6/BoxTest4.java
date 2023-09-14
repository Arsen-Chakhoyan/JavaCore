package chapter6;

public class BoxTest4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.height = 10;
        mybox1.width = 20;
        mybox1.depth= 15;

        mybox2.height = 3;
        mybox2.width = 6;
        mybox1.depth = 9;

        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);


    }
}
