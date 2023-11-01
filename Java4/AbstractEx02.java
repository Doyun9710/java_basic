abstract class Parent {
    abstract void viewParent();
}

abstract class Child extends Parent {
    // void viewParent() {};
}

class GrandChild extends Child {
    void viewParent(){};
}

public class AbstractEx02 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
    }
}
