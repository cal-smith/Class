import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UI {
	private BibliographyDatabase bdb;
	public UI () {
		this.bdb = new BibliographyDatabase(Journal.getSampleJournals());
	}

	public void addArticle() {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Journals: ");
			for (Journal j : this.bdb.getJournals()) {
				System.out.println("    " + j.getTitle());
			}
			System.out.print("Type the name of the journal (Type 0 to return to the main menu): ");
			String journaltofind = s.nextLine();
			if (journaltofind.equals("0")) {
				break;
			}
			for (Journal j : this.bdb.getJournals()) {
				if (j.getTitle().equals(journaltofind)) {
					System.out.println("Avliable Issues:");
					int issueno = 0;
					int volumeno = 0;
					for (Issue i : j.getIssues()) {
						System.out.println("Issue: "+ i.getIssueNo() 
								+" Volume: "+ i.getVolume() +" Published: "+ i.getYear()););
					}
					System.out.print("Issue number: ");
					issueno = s.nextInt();
					System.out.print("Volume number: ");
					volumeno = s.nextInt();
					s.nextLine();//reads the newline, because nextInt() doesn't
					for (Issue i : j.getIssues()) {
						if (i.getIssueNo() == issueno && i.getVolume() == volumeno) {
							String title = "";
							String name = "";
							System.out.println("Selected - " + "Issue: "+ i.getIssueNo() 
								+" Volume: "+ i.getVolume() +" Published: "+ i.getYear());
							System.out.print("Article Title: ");
							title = s.nextLine();
							System.out.print("Author Name: ");
							name = s.nextLine();
							this.bdb.addArticle(new Article(title, name, i));
							System.out.println("Added Article!\n");
							break;
						}
					}
				}
			}
		}
	}

	public void findArticlesFromYear() {
		Scanner s = new Scanner(System.in);
		System.out.print("Year: ");
		int year = s.nextInt();
		ArrayList<Article> articles_from_year = new ArrayList<Article>();
		for (Journal j : this.bdb.getJournals()) {
			for (Issue i : j.getIssues()) {
				if (i.getYear() == year){
					articles_from_year.addAll(i.getArticles());
				}
			}
		}
		System.out.println("Articles from " + year);
		for (Article a : articles_from_year) {
			System.out.println("    " + a.getAuthor() + ". " 
			+ a.getTitle() + ". " 
			+ a.getIssue().getJournal() + ", " 
			+ a.getIssue().getIssueNo() 
			+ "(" + a.getIssue().getVolume() + "), "
			+ a.getIssue.getYear());
		}
	}

	public void showMostPublished() {
		HashMap<String, Integer> authors = new HashMap<String, Integer>();
		String top_author = "";
		int top_author_published = 0;
		for (Journal j : this.bdb.getJournals()) {
			for (Issue i : j.getIssues()) {
				for (Article a : i.getArticles()) {
					if (authors.containsKey(a.getAuthor())){
						authors.put(a.getAuthor(), authors.get(a.getAuthor()) + 1);
					} else {
						authors.put(a.getAuthor(), 1);
					}
					if (authors.get(a.getAuthor()) > top_author_published) {
						top_author = a.getAuthor();
						top_author_published = authors.get(a.getAuthor());
					}
				}
			}
		}
		System.out.println("The most published author is: " + top_author + " with " + top_author_published + " publications");
	}

	public void display() {
		Scanner s = new Scanner(System.in);
		System.out.print("Magical Bibliography Database!");
		while (true) {
			System.out.println();
			System.out.println("Chose:");
			System.out.println("    1: Find articles from a given year");
			System.out.println("    2: Add an article to an issue");
			System.out.println("    3: Find the most-published author");
			System.out.println("    4: Exit");
			System.out.print("\nEnter your choice: ");
			int choice = s.nextInt();
			if (choice == 1) {
				this.findArticlesFromYear();
			}
			if (choice == 2) {
				this.addArticle();
			}
			if (choice == 3) {
				this.showMostPublished();
			}
			if (choice == 4) {
				System.out.println("This kills the program");
				break;
			}
		}
	}

	public static void main(String[] args) {
		UI ui = new UI();
		ui.display();
	}
}