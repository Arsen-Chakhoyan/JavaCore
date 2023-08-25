package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x  меньше  y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x равно y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x  больше y");
        }
        if (x == y) {
            System.out.println("этого я видеть не должен");
        }

    }

}
