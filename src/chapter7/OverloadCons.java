package chapter7;

import chapter6.Box;

public class OverloadCons {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1  равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        vol = mycube.volume();
        System.out.println("Объем vycube равен " + vol);

    }
}
