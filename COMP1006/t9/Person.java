public class Person {
	private String name;
	private int age;
	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public String toString() {
		return this.name + " is " + this.age;
	}

	public String getName() { return this.name; }
	public int getAge() { return this.age; }
}