package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	public int x;
	public int y;
	public Color color;
	public int destX;
	public int destY;
	public boolean isLittle;
	public boolean facingLeft;
	//java.awt.Color color;
	//maybe don't need public in front of everything
	
	public Fish(int x, int y, Color color, boolean isLittle, boolean facingLeft){
		this.x=x;
		this.y=y;
		this.color=color;
		this.destX = 450;
		this.destY = 450;
		this.isLittle = isLittle;
		this.facingLeft = facingLeft;
		
	
	
	}
	public void swim() {
		if (this.y < this.destY) {}
		this.y+=1;
	}
	public void draw(Graphics2D g) {
		this.swim();
		DrawFish.smallFacingLeft(g, this.color, this.x, this.y);
	}

}
