
public class Student {
	private String num;
	private String name;
	private int kor;
	private int en;
	private int math;
	
	static int sum = 0;
	static int avg = 0;

	public Student(String num, String name, int kor, int en, int math) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.en = en;
		this.math = math;
		
		sum += kor + en + math;
		// System.out.println( name + " : " + sum );
	}
	
	public String getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEn() {
		return en;
	}

	public int getMath() {
		return math;
	}

	public static int getSum() {
		return sum;
	}

	public static int getAvg() {
		return sum/5;
	}


}
