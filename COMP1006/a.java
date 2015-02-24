public class a{
	public static class Ball {
		public int x;
		public int y;
	}

	public static void foo(){
		Ball b = new Ball();
		b.x = 5;
		b.y = 10;
		System.out.println(b.x + " " + b.y);
	}

	public static void main(String[] args) {
		foo();
		System.out.println("Hello, World!");
	}
}