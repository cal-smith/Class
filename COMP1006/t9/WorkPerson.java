public class WorkPerson extends Person {
	private String workplace;
	private String project;
	public WorkPerson(String name, int age, String w, String p){
		super(name, age);
		this.workplace = w;
		this.project = p;
	}

	public String toString() {
		return super.toString() + " and works at " + this.workplace;
	}

	public String getWorkplace() { return this.workplace; }
	protected String getProject() { return this.project; }
	protected void setProject(String p) { this.project = p; }
}