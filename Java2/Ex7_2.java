public class Ex7_2 {
    public static void main(String[] args) {
        Child7_2 c = new Child7_2();
        c.method();
    }
}

class Parent7_2 {
    int x = 10;
}

class Child7_2 extends Parent7_2 {
    int x = 20;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}