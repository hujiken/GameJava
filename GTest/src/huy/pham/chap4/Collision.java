package huy.pham.chap4;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import huy.pham.chap4.Common.Status;

public class Collision extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Box box;
	private ArrayList<Prey> preyList;
	private Timer timer;
	
	public Collision() {
		box = new Box(Common.INIT_BOX_X, Common.INIT_BOX_Y);
		initPrey();
		addMouseMotionListener(new MyAdapter());
		timer = new Timer(Common.DELAY, this);
		timer.start();
	}
	
	private void initPrey() {
		preyList = new ArrayList<>();
		int preyX;
		int preyY = (int) (Math.random() * Common.HEIGHT);
		if (Math.random() * 10 >= 5) {
			preyX = 0;
		}
		else {
			preyX = Common.WIDTH;
		}
		Prey prey = new Prey(preyX, preyY);
		preyList.add(prey);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(box.getImage(), box.getX(), box.getY(), box.getWidth(), box.getHeight(), this);
		if (preyList.size() > 0) {
			for (Prey prey : preyList) {
				g.drawImage(prey.getImage(), prey.getX(), prey.getY(), this);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		updateBox();
		updatePrey();
		System.out.println(preyList.size());
		repaint();
		
	}
	
	private void updateBox() {
		box.move();
	}
	
	private void updatePrey() {
		if (preyList.size() > 0) {
			for (Prey prey : preyList) {
				int rand = (int)(Math.random() * 4 + 1);
				switch (rand) {
				case 1:
					prey.setStatus(Status.UP);
					break;
				case 2:
					prey.setStatus(Status.RIGHT);
					break;
				case 3:
					prey.setStatus(Status.DOWN);
					break;
				case 4:
					prey.setStatus(Status.LEFT);
					break;
				}
				prey.move();
			}
		}
	}
	
	private class MyAdapter extends MouseMotionAdapter {
		public void mouseMoved(MouseEvent e) {
			box.mouseMoved(e);
		}
	}

}
