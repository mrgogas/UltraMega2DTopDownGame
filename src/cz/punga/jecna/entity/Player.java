package cz.punga.jecna.entity;

import java.awt.Color;

import cz.punga.jecna.App;
import cz.punga.jecna.Game;

public class Player extends Entity {
	
	public Player(int x, int y, int w, int h) 
	{
		super(x, y, w, h);
	}
	
	public void draw()
	{
		if(Game.getTime()%2==0)
			App.g2d.setColor(Color.green);
		if(Game.getTime()%2==1)
			App.g2d.setColor(Color.magenta);		
		App.g2d.fillRect(this.getX(),this.getY(),this.getW(),this.getH());
	}
	
	public void collide(Entity e) 
	{
		
	}
}
