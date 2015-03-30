public class QualityAssuranceSpecialist extends WorkPerson {
	int thingstocheck;
	public QualityAssuranceSpecialist(String name, int age, String workplace, String project, int t){
		super(name, age, workplace, project);
		this.thingstocheck = t;
	}

	public String toString() {
		return super.toString() + " and has " + this.thingstocheck + " things to quality check";
	}

	public void qualityCheckThings() {
		this.thingstocheck--;
	}

	public void addThings(int t) {
		this.thingstocheck += t;
	}
}