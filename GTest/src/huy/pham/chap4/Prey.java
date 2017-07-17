package huy.pham.chap4;

import huy.pham.chap4.Common.Status;

public class Prey extends Sprite{
	
	private Status status;

	public Prey(int x, int y) {
		super(x, y);
		initPrey();
	}
	
	private void initPrey() {
		loadImage("images/prey1.png");
		getImageDimention();
		
		int rand = (int)(Math.random() * 4 + 1);
		switch (rand) {
		case 1:
			status = Status.UP;
			break;
		case 2:
			status = Status.RIGHT;
			break;
		case 3:
			status = Status.DOWN;
			break;
		case 4:
			status = Status.LEFT;
			break;
		}
	}
	
	public void move() {
		switch (status) {
		case UP:
			y -= Common.PREY_SPEDD;
			break;
		case RIGHT:
			x += Common.PREY_SPEDD;
			break;
		case DOWN:
			y += Common.PREY_SPEDD;
			break;
		case LEFT:
			x -= Common.PREY_SPEDD;
			break;
		default:
			break;
		}
	}
}
