public class TypeCastingEx01 {
    public static void main(String[] args) {
        // 형변환
        // 작은 자료형 -> 큰 자료형 : 묵시적(자동) 형변환
        // 큰 자료형 -> 작은 자료형 : 명시적 형변환

        short s1 = 10;
        int i1 = s1;
        System.out.println( i1 );

        float f1 = 10.0f;
        double d1 = f1;
        System.out.println( d1 );

        char c1 = 'A';
        int i2 = c1;
        System.out.println( i2 );   // ascii, 65



        // 
        int i3 = 10;
        // short s2 = i3;              // Error
        short s2 = (short)i3;
        System.out.println( s2 );

        char c2 = 'A';
        int i4 = c2 + 3;
        System.out.println( i4 );       // 68
        char c3 = (char)i4;
        System.out.println( c3 );       // D
    }
}
