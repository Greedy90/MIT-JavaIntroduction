package mit.lectures.five;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, String> strings = new HashMap<String, String>();
		
		strings.put("Evan", "evan@mit.edu");
		strings.put("Eugene", "eugene@mit.edu");
		strings.put("Adam", "adam@mit.edut");
		
		System.out.println(strings.size());
		
		strings.remove("Evan");
		System.out.println(strings.get("Eugene"));
		
		for(String s : strings.keySet())
			System.out.println(s);
		
		for(String s : strings.values())
			System.out.println(s);
		
		for(Map.Entry<String, String> pairs : strings.entrySet())
			System.out.println(pairs);
	}

}
