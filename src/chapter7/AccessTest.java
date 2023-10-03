package chapter7;

public class AccessTest {
    public static void main(String[] args) {
        Test3PublicPrivate ob = new Test3PublicPrivate();

        ob.a = 10;
        ob.b = 20;

        //ob.c = 100;  Ошибка

        ob.setc(100); //Вено
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
