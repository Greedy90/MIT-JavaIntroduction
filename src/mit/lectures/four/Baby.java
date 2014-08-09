package mit.lectures.four;

public class Baby {
	String name;
	double weight;
	boolean isMale;
	int numPoops;
	Baby[] siblings;
	
	static int numBabiesMade = 0;

	public Baby(String name, double weight, boolean isMale) {
		this.name = name;
		this.weight = weight;
		this.isMale = isMale;
		numBabiesMade++;
	}

	public String sayHi() {
		return "Hi, my name is.. " + name;
	}

	public void eat(double foodWeight) {
		if (foodWeight > 0 && foodWeight < weight)
			weight += foodWeight;
	}

	public void poop() {
		numPoops++;
		System.out.println("Burp...");
	}

	public static void main(String[] args) {
		
	}

}
