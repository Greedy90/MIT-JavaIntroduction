package mit.lectures.six;

public class AssertionTest {

	public static int findMinimum(int[] marathonTimes) {
		int minTime = Integer.MAX_VALUE;

		for (int i = 0; i < marathonTimes.length; i++) {
			if (marathonTimes[i] < minTime)
				minTime = marathonTimes[i];
		}

		return minTime;
	}

	public static void printDifferenceFromFastest(int[] marathonTimes) {
		int fastestTime = findMinimum(marathonTimes);

		for (int time : marathonTimes) {
			int difference = time - fastestTime;
			assert difference >= 0;
			System.out.println("Difference: " + difference);
		}
	}

	public static void main(String[] args) {
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
				393, 299, 343, 317, 265 };
		
		printDifferenceFromFastest(times);
	}

}
