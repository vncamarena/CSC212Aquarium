package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

import me.jjfoley.gfx.GFX;

/**
 * Aquarium is a graphical "application" that uses some code I built and have
 * shared with you that takes care of opening a window and communicating with
 * the user in a simple way.
 * 
 * The method draw is called 50 times per second, so we make an animation by
 * drawing our fish in one place, and moving that place slightly. The next time
 * draw gets called, our fish looks like it moved!
 * 
 * @author jfoley
 *
 */
public class Aquarium extends GFX {
	/**
	 * This is a static variable that tells us how wide the aquarium is.
	 */
	public static int WIDTH = 500;
	/**
	 * This is a static variable that tells us how tall the aquarium is.
	 */
	public static int HEIGHT = 500;

	/**
	 * Put a snail on the top of the tank.
	 */
	Snail algorithm = new Snail(177, Snail.HEIGHT + 1, "top");

	/**
	 * This is a constructor, code that runs when we make a new Aquarium.
	 */
	public Aquarium() {
		// Here we ask GFX to make our window of size WIDTH and HEIGHT.
		// Don't change this here, edit the variables instead.
		super(WIDTH, HEIGHT);
	}

	int fish1X = getWidth() + 100;
	int fish2X = getWidth() + 300;
	//the red fish x-component
	int fish3x = -100;
	
	Fish nemo = new Fish(250, 250, Color.MAGENTA);
	Fish marlin = new Fish(100, 100, Color.ORANGE);
			

	@Override
	public void draw(Graphics2D g) {
		// Draw the "ocean" background.
		g.setColor(Color.blue);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		DrawFish.smallFacingLeft(g, nemo.color, nemo.x, nemo.y);

		// Draw the fish!
		DrawFish.facingLeft(g, Color.yellow, fish1X, 200);
		// Draw the confused fish!
		DrawFish.facingRight(g, Color.green, fish2X, 300);

		// What if we wanted this little fish to swim, too?
		DrawFish.smallFacingLeft(g, Color.red, fish3x, 100);

		// Draw our snail!
		algorithm.draw(g);

		// Move the fish!
		fish1X -= 1;
		fish2X -= 2;
		fish3x -= 3;
		if (fish3x > getWidth()+50) {
			fish3x = -100;
		}
	}

	public static void main(String[] args) {
		// Uncomment this to make it go slower!
		// GFX.FPS = 10;
		// This is potentially helpful for debugging movement if there are too many print statements!

		// Note that we can store an Aquarium in a variable of type GFX because Aquarium
		// is a very specific GFX, much like 7 can be stored in a variable of type int!
		GFX app = new Aquarium();
		app.start();
	}

}
