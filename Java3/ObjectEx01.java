public class ObjectEx01 {
    public static void main(String[] args) {
        // Object
        Object o1 = new Object();

        // 참조값 출력
        // java.lang.Object@372f7a8d
        // java.lang.Object : 클래스 이름, 자료형
        // @372f7a8d : 해시코드(16진수), 참조값
        System.out.println(o1);
        System.out.println(o1.toString());

        String value = o1.toString();
        System.out.println(value);

        // 클래스 이름 불러오기
        // java.lang.Object
        System.out.println(o1.getClass().getName());

        // 해시코드 불러오기
        // 925858445(10진수)
        System.out.println(o1.hashCode());
        System.out.printf("%x\n", o1.hashCode());
    }
}
