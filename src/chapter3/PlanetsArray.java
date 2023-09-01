package chapter3;

public class PlanetsArray {
    public static void main(String[] args) {
        String[] planets;

        String planet = "Меркурий";
        String planet1 = "Венера";
        String planet2 = "Земля";
        String planet3 = "Марс";
        String planet4 = "Юпитер";
        String planet5 = "Сатурн";
        String planet6 = "Уран";
        String planet7 = "Нептун";
        String planet8 = "Плутон";
        System.out.println(planet2 + " " + " это третья планета от солнца.");
        System.out.println("Самая маленькая планета солнечной системы это " + planet );

       //  Оба вида прописания кода приемлимы,

        String[] planets2 = {"Меркурий", "Венера", "Земля", "марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        System.out.println("В солнечной системе " + planets2.length + " планет." );
        System.out.println(planets2[2] + " -  Единственная ланета солнчной системы, 70% которого покрыто водой. ");
        System.out.println("Самая маленкьая планета солнечной системы это - " + planets2[0] );
    }

}




