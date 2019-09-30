package game.슈팅;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	private int x;
	private int y;
	private int vx;
	private int vy;
	private int dx;
	private int dy;
	
	
	private Image img;
	
	public Fighter() {
		x = 100;
		y = 100;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/fighter.png");
	}

	public void draw(Graphics g, ShuttingCanvas shuttingCanvas) {
		g.drawImage(img, x, y, shuttingCanvas);
	}

	public void move(int x, int y) {
		dx = x;
		dy = y;
		
		//vx = (dx- this.x)/15;
		//vy = (dy - this.y)/15;		
		float w = dx-this.x;
        float h = dy-this.y;
        float d = (float)Math.sqrt(w*w + h*h);
        vx = (int)(w/d*2);
        vy = (int)(h/d*2);       

	}
	
	public void update() {
		x += vx;
		y += vy;
		
		//vx, vy 크기를 가지는 박스에 도달하면
		if(목적지에 도달했다면) {
			vx = 0;
			vy = 0;
		}
	}
}
