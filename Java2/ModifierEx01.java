class Modifier1 {
    String data1 = "default";
    public String data2 = "public";
    protected String data3 = "protected";
    private String data4 = "private";

    void method1() { System.out.println("default"); }
    public void method2() { System.out.println("public"); }
    protected void method3() { System.out.println("protected"); }
    private void method4() { System.out.println("private"); }

    void viewData() {
        System.out.println( this.data1 );
        System.out.println( this.data2 );
        System.out.println( this.data3 );
        System.out.println( this.data4 );
    }
}

public class ModifierEx01 {
    public static void main(String[] args) {
        Modifier1 m = new Modifier1();
        // System.out.println( m.data1 );
        // System.out.println( m.data2 );
        // System.out.println( m.data3 );
        // System.out.println( m.data4 );  // error, 접근 불가

        m.viewData();

        m.method1();
        m.method2();
        m.method3();
    }
}
