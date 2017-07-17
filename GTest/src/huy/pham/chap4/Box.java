package huy.pham.chap4;

import java.awt.event.MouseEvent;

public class Box extends Sprite{
	
	private int dx;
	private int dy;

	public Box(int x, int y) {
		super(x, y);
		initBox();
	}
	
	public void initBox() {
		loadImage("images/box.png");
		getImageDimention();
	}
	
	public void move() {
		x = dx;
		y = dy;
	}
	
	public void mouseMoved(MouseEvent e) {
		dx = e.getX();
		dy = e.getY();
	}
}
