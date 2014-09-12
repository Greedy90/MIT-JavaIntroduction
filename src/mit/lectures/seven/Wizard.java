package mit.lectures.seven;

import java.util.ArrayList;

public class Wizard extends Dude {
	ArrayList<Spell> spell;

	public void cast(String spell) {
		// ...
		mp -= 10;
	}
}
