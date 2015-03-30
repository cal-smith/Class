public class Runner extends SportsPerson {
	public Runner (String name, int age, boolean olympic) {
		super(name, age, olympic);
	}

	public String toString() {
		return super.toString() + (super.olympic?" in running":" and likes running");
	}	
}