package game.슈팅;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ShuttingCanvas extends Canvas 
	implements MouseListener, KeyListener {
	
	// 아군기
	private Fighter fighter;
	//private int x;
	//private int y;
	//private Image img;
	
	// 적기
	private int 적기x;
	private int 적기y;
	private Image 적기img;
	
	public ShuttingCanvas() {
		addMouseListener(this);
		addKeyListener(this);
		
		
		fighter = new Fighter();
		
		new Thread(()->{	
			while(true) {
				try {
					fighter.update();
					
					Thread.sleep(17);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				repaint();
			}
			
		}).start();
		
	}
	
	@Override
	public void paint(Graphics g) {
		fighter.draw(g,this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		fighter.move(e.getX(), e.getY());
		//x = e.getX();
		//y = e.getY();
		repaint();
		//System.out.printf("(%d,%d)\n",e.getX(), e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37: // 왼쪽
			//x-=3;
			break;
		case 38: // 위쪽
			//y-=3;
			break;
		case 39: // 오른쪽
			//x+=3;
			break;
		case 40: // 아래
			//y+=3;
			break;
		}
		
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}






