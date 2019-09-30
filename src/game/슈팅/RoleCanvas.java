package game.슈팅;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class RoleCanvas extends Canvas
	implements KeyListener, MouseListener{
	
	private Kid kid;
	private Background bg;
	//private Missile[] missiles;
	private List<Missile> missiles;
	
	public RoleCanvas() {
		
		kid = new Kid();
		bg = new Background();
		//missiles = new Missile[100];
		missiles = new ArrayList<>();
		
		new Thread(()->{
			while(true) {
				try {					
					bg.update();
					kid.update();
					
					//if(missiles[0] != null)
						//missiles[0].update();
					for(Missile m : missiles)						
						m.update();					
					
					//for(int i=0; i<missiles.size(); i++)
					//	missiles.get(i).update();
						//((Missile)missiles.get(i)).update();						
					
					Thread.sleep(17);
					repaint();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		addKeyListener(this);
		addMouseListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		
		Image bufImage = createImage(
										  this.getWidth()
										, this.getHeight());		
				
		Graphics g2 = bufImage.getGraphics();
		bg.draw(g2, this);
		kid.draw(g2, this);
		
		//if(missiles[0] != null)
			//missiles[0].draw(g2, this);
		//for(Object o : missiles) {
			//Missile m = (Missile)o;
		//	((Missile)o).draw(g2, this);
		//}
		//for(int i=0; i<missiles.size(); i++) 
		//	((Missile)missiles.get(i)).draw(g2, this);
		
		for(Missile m : missiles)						
			m.draw(g2, this);		
		
		g.drawImage(bufImage,0,0,this);
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			kid.move(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			kid.move(Direction.RIGHT);			
			break;
		case KeyEvent.VK_SPACE:
			//if(3번 간격이 되면)
			Missile m = kid.fire();
			//if(m != null)
				missiles.add(m);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

}
