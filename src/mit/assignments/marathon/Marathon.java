package mit.assignments.marathon;

public class Marathon {

	public static int findFirst(int[] times) {
		int first = -1;
		int lowestTime = Integer.MAX_VALUE;

		for (int i = 0; i < times.length; i++) {
			if (times[i] < lowestTime) {
				lowestTime = times[i];
				first = i;
			}
		}

		return first;
	}

	public static int findSecond(int[] times, int first) {
		int second = -1;
		int secondLowestTime = Integer.MAX_VALUE;

		for (int i = 0; i < times.length; i++) {
			if (i == first) // already checked
				continue;
			if (times[i] < secondLowestTime && times[i] > times[first]) {
				secondLowestTime = times[i];
				second = i;
			}
		}

		return second;
	}

	public static void main(String[] args) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
				393, 299, 343, 317, 265 };

		for (int i = 0; i < names.length; i++)
			System.out.println(names[i] + ": " + times[i]);

		int first = findFirst(times);
		System.out.println("The fastest runner is " + names[first] + ", with "
				+ times[first] + " minutes.");
		int second = findSecond(times, first);
		System.out.println("The second fastest runner is " + names[second]
				+ ", with " + times[second] + " minutes.");
	}
}
