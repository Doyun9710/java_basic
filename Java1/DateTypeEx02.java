public class DateTypeEx02 {
    public static void main(String[] args) {
        // char : 문자 ''
        // string : 문자열 ""

        // char c1 = 'A';
        char c1 = '한';
        System.out.println( c1 );

        // code
        // 영어, 숫자, 특수 : ascii
        char c2 = 97;
        System.out.println(c2); // a

        c2 = 97 + 2;
        System.out.println(c2); // c

        // 다국어 : unicode
        char c3 = '\uc790';
        System.out.println(c3); // 자
    }
}
