import java.util.ArrayList;

public class TestClass {
	public static void main(String args[]) {
		Person p = new Person("John");
		Person s = new Student("Chris", "Carleton");
		Person e = new Employee("bob", "foocorp");

		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p);
		people.add(s);
		people.add(e);
		
		for(Person a : people){
			for (Person b : people) {
				a.greet(b);
			}
		}
	}
}