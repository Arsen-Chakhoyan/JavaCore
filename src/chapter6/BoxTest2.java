package chapter6;

public class BoxTest2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10.0;
        mybox1.height = 20.0;
        mybox1.depth = 30.0;

        mybox2.width =  5.5;
        mybox2.height = 10.5;
        mybox2.depth = 15.8;

        vol = mybox1.height * mybox1.width * mybox1.depth;
        System.out.println("Объем первой коробки равен "  + vol);
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем второй коробки " + vol);


    }


}
