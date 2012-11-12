package de.timweb.Test3D.entity;

import java.awt.Graphics;

import de.timweb.Test3D.math.Vector3d;
import de.timweb.Test3D.shape.Cube3D;

public class CubeEntity extends Entity {
	private static final double SPEED = 0.1;
	private int direction = 1;
	private Cube3D cube;
	

	public CubeEntity(Vector3d pos) {
		super(pos);		
		cube = new Cube3D(pos,100);
	}

	@Override
	public void update(int delta) {
		cube.move(SPEED*direction*delta,0, 0);
		pos.add(SPEED*direction*delta,0, 0);
		
		if(pos.x > 100){
			pos.x = 100;
			direction *= -1;
		}
		if(pos.x < -100){
			pos.x = -100;
			direction *= -1;
		}
	}

	@Override
	public void render(Graphics g) {
		cube.render(g);
	}

}
