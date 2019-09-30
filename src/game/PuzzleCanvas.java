package game;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class PuzzleCanvas extends Canvas {
	private int[] pos = {0,1,2,3,4,5,6,7,8};
	private Puzzle[] puzzles;
	
	public PuzzleCanvas() {
		puzzles = new Puzzle[9];
		
		Random rand = new Random();
		
		for(int i=0; i<10; i++)
		{
			int p1 = rand.nextInt(9);
			int p2 = rand.nextInt(9);
			
			int temp;		
			temp = pos[p1];	
			pos[p1] = pos[p2];		
			pos[p2] = temp;
			
			System.out.printf("p1:%d, p2:%d\n", p1,p2);
		}
		
		for(int i=0; i<9; i++)
			System.out.printf("[%d]", pos[i]);
			
		for(int i=0; i<9; i++) {
			Puzzle puzzle = new Puzzle();			
			puzzle.setPos(i);
			puzzle.setSrc(pos[i]);
			
			puzzles[i] = puzzle;
		}
	}
	
	@Override
	public void paint(Graphics g) {
		
		//Toolkit tk = Toolkit.getDefaultToolkit();
		//Image img = tk.getImage("res/foto9.jpg");
		
		for(int i=0; i<9; i++)
		{
			
										// i=0,     i=1,     i=2,      i=3     i=4       i=5      i=6
			//int x = (i%3)*200; // 0*200, 1*200, 2*200, 0*200, 1*200
			//int y = (i/3)*200;	  // 0*200, 0*200, 0*200, 1*200, 1*200, 1*200, 2*200
			//int w = 200;
			//int h = 200;
			
			
			//int sx = (pos[i]%3)*200;
			//int sy = (pos[i]/3)*200;
						
			puzzle.draw(g,this);
			//g.drawImage(img,x,y,x+w,y+h  				// 화면
			//						, sx,sy,sx+w,sy+h 				// 이미지
			//						,this);
		}
	}
}
