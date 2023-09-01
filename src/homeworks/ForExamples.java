package homeworks;

public class ForExamples {
    public static void main(String[] args) {

        System.out.println("Напечатать числа от 1 до 1000 с тире");

        for (int i = 1; i <= 1000; i++) {
            System.out.print("-" + i);

        }

        System.out.println();
        System.out.println("Напечатать все четные числа от 1 до 100 ");

        for (int j = 1; j < 100; j++) {
            if (j % 2 == 0) {
                System.out.print(" - " + j);
            }

        }
        System.out.println();
        System.out.println("Найти и напечатать самое большое число в массиве");


        int[] array = {2, 5, 8, 4, 9, 3, 7};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

    }
}




