public class ArrayEx10 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        // 숫자 연산자(+, -, x, /) 숫자 = 결과
        // ex. 1 + 1 = 2, 4 / 2 = 2

        /*
         * javac -encoding utf-8 ArrayEx10.java
         * java ArrayEx10 1 x 2
         */

        if(args.length != 3) {
            System.out.println( "입력이 잘못되었습니다" );
            System.out.println( args.length );
        } else {
            switch( args[1] ) {
                case "+":
                    System.out.println( "결과 : " + ( Integer.parseInt(args[0]) + Integer.parseInt(args[2]) ) );
                    break;
                case "-":
                    System.out.println( "결과 : " + ( Integer.parseInt(args[0]) - Integer.parseInt(args[2]) ) );
                    break;
                case "x":
                    System.out.println( "결과 : " + ( Integer.parseInt(args[0]) * Integer.parseInt(args[2]) ) );
                    break;
                case "/":
                    System.out.println( "결과 : " + ( Integer.parseInt(args[0]) / Integer.parseInt(args[2]) ) );
                    break;
            }
        }

        System.out.println( "끝" );
    }
}
