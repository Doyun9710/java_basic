public class ConditionEx05 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        String data = "10";

        switch( data ) {
            case "10":
                System.out.println( "10" );
                break;
            case "20":
                System.out.println( "20" );
                break;
            case "30":
                System.out.println( "30" );
                break;
            default : 
                System.out.println( "기타" );
        }

        System.out.println( "끝" );
    }
}
