package game;

import java.awt.Canvas;
import java.awt.Frame;

public class GameFrame extends Frame {
	
	//private Fighter fighter;
	
	private Canvas canvas;
	
	public GameFrame() {
		setSize(500, 700);
		
		//canvas = new GameCanvas();
		canvas = new PuzzleCanvas();
		add(canvas);
		
		setVisible(true);
		//fighter = new Fighter();
	}
	
	
	
}
