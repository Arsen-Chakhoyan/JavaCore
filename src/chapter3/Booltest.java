package chapter3;

public class Booltest {public static void main(String[] args) {
    boolean b = false;
    System.out.println("b равно " + b);
    b = true;
    System.out.println("b  равно " + b);
    if (b) {
        System.out.println(" Этот код выполнится.");
    }

    b = false;
    if (b) {
        System.out.println("Этот код не выполнится.");
    }

    System.out.println("10 > 9  равно true");
}
}

