package chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed = 186000;
        long days = 1000;
        long seconds = days * 24 * 60 * 60;
        long distance = (long) lightspeed * seconds;
        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(" " + distance + " миль. ");
    }
}

