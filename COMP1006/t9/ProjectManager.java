public class ProjectManager extends WorkPerson {
	public ProjectManager(String name, int age, String workplace, String project){
		super(name, age, workplace, project);
	}

	public String toString() {
		return "project manager " + super.toString();
	}
}