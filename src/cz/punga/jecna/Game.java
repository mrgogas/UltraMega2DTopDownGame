package cz.punga.jecna;

import cz.punga.jecna.App;
import cz.punga.jecna.entity.Entity;
import cz.punga.jecna.entity.Player;
import java.awt.Color;

public class Game {
	public static Player player = new Player(50, 50, 50, 50);
	public static void now(){
		App.g2d.fillRect(0,0,App.WIDTH,App.HEIGHT);
	}
}
