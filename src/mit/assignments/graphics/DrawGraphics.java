package mit.assignments.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	BouncingBox box;
	ArrayList<BouncingBox> boxes;

	/** Initializes this class for drawing. */
	public DrawGraphics() {
		box = new BouncingBox(200, 50, Color.RED);
		box.setMovementVector(50, -50);

		BouncingBox greenBox = new BouncingBox(10, 10, Color.GREEN);
		greenBox.setMovementVector(10, 32);
		BouncingBox yellowBox = new BouncingBox(100, 100, Color.YELLOW);
		yellowBox.setMovementVector(30, -21);
		BouncingBox blueBox = new BouncingBox(200, 200, Color.BLUE);
		blueBox.setMovementVector(-2, 99);

		boxes = new ArrayList<BouncingBox>(3);
		boxes.add(greenBox);
		boxes.add(yellowBox);
		boxes.add(blueBox);
	}

	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface) {
		/* surface.drawLine(50, 50, 250, 250); */
		box.draw(surface);

		surface.drawOval(10, 10, 280, 280);
		surface.drawOval(70, 70, 50, 50);
		surface.drawOval(180, 70, 50, 50);
		surface.drawArc(50, 100, 200, 100, 0, -180);

		for (BouncingBox b : boxes)
			b.draw(surface);
	}
}