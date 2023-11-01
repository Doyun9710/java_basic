public class Q3_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        // float celcius = ( (5/9) * (fahrenheit-32) );
        float celcius = (int)(5/9f * (fahrenheit-32) * 100 + 0.5) / 100.0f;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}