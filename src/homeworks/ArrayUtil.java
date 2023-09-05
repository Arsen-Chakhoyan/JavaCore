package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.print("1) Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով");
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("2) Տպել մասիվի առաջին էլեմենտը");
        System.out.println(numbers[0]);
        System.out.println("3) Տպել մասիվի վերջին էլեմենտը");
        System.out.println(numbers.length - 1);
        System.out.println("4) Տպել մասիվի երկարությունը");
        System.out.println(numbers.length);
        System.out.println("5) Տպել մասիվի ամենափոքր թիվը");
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);

        System.out.println("6) Տպել մասիվի մեջտեղի թիվը");

        System.out.println(numbers[numbers.length / 2]);

        System.out.println("7) Հաշվել ու տպել մասիվում զույգերի քանակը");
        int evenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println("զույգերի քանակը - " + evenNumbers);


        System.out.println("8) Հաշվել ու տպել մասիվում կենտերի քանակը");
        int oddNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumbers++;
            }
        }
        System.out.println("կենտերի քանակը - " + oddNumbers);

        System.out.println("9) Տպել մասիվում էլեմենտների գումարը");

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("մասիվի էլեմենտների գումարը - " + sum);

        System.out.println("10) Տպել մասիվում թվերի միջին թվաբանականը ");
        System.out.println(sum / numbers.length);


    }

}
