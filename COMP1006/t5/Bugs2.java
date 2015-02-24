public class Bugs2 {
	public static void main(String[] args) {
		String [] words = new String[4];

		words[0] = "one"; 
		words[1] = "two";
		words[2] = "three";
		words[3] = "four";

		System.out.println("words has length = " + words.length);
		for (int i = 0;i < words.length; i++) {
			System.out.println(words[i] + " has length = " + words[i].length());
		}
	}
}