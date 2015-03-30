public class Student extends Person {
	private String school;
	public Student(String n, String s) { super(n); this.school = s; }
	public String getSchool() { return this.school; }

	public void greet(Person p) {
	p.greetBy(this);
	}

	public void greetBy (Person p){
		System.out.println("person greets a student");
	}

	public void greetBy (Student s){
		System.out.println("student greets a student");
	}

	public void greetBy (Employee e){
		System.out.println("employee greets a student");
	}
}