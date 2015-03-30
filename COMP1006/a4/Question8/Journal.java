import java.util.ArrayList;

public class Journal {
	private String title;
	private ArrayList<Issue> issues;

	public Journal(String t, ArrayList<Issue> i) {
		this.title = t;
		this.issues = i;
	}

	public Journal(String t) {
		this(t, new ArrayList<Issue>());
	}

	public String getTitle() { return this.title; };
	public ArrayList<Issue> getIssues() { return this.issues; }

	public static ArrayList<Journal> getSampleJournals() {
		BibliographyDatabase bdb = new BibliographyDatabase();

		Journal thinkjournal = new Journal("Think Journal");
		Issue thinkone = new Issue(2014, 2, 5, thinkjournal);
		Article one = new Article("Magic in Java", "Bill", thinkone);
		Article two = new Article("Magic in C++", "Bob", thinkone);
		Issue thinktwo = new Issue(2013, 1, 1, thinkjournal);
		Article three = new Article("DOOM in JavaScript", "Bill", thinktwo);
		Article four = new Article("JavaScript: Assembly for the Web", "Bill", thinktwo);

		bdb.addJournal(thinkjournal);
		bdb.addIssue(thinkone);
		bdb.addArticle(one);
		bdb.addArticle(two);
		bdb.addIssue(thinktwo);
		bdb.addArticle(three);
		bdb.addArticle(four);

		Journal py = new Journal("PyJournal");
		Issue pyone = new Issue(2014, 10, 1, py);
		Article five = new Article("Python, Decorators, and You", "Joe", pyone);
		Article six = new Article("Python in the Browser via emscripten", "Bill", pyone);
		Issue pytwo = new Issue(2010, 7, 12, py);
		Article seven = new Article("Pythons C interface", "Bob", pytwo);
		Article eight = new Article("Optimized Tree Traversal", "Joe", pytwo);

		bdb.addJournal(py);
		bdb.addIssue(pyone);
		bdb.addArticle(five);
		bdb.addArticle(six);
		bdb.addIssue(pytwo);
		bdb.addArticle(seven);
		bdb.addArticle(eight);

		return bdb.getJournals();
	}
}