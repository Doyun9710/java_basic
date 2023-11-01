class Time3 {
    private int hour;
    private int minute;
    private int second;

    public int getHour() { return hour; }
    public void setHour(int hour) {
        if( hour < 0 || hour > 23 ) return;
        this.hour = hour;
    }
    public int getMinute() { return minute; }
    public void setMinute(int minute) {
        if( minute < 0 || minute > 59 ) return;
        this.minute = minute;
    }
    public int getSecond() { return second; }
    public void setSecond(int second) {
        if( second < 0 || second > 59 ) return;
        this.second = second;
    }
}

public class ModifierEx03 {
    public static void main(String[] args) {
        Time3 t = new Time3();

        t.setHour(14);
        t.setMinute(40);
        t.setSecond(23);
        System.out.println("시간 : " + t.getHour() + "시 " + t.getMinute() + "분 " + t.getSecond() + "초");
    }
}
