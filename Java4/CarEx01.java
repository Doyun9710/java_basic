class Car {
    private String name;
    private int numberOfWheels;
    private String color;

    Car( String name, int numberOfWheels, String color ) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    public String toString() {
        return "Car [ name = " + name + " ]";
    }
}

public class CarEx01 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        Car[] arr2 = new Car[3];
        /*
        Car c1 = new Car("tester1", 4, "red");
        Car c2 = new Car("tester2", 3, "green");
        Car c3 = new Car("tester3", 2, "blue");

        arr2[0] = c1;
        arr2[1] = c2;
        arr2[2] = c3;
        */

        arr2[0] = new Car("tester1", 4, "red");
        arr2[1] = new Car("tester2", 3, "green");
        arr2[2] = new Car("tester3", 2, "blue");

        System.out.println( arr2[0] );
    }
}
