public class ObjectEx03 {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 10;

        // 내용값 비교
        System.out.println(a1 == a2);       // true



        Object o1 = new Object();
        Object o2 = new Object();

        // 참조값 비교
        System.out.println(o1 == o2);       // false
        System.out.println(o1.equals(o2));  // false



        String str1 = new String("홍길동");
        String str2 = new String("홍길동");

        // 참조값 비교
        System.out.println(str1 == str2);       // false
        // 내용값 비교
        System.out.println(str1.equals(str2));  // true



        Person p1 = new Person(1001, "김철수", 20);
        Person p2 = new Person(1001, "김철수", 20);

        System.out.println(p1 == p2);       // false
        System.out.println(p1.equals(p2));  // false -> Person.java equals() 재정의 -> true
    }
}
