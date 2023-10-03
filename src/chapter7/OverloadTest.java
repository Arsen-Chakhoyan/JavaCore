package chapter7;

public class OverloadTest {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);
    }
}
