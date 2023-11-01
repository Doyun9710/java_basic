// Util 클래스 안에 3개 수 입력 받아 최대값 반환하는 viewMaxNumber 메서드 선언

class Util {
    int viewMaxNumber( int num1, int num2, int num3 ) {
        int maxNum = num1;
        if( maxNum < num2 ) {
            maxNum = num2;
        }
        if( maxNum <num3 ) {
            maxNum = num3;
        }

        return maxNum;
    }
}

public class MethodEx02 {
    public static void main(String[] args) {
        Util u1 = new Util();
        int result = u1.viewMaxNumber(10, 40, 20);

        System.out.println("결과 : " + result);
    }
}
