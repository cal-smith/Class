public class Article {
	private String title;
	private String author;
	Issue issue;

	public Article (String t, String a, Issue i) {
		this.title = t;
		this.author = a;
		this.issue = i;
	}

	public Issue getIssue() { return this.issue; }
	public String getTitle() { return this.title; }
	public String getAuthor() { return this.author; }
}