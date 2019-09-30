package game.½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Background {
	private int x;
	private int y;
	private Image img;
	
	public Background() {
		x = 0;
		y = 0;
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/foto9.jpg");
	}
	
	public void draw(Graphics g, RoleCanvas roleCanvas) {
		g.drawImage(img, x, y, roleCanvas);		
	}
	
	public void update() {
		y++;
	}
}
