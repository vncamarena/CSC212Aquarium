package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	public int x;
	public int y;
	public Color color;
	//java.awt.Color color;
	//maybe don't need public in front of everything
	
	public Fish(int x, int y, Color color) {
		this.x=x;
		this.y=y;
		this.color=color;
		
		
	
	}
	public void draw(Graphics2D g) {
		DrawFish.smallFacingLeft(g, this.x, this.y, this.color)

}
