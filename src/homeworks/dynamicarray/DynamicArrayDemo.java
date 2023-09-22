package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
//        for (int i = 0; i < 3000; i++) {
//            da.add(i + 1);
//        }
//        da.print();
        da.add(7);
        da.add(4);
        da.add(1);
        int a = da.getByIndex(20);
        System.out.println(a);

    }


}
