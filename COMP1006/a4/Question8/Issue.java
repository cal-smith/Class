import java.util.ArrayList;

public class Issue {
	private int year_published;
	private int volume_no;
	private int issue_no;
	private ArrayList<Article> articles;
	private Journal journal;

	public Issue (int y, int v, int i, ArrayList<Article> a, Journal j) {
		this.year_published = y;
		this.volume_no = v;
		this.issue_no = i;
		this.articles = a;
		this.journal = j;
	}

	public Issue (int y, int v, int i, Journal j) {
		this(y, v, i, new ArrayList<Article>(), j);
	}

	public Journal getJournal() { return this.journal; }
	public int getYear() { return this.year_published; }
	public int getVolume() { return this.volume_no; }
	public int getIssueNo() { return this.issue_no; }
	public ArrayList<Article> getArticles() { return this.articles; }
}