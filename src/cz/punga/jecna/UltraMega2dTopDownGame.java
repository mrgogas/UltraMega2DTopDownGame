package cz.punga.jecna;

import java.awt.Insets;

import cz.punga.jecna.App;

@SuppressWarnings("serial")
public class UltraMega2dTopDownGame{
	public static void main(String args[]){
		App app = App.app;
	    app.initCanvas();
	    app.setVisible(true);
	    app.setTitle( "UltraMega2dTopDownGame");
	    app.setResizable( false );
	    Insets i = app.getInsets();
	    app.setSize(App.WIDTH+i.left-2, App.HEIGHT+i.top-2);
	    app.setLocation(100, 100);
	    app.run();
	}
}
