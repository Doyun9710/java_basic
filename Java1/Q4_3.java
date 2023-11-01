public class Q4_3 {
    public static void main(String[] args) {

        int sum = 0;
        String count = "0 \n";
        for (int i = 1; i <= 10; i++) {
            if( i != 1 ) {
                count += " + ";
            }
            count += "(";
            for (int j = 1; j <= i; j++) {
                sum += j;
                if( j != 1 ) {
                    count += " + ";
                }
                count += j;
                // System.out.println( count );
            }
            count += ")\n";
        }
        count += " = ";
        System.out.print( count );
        System.out.println(sum);
    }
}
