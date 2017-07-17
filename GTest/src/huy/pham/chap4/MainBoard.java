package huy.pham.chap4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class MainBoard extends JFrame implements ActionListener{

	private ArrayList<Prey> preys;
	private Box box;
	private Timer timer;
	private boolean inGame;
	private int point;
	
	public MainBoard() {
		initBoard();
	}
	
	private void initBoard() {
		inGame = true;
		point = 0;
		addMouseMotionListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.GRAY);
		box = new Box(Common.INIT_BOX_X, Common.INIT_BOX_Y);
		preys = new ArrayList<>();
		initPrey();
		inGame = true;
		timer = new Timer(Common.DELAY, this);
		timer.start();
	}
	
	private void initPrey() {
		int initPreyX;
		int initPreyY = (int)(Math.random() * (Common.HEIGHT - 50));
		if (Math.random() * 10 >= 5) {
			initPreyX = 0;
		}
		else {
			initPreyX = Common.WIDTH;
		}
		Prey prey = new Prey(initPreyX, initPreyY);
		preys.add(prey);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		updateBox();
		updatePrey();
		checkCollision();
		repaint();
	}
	
	private void updateBox() {
		box.move();
	}
	
	private void updatePrey() {
		for (int i = 0; i < preys.size(); i++) {
			Prey prey = preys.get(i);
			if (prey.visible) {
				prey.move();
			}
			else {
				preys.remove(i);
			}
		}
	}
	
	private void checkCollision() {
		Rectangle boxBound = box.getBound();
		for (int i = 0; i <= preys.size(); i++) {
			if(boxBound.intersects(preys.get(i).getBound())) {
				preys.get(i).visible = false;
			}
		}
	}
	
	private class TAdapter extends MouseMotionAdapter {
		public void mouseMoved(MouseEvent e) {
			box.mouseMoved(e);
		}
	}
	
	public static void main(String[] args) {
		new MainBoard();
	}

}
