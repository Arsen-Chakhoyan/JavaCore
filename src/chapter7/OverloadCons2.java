package chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(12, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        Box1 myclone = new Box1 (mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем myox1 равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        vol = mycube.volume();
        System.out.println("Объем куба равен " + vol);

        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);


    }
}
