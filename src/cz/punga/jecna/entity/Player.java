package cz.punga.jecna.entity;

import java.awt.Color;
import cz.punga.jecna.App;

public class Player extends Entity {
	
	public Player(int x, int y, int w, int h) 
	{
		super(x, y, w, h);
	}
	
	public void draw()
	{
		App.g2d.setColor(Color.white);
		App.g2d.fillRect(this.getX(),this.getY(),this.getW(),this.getH());
	}
	
	public void collide(Entity e) 
	{
		
	}
}
