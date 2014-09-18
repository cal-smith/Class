import java.util.*;

public class t1{
	public static void main(String[] args) {
		System.out.println(kilometers2miles(5));
		System.out.println(circumference(2));
		System.out.println(average(1, 3));
		greet("Bob");
		System.out.println(s2dhms(90061));
		System.out.println(dhms2s(1, 1, 1, 1));
	}

	public static double kilometers2miles (int d){
		return (d * 0.62137);
	}

	public static double circumference (int r){
		return ((2 * 3.1415) * r);
	}

	public static int average (int x, int y){
		return ((x + y) / 2);
	}

	public static void greet (String name){
		System.out.format("Hi, %s\n", name);
	}

	public static String s2dhms (int t){
		int[] datetime = {(((t / 60) / 60) / 24), (((t / 60) / 60) % 24), ((t / 60) % 60), (t % 60)};
		return (Arrays.toString(datetime));
	}

	public static int dhms2s (int d, int h, int m, int s){
		return (((((d * 24) * 60) * 60) + ((h * 60) * 60) + (m * 60) + s));
	}
}