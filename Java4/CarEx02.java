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

    public String viewName() {
        return this.name;
    }
}

public class CarEx02 {
    public static void main(String[] args) {
        Car[] arr1 = new Car[3];
        Object[] arr2 = new Object[3];

        // 자동 형변환
        arr2[0] = new Car("tester1", 4, "red");
        arr2[1] = new Car("tester2", 3, "green");
        arr2[2] = new Car("tester3", 2, "blue");

        System.out.println( arr2[0] );

        Object obj = arr2[0];
        System.out.println( obj );
        System.out.println( obj.toString() );

        // System.out.println( obj.viewName() ); // error
        Car c = (Car)obj;
        System.out.println( c.viewName() );
    }
}
