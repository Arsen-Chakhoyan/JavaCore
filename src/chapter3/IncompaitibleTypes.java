package chapter3;

public class IncompaitibleTypes {
    public static void main(String[] args) {
        int i = 257;
        double d = 323.142;
        System.out.println("\nПереобразование типа int  в тип  byte. ");
        byte b = (byte) i;
        System.out.println("i  и b" + i + " " + b);
        System.out.println("\nПреобразование типа double  в  тип  int. ");
        i = (int) d;
        System.out.println("d  и i" + d + " " + i);
        System.out.println("\nПреобразование типа  double в тип  byte. ");
        b = (byte) ((int) d);
        System.out.println("d и b " + d + " " + b);
    }
}


