public class Person {
	private String name;
	public Person(String n) { this.name = n; }
	public String getName() { return this.name; }

	public void greet(Person p) {
	p.greetBy(this);
	}

	public void greetBy (Person p){
		System.out.println("person greets a person");
	}

	public void greetBy (Student s){
		System.out.println("student greets a person");
	}

	public void greetBy (Employee e){
		System.out.println("employee greets a person");
	}
}