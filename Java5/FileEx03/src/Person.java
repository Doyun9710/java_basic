import java.io.Serializable;

public class Person implements Serializable {

	private String name;
	private String phone;
	private int age;
	transient private String address;	// transient : 직렬화 제외
	
	public Person(String name, String phone, int age, String address) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
	public String toString() {
		return name + " " + phone + " " + age + " " + address;
	}

}
