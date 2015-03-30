public class Employee extends Person {
	private String company;
	public Employee(String n, String c) { super(n); this.company = c; }
	public String getCompany() { return this.company; }
	public void sayHello() {
	System.out.println("Hi, I am Employee");
	}

	public void greet(Person p) {
	p.greetBy(this);
	}

	public void greetBy (Person p){
		System.out.println("person greets an employee");
	}

	public void greetBy (Student s){
		System.out.println("student greets an employee");
	}

	public void greetBy (Employee e){
		System.out.println("employee greets an employee");
	}
}