class Varargs {
    void doFunc( String ... args) {
        System.out.println("doFunc() 호출");

        // System.out.println(args.length);

        for( int i=0 ; i<args.length ; i++) {
            System.out.println(args[i]);
        }
    }
}

public class VarargsEx01 {
    public static void main(String[] args) {
        Varargs v = new Varargs();
        v.doFunc("1");
        v.doFunc("1", "2");
        v.doFunc("1", "2", "3");
    }
}
