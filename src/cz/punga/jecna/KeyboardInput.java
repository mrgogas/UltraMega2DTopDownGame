package cz.punga.jecna;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {
        
  private static final int KEY_COUNT = 256;
        
  private enum KeyState {
    RELEASED, 
    PRESSED,  
    ONCE      
  }
  private boolean[] currentKeys = null;
        
  private KeyboardInput.KeyState[] keys = null;
        
  public KeyboardInput() {
    currentKeys = new boolean[ KEY_COUNT ];
    keys = new KeyboardInput.KeyState[ KEY_COUNT ];
    for( int i = 0; i < KEY_COUNT; ++i ) {
      keys[ i ] = KeyboardInput.KeyState.RELEASED;
    }
  }
        
  public synchronized void poll() {
    for( int i = 0; i < KEY_COUNT; ++i ) {
      if( currentKeys[ i ] ) {
        if( keys[ i ] == KeyboardInput.KeyState.RELEASED )
          keys[ i ] = KeyboardInput.KeyState.ONCE;
        else
          keys[ i ] = KeyboardInput.KeyState.PRESSED;
      } else {
        keys[ i ] = KeyboardInput.KeyState.RELEASED;
      }
    }
  }
        
  public boolean keyDown( int keyCode ) {
    return keys[ keyCode ] == KeyboardInput.KeyState.ONCE ||
           keys[ keyCode ] == KeyboardInput.KeyState.PRESSED;
  }
        
  public boolean keyDownOnce( int keyCode ) {
    return keys[ keyCode ] == KeyboardInput.KeyState.ONCE;
  }
        
  public synchronized void keyPressed( KeyEvent e ) {
    int keyCode = e.getKeyCode();
    if( keyCode >= 0 && keyCode < KEY_COUNT ) {
      currentKeys[ keyCode ] = true;
    }
  }

  public synchronized void keyReleased( KeyEvent e ) {
    int keyCode = e.getKeyCode();
    if( keyCode >= 0 && keyCode < KEY_COUNT ) {
      currentKeys[ keyCode ] = false;
    }
  }

  public void keyTyped( KeyEvent e ) {
  }
}
