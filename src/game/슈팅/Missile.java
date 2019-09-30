package game.½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Missile {
	private int x;
	private int y;
	
	private int vx;
	private int vy;
	
	private Image img;
	
	public Missile(int x, int y) {
		this.x = x;
		this.y = y;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/missile.png");
	}

	public void update() {
		//x += vx;
		//y += vy;
		y--;
	}

	public void draw(Graphics g, RoleCanvas roleCanvas) {
		g.drawImage(img, x, y, roleCanvas);
	}
}
