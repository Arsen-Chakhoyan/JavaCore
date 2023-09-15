package chapter6;

public class Box {

    double width;
    double height;
    double depth;

    Box (double w, double h, double d) {    // Параметризованный конструктор

        width = w;
        height = h;
        depth = d;
    }

    Box() {             //Конструктор

        width = 10;
        height= 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }

    void setDim (double w, double h, double d) {

        width = w;
        height = h;
        depth = d;
    }

//    void volume() {
//        System.out.print("Объем равен ");
//        System.out.println(width * height * depth);
//    }



}
