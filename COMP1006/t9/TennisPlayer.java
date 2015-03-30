public class TennisPlayer extends SportsPerson {
	public TennisPlayer (String name, int age, boolean olympic) {
		super(name, age, olympic);
	}

	public String toString() {
		return super.toString() + (super.olympic?" in tennis":" and likes tennis");
	}
}