package cz.punga.jecna;

import cz.punga.jecna.App;
import cz.punga.jecna.entity.EntityManager;
import cz.punga.jecna.entity.Player;

import java.awt.Color;

public class Game {
	public static Player player = new Player(50, 50, 50, 50);
	private static boolean once = true;
	public static void now(){
		if(once){
			EntityManager.add(player);
			once = false;
		}
		App.g2d.setColor(Color.CYAN);
		App.g2d.fillRect(0,0,App.WIDTH,App.HEIGHT);
		EntityManager.now();
	}
}
