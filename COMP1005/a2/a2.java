/*
* Assignment 2
*/
import java.util.*;

public class a2{
	public static void main(String[] args) {
		System.out.println("factorial: " + factorial(5));
		System.out.println("factorial: " + factorial(10));
		System.out.println("factorial: " + factorial(24));
		System.out.println("add_list: " + add_list(new int[] {1, 1, 1, 1}));
		System.out.println("add_list: " + add_list(new int[] {1, 2, 3, 4}));
		System.out.println("add_list: " + add_list(new int[] {5, 10, 1, 3}));
		System.out.println("average: " + average(new int[] {1, 2, 3, 4}));
		System.out.println("average: " + average(new int[] {100, 80, 90, 50, 70, 20, 100}));
		System.out.println("average: " + average(new int[] {3, 2, 3, 3, 3, 3, 4}));
		System.out.println("threshold" + threshold(new int[] {1, 2, 5, 3, 6}, 4));
		System.out.println("threshold" + threshold(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, 6));
		System.out.println("threshold" + threshold(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, 11));	
		System.out.println("bmi: " + bmi_category(18.4));
		System.out.println("bmi: " + bmi_category(24));
		System.out.println("bmi: " + bmi_category(25));
		System.out.println("bmi: " + bmi_category(9001));
		System.out.println("log2: " + log2(8));
		System.out.println("log2: " + log2(9001));
		System.out.println("log2: " + log2(23));
	}

	/*
	* Question 1
	*/
	public static long factorial(int n){
		long sum = 1;
		for (int i = 1; i < n + 1; i++) {
			sum *= i;
		}
		return sum;
	}

	/*
	* Question 2
	*/
	public static long add_list(int[] a){
		long sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

	/*
	* Question 3
	*/
	public static float average(int[] a){
		return add_list(a) / a.length;
	}

	/*
	* Question 4
	*/
	public static List threshold(int[] a, int x){
		List hold = new ArrayList(); 
		for (int i : a) {
			if (i >= x) {
				hold.add(i);
			}
		}
		return hold;
	}

	/*
	* Question 5
	*/
	public static String bmi_category(double bmi){
		if (bmi < 18.5) {
			return "underweight";
		} else if (bmi < 25) {
			return "normal";
		} else if (bmi < 30) {
			return "overweight";
		} else {
			return "obese";
		}
	}

	/*
	* Question 6
	*/
	public static int log2(int n){
		int x = 0;
		while (n > 1) {
			n = n / 2;
			x++;
		}
		return x;
	}
}