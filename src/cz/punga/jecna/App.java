package cz.punga.jecna;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import cz.punga.jecna.KeyboardInput;

@SuppressWarnings("serial")
public class App extends JFrame {
	public static int WIDTH = 640;
    public static int HEIGHT = 480;
    public static Canvas canvas;
    public static App app = new App();
    public static KeyboardInput keyboard = new KeyboardInput();
    public static java.awt.Graphics graphics = null;
    public static Graphics2D g2d = null;
    public App() {
        setIgnoreRepaint( true );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      }
    public void run() {
        canvas.createBufferStrategy( 2 );
        BufferStrategy buffer = canvas.getBufferStrategy();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        BufferedImage bi = gc.createCompatibleImage( WIDTH, HEIGHT );
        addKeyListener( keyboard );
        canvas.addKeyListener( keyboard );
        while( true ) {
        	g2d = bi.createGraphics();
        	keyboard.poll();
        	
            graphics = buffer.getDrawGraphics();
            graphics.drawImage( bi, 0, 0, null );
            if( !buffer.contentsLost() )
              buffer.show();
            try {
              Thread.sleep(20);
            } catch (InterruptedException e) {
            } finally {
            if( graphics != null ) 
              graphics.dispose();
            if( g2d != null ) 
              g2d.dispose();
          }
      }
    }    
    public void initCanvas(){
        canvas = new Canvas();
        canvas.setIgnoreRepaint( true );
        canvas.setSize( WIDTH, HEIGHT );
        addKeyListener( keyboard );
        canvas.addKeyListener( keyboard );
        add(canvas);
        pack();
     }
}
