// Util 클래스 안에 단수를 입력받아 구구단 출력하는 doGugudan 메서드 선언
// doGuguda(1) - 1단 출력

class Util {
    void doGugudan(int ... args) {  // ellipsis 
        System.out.println( args );
        for( int i=0 ; i<args.length ; i++ ){
            for( int j=1 ; j<10 ; j++ ) {
                System.out.println( args[i] + " X " + j + " = " + (args[i] * j) );
            }
        }
    }
}

public class VarargsEx02 {
    public static void main(String[] args) {
        Util u1 = new Util();
        u1.doGugudan(3, 5);
    }
}
