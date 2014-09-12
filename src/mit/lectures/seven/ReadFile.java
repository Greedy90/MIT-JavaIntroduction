package mit.lectures.seven;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// Path names are relative to project directory
		FileReader fr = new FileReader("./src/mit/lectures/seven/BigRig.java");
		BufferedReader br = new BufferedReader(fr);
		String line = null;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
	}

}
