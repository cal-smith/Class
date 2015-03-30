public class Skiier extends SportsPerson {
	public Skiier (String name, int age, boolean olympic) {
		super(name, age, olympic);
	}

	public String toString() {
		return super.toString() + (super.olympic?" in skiing":" and likes skiing");
	}
}