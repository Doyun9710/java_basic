public class ConditionEx03 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        // 점수계산
        // if ~ else if ~ else ~
        int score = 80;

        if( score >= 90 ) {
            System.out.println( "A" );
        }
        else if( score >= 80 ) {
            System.out.println( "B" );
        }
        else if( score >= 70 ) {
            System.out.println( "C" );
        }
        else if( score >= 60 ) {
            System.out.println( "D" );
        }
        else {
            System.out.println( "F" );
        }

        System.out.println( "끝" );
    }
}
