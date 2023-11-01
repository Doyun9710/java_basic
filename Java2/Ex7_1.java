class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if( caption ) {
            System.out.println(text);
        }
    }
}

public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;   // 조상 클래스로부터 상속받은 멤버
        stv.channelUp();    // 조상 클래스로부터 상속받은 멤버
        System.out.println(stv.channel);
        stv.displayCaption("Hello, World");
        stv.caption = true; // 캡션(자막) 기능을 켠다
        stv.displayCaption("Hello, World");
    }
}
