class Student {
	String name;
	String bunho;
	int age;
	double height;
	double weight;
}

public class StudentMain01 {
    public static void main(String[] args) {
        // 참조 변수 선언
        Student stu1;

        // 참조 변수 생성
        stu1 = new Student();

        // 초기화 -> 멤버 필드 초기화
        stu1.name = "홍길동";
        stu1.bunho = "1001";
        stu1.age  = 20;
        stu1.height = 180.5;
        stu1. weight = 80;
        
        System.out.println( stu1 ); // Student@2f92e0f4
        System.out.println( stu1.name );
        System.out.println( stu1.bunho );



        // 선언과 동시 생성
        Student stu2 = new Student();

        stu2.name = "박문수";
        stu2.bunho = "1002";
        stu2.age  = 22;
        stu2.height = 170.0;
        stu2. weight = 75.0;

        System.out.println( stu2.name );
        System.out.println( stu2.bunho );
    }
}