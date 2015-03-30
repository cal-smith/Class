public class TestPerson {
	public static void main(String[] args) {
		Person a = new Person("a", 100);
		System.out.println(a);
		WorkPerson bill = new WorkPerson("bill", 20, "abc ltd", "things");
		System.out.println(bill);
		Programmer bob = new Programmer("bob", 20, "foocorp", "magic", "python");
		System.out.println(bob);
		ProjectManager jane = new ProjectManager("jane", 21, "foocorp", "magic");
		System.out.println(jane);
		QualityAssuranceSpecialist george = new QualityAssuranceSpecialist("george", 30, "bar inc", "awesome", 10);
		System.out.println(george);
		george.qualityCheckThings();
		System.out.println(george);
		george.addThings(4);
		System.out.println(george);

		SportsPerson jerry = new SportsPerson("jerry", 22, false);
		System.out.println(jerry);
		Skiier jenny = new Skiier("jenny", 25, true);
		System.out.println(jenny);
	}
}