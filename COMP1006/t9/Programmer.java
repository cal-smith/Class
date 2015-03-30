public class Programmer extends WorkPerson {
	private String favoritelang;
	public Programmer(String name, int age, String workplace, String project, String fl){
		super(name, age, workplace, project);
		this.favoritelang = fl;
	}

	public String toString() { 
		return super.toString() + ". their favorite language is " + this.favoritelang; 
	}

	public String getFavoriteLang() { return this.favoritelang; }
}