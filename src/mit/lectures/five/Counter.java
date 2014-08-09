package mit.lectures.five;

public class Counter {
	private int myCount;
	static int classCount = 0;

	public Counter() {
		myCount = 0;
	}

	public int getMyCount() {
		return myCount;
	}

	public void increment() {
		myCount++;
		classCount++;
	}

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();

		counter1.increment();
		counter1.increment();
		counter2.increment();

		System.out.println("Counter 1: " + counter1.getMyCount()
				+ ", counter class: " + Counter.classCount);
		System.out.println("Counter 2: " + counter2.getMyCount()
				+ ", counter class: " + Counter.classCount);
	}
}
