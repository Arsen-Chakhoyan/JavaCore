package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
//        for (int i = 0; i < 3000; i++) {
//            da.add(i + 1);
//        }
//        da.print();
        da.add(6);
        da.add(5);
        da.add(8);
        da.add(6);
        da.add(7);
//        int a = da.getByIndex(0);
//        System.out.println(a);

        da.print();
//        da.deleteByIndex(2);
//        da.print();

//        da.set(2, 88);

//        da.add(2, 88);
//        System.out.println(da.exists(6));
//        System.out.println(da.exists(66));

        System.out.println(da.getIndexByValue(6));
    }


}
