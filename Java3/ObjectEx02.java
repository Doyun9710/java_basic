public class ObjectEx02 {
    public static void main(String[] args) {
        Person p = new Person(1002, "홍길동", 20);

        // 참조값 출력
        System.out.println(p);
        System.out.println(p.toString());

        // 내용값 출력
        // Person.java toString() 유무 : toString overriding
        String str = new String("Hello");
        System.out.println(str);
        System.out.println(str.toString());
    }
}
