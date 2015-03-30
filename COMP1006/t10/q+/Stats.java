import java.net.*;
import java.io.*;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.regex.*;
public class Stats {
	public static void main(String[] args) throws Exception  {
	//URL gutenberg = new URL("http://www.gutenberg.org/cache/epub/1342/pg1342.txt");
	FileReader gutenberg = new FileReader("pg1342.txt");
	//BufferedReader in = new BufferedReader(new InputStreamReader(gutenberg.openStream()));
	BufferedReader in = new BufferedReader(gutenberg);

	HashMap<String, Integer> wordmap = new HashMap<String, Integer>();

	String inputLine;
	while((inputLine = in.readLine()) != null) {
		inputLine = inputLine.trim();
		String[] words = inputLine.split("\\s+");
		for (String word : words) {
			word = word.toLowerCase().trim();
			word = word.replaceAll("\\W|\\_|\\d+", "");
			if (!word.equals("")) {
				if (wordmap.containsKey(word)) {
					wordmap.put(word, wordmap.get(word) + 1);
				} else {
					wordmap.put(word, 1);
				}
			}
		}
	}

	Comparator<Entry<String, Integer>> comp = new Comparator<Entry<String, Integer>>() {
		public int compare (Entry<String, Integer> c1, Entry<String, Integer> c2){
			return c1.getValue() - c2.getValue();
		}
	};

	in.close();
	Set<Entry<String, Integer>> wordset = wordmap.entrySet();
	Entry<String, Integer>[] words = (Entry<String, Integer>[])wordset.toArray(new Entry[0]);
	Arrays.sort(words, comp);
	for (int i = words.length-1; i > words.length-6; i--) {
		System.out.println(words[i].getKey() + ": " + words[i].getValue());
	}
	}
}