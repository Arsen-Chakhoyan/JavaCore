package homeworks.arrayUtil;

public class ArrayUtil {
    void numbersArray() {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    void firstElement() {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println("First element " + numbers[0]);
    }

    void lastElement() {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println("Last element " + numbers[numbers.length - 1]);
    }

    void lenght() {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.println("Massive lenght is " + numbers.length);
    }
     void minimum() {
         int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

         int min = numbers[0];
        for(
    int i = 1;
    i<numbers.length;i++)

    {
        if (numbers[i] < min) {
            min = numbers[i];

        }
    }
        System.out.println("min "+min);}

    void middleNum () {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        if(numbers.length >2)

    {
        if (numbers.length % 2 == 0) {
            System.out.println("middle number " +
                    numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
        } else {
            System.out.println("middle number " +
                    numbers[numbers.length / 2]);

        }
    }else

    {
        System.out.println("Can`t print middle values");
    }}
     void EvenCount() {
         int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

         int evenCount = 0;
         for (
                 int i = 0;
                 i < numbers.length; i++) {
             if (numbers[i] % 2 == 0) {
                 evenCount++;
             }
         }
         System.out.println("evenCount " + evenCount);
     }

     void oddCount() {
         int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

         int oddCount = 0;
         for (
                 int i = 0;
                 i < numbers.length; i++) {
             if (numbers[i] % 2 != 0) {
                 oddCount++;
             }
         }

         System.out.println("oddCount " + oddCount);
     }

     void sum() {
         int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

         int sum = 0;
        for(
    int i = 0;
    i<numbers.length;i++)

    {
        sum += numbers[i];
    }
        System.out.println("Sum "+sum);
        System.out.println("Avg "+sum /numbers.length);
}

}
