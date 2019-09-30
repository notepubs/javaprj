package game.½´ÆÃ;

import java.awt.Canvas;
import java.awt.Frame;

public class GameFrame extends Frame {
	
	private Canvas canvas;
	
	public GameFrame() {
		setSize(500, 700);
		
		canvas = new RoleCanvas();
		add(canvas);
		
		canvas.setFocusable(true);
		canvas.requestFocus();
		setVisible(true);
		
		addWindowListener(new GameWindowListener());
	}
	
	
	
}
