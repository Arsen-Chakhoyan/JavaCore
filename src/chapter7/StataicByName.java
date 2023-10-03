package chapter7;

import chapter6.Stack;

public class StataicByName {
    public static void main(String[] args) {
        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}
