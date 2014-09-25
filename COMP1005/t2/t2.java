import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class t2{
	public static void main(String[] args) {
		List bleh = new ArrayList();
		bleh.add(1);
		bleh.add(2);
		bleh.add(3);
		bleh.add(4);
		System.out.println("multiply_list " + multiply_list(bleh));

		List wtf = new ArrayList();
		wtf.add("Hello");
		wtf.add(" ");
		wtf.add("World!");
		System.out.println("join_strings " + join_strings(wtf));

		System.out.println("square " + Arrays.toString(square(new int[] {0, 1, 2, 3, 4})));
		System.out.println("square " + Arrays.toString(square(new int[] {0, 1, 2, 2, 1, 0})));

		System.out.println("describe_seconds " + describe_seconds(5));
		System.out.println("describe_seconds " + describe_seconds(70));
		System.out.println("describe_seconds " + describe_seconds(3700));
		System.out.println("describe_seconds " + describe_seconds(90000));
	}

	public static int multiply_list(List <Integer> a){
		return a.stream().reduce(1, (x, y) -> x * y);
	}

	public static String join_strings(List <String> a){
		return a.stream().reduce("", (x, y) -> x + y);
	}

	public static int[] square(int[] a){
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * a[i];
		}
		return a;
	}

	public static String describe_seconds(int s){
		if (s < 60) {
			return s + " seconds";
		} else if (s < 3600) {
			return (s / 60) % 60 + " minutes and " + s % 60 + " seconds";
		} else if (s < 86400) {
			return ((s / 60) / 60) % 24 + " hours, " + (s / 60) % 60 + " minutes and " + s % 60 + " seconds";
		} else {
			return "a long time";
		}
	}
}