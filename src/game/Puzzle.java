package game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Puzzle {
	int x; // 0*200, 1*200, 2*200, 0*200, 1*200
	int y;	  // 0*200, 0*200, 0*200, 1*200, 1*200, 1*200, 2*200
	int w;
	int h;
	
	int sx;
	int sy;
	
	Image img;
	
	public Puzzle() {
		w = 200;
		h = 200;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/foto9.jpg");
	}

	public void setPos(int index) {
		x = (index%3)*200; // 0*200, 1*200, 2*200, 0*200, 1*200
		y = (index/3)*200;
	}

	public void setSrc(int index) {
		sx = (index%3)*200; // 0*200, 1*200, 2*200, 0*200, 1*200
		sy = (index/3)*200;
	}

	public void draw(Graphics g, PuzzleCanvas puzzleCanvas) {
		g.drawImage(img,x,y,x+w,y+h  				// 화면
							, sx,sy,sx+w,sy+h 				// 이미지
							,puzzleCanvas);
	}
	
	
}
