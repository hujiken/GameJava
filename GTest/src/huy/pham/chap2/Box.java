package huy.pham.chap2;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Box {
	private int x;
	private int y;
	private int dx;
	private int dy;
	private Image image;
	private final int SPEED = 1;
	
	public Box() {
		ImageIcon imageIcon = new ImageIcon("images/anh.jpg");
		image = imageIcon.getImage();
		x = 50;
		y = 50;
	}
	public void move() {
		x += dx;
		y += dy;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
		case KeyEvent.VK_UP:
			dy = -SPEED;
			break;
		case KeyEvent.VK_DOWN:
			dy = SPEED;
			break;
		case KeyEvent.VK_LEFT:
			dx = -SPEED;
			break;
		case KeyEvent.VK_RIGHT:
			dx = SPEED;
			break;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
	  	case KeyEvent.VK_UP:
		  	dy = 0;
		  	break;
		case KeyEvent.VK_DOWN:
		   dy = 0;
		   break;
		case KeyEvent.VK_LEFT:
			dx = 0;
			break;
		case KeyEvent.VK_RIGHT:
			dx = 0;
			break;
	  }
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	
}
