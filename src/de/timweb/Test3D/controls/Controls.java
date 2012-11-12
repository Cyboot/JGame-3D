package de.timweb.Test3D.controls;

import de.timweb.Test3D.entity.Player;

public class Controls {
	public static final Controls c = new Controls();

	private static final double MOUSE_SENSITIVITY = 0.01;

	public boolean forward = false;
	public boolean backward = false;
	public boolean left = false;
	public boolean rigth = false;
	public Player.SPEED speed = Player.SPEED.DEFAULT;
	public boolean rotateLeft;
	public boolean rotateRight;

	private volatile int dx;
	private volatile int dy;


	public synchronized void update(int delta) {
		handleKeys(delta);

		handleMouse(delta);

		dx = 0;
		dy = 0;
	}

	private void handleMouse(int delta) {
		double xAngle = dx * delta * MOUSE_SENSITIVITY;
		double yAngle = dy * delta * MOUSE_SENSITIVITY;

		Player.p.rotate(-xAngle, 0);
	}

	private void handleKeys(int delta) {
		Player.p.setSpeed(speed);

		if(rotateRight){
			Player.p.rotate(delta* 0.1,0);
		}
		if(rotateLeft){
			Player.p.rotate(delta* -0.1,0);
		}
		
		if (forward) {
			Player.p.moveForward(delta, true);
		}
		if (backward) {
			Player.p.moveForward(delta, false);
		}
		if (left) {
			Player.p.moveSide(delta, false);
		}
		if (rigth) {
			Player.p.moveSide(delta, true);
		}

	}

	public synchronized void setMousePoition(int dx, int dy) {
		this.dx += dx;
		this.dy += dy;
	}
}
