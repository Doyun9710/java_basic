
public class Person {
	private String seq;
	private String name;
	private String phone;
	private String age;
	private String region;
	
	// setter 메서드 대용
	public Person(String seq, String name, String phone, String age, String region) {
		this.seq = seq;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.region = region;
	}

	public String getSeq() {
		return seq;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getAge() {
		return age;
	}

	public String getRegion() {
		return region;
	}
	
}
