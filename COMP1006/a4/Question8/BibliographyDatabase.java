import java.util.ArrayList;

public class BibliographyDatabase {
	private ArrayList<Journal> journals;

	public BibliographyDatabase() {
		this.journals = new ArrayList<Journal>();
	}

	public BibliographyDatabase(ArrayList<Journal> j) {
		this.journals = new ArrayList<Journal>();
		this.journals.addAll(j);
	}

	public void addJournal(Journal j) {
		this.journals.add(j);
	}

	public void addIssue(Issue issueToAdd) {
		issueToAdd.getJournal().getIssues().add(issueToAdd);
	}

	public void addArticle(Article articleToAdd) {
		articleToAdd.getIssue().getArticles().add(articleToAdd);
	}

	public void addJournals(ArrayList<Journal> journals) {
		this.journals.addAll(journals);
	}

	public void removeJournal(Journal j) {
		this.journals.remove(j);
	}

	public void removeIssue(Issue i) {
		i.getJournal().getIssues().remove(i);
	}

	public void removeArticle(Article a) {
		a.getIssue().getArticles().remove(a);
	}

	public ArrayList<Journal> getJournals() { return this.journals; }
}