public class SportsPerson extends Person {
	boolean olympic;
	public SportsPerson (String name, int age, boolean o) {
		super(name, age);
		this.olympic = o;
	}

	public String toString() {
		return super.toString() + (olympic?" and is training for the olympics":" and likes sports");
	}

	public boolean isOlympic() { return this.olympic; }
}