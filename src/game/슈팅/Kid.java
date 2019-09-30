package game.½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Kid {
	private int x;
	private int y;
	
	private int vx;
	private int vy;
	
	private int w;
	private int h;
	
	private static final int OFFSET_LEFT;
	private final static int OFFSET_TOP;
	
	private Image img;
	private int imgIndex;
	
	private int timeForReady = 0;
	
	static {
		OFFSET_LEFT = 32;
		OFFSET_TOP = 32;
	}
	
	public Kid() {
		
		
		x = 250;
		y = 300;
		w = h = 64;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/fighter.png");
		imgIndex = 3;
	}

	public void update() {
		x += vx;
		y += vy;
		
		if(timeForReady > 0)
			timeForReady--;
	}

	public void draw(Graphics g, RoleCanvas roleCanvas) {
		//g.drawImage(img, x, y, roleCanvas);
		
		int sx = imgIndex*w;
		g.drawImage(img
							// È­¸é ÁÂÇ¥
							, x-OFFSET_LEFT
							, y-OFFSET_TOP
							, x+w-OFFSET_LEFT
							, y+h-OFFSET_TOP
							// ÀÌ¹ÌÁö ÁÂÇ¥
							, sx, 0, sx+w, h
							, roleCanvas);
		
		g.drawRect(x-32, y-32, w, h);
	}

	public void move(Direction direction) {
		switch(direction) {
		case LEFT:
			imgIndex--;
			break;
		case RIGHT:
			imgIndex++;
			break;
		}
	}
	
	public void move(int x, int y) {
		//dx = x;
		//dy = y;
	}

	public Missile fire() {
		
		if(timeForReady == 0) {
			Missile m = new Missile(x, y);
			timeForReady = 30;
			return m;
		}					

		return null;
	}
}





