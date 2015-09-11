class HelloThreads implements Runnable {
	int s = 0;
	String name;

	public HelloThreads(String name){
		this.name = name;
	}

	public HelloThreads(int s, String name) {
		this.s = s;
		this.name= name;
	}

	public void run() {
		try {
			Thread.sleep(this.s);
		} catch (InterruptedException e) {
			System.out.println("boom");
			System.out.println(e);
		}
		System.out.println("thread" + this.name);
	}
}

class A<T extends Number> {
	T data;
	public A(T d){
		this.data = d;
	}

	public String toString() {
		return this.data.toString();
	}

	public T value() { return this.data; }
}

public class generics {
	public static void main(String[] args) {
		A<Float> a = new A<Float>(2.2f);
		A<Integer> b = new A<Integer>(1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.value() + b.value());
		(new Thread(new HelloThreads("one"))).start();
		(new Thread(new HelloThreads(2000, "two"))).start();
		(new Thread(new HelloThreads(500, "three"))).start();
		(new Thread(new HelloThreads(10, "four"))).start();
	}
}