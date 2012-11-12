package de.timweb.Test3D.game;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import de.timweb.Test3D.controls.Controls;
import de.timweb.Test3D.entity.CubeEntity;
import de.timweb.Test3D.entity.Entity;
import de.timweb.Test3D.math.Vector3d;

public class Game {
	public static final Game g = new Game();

	private List<Entity> entities = new ArrayList<Entity>();
	
	private Game() {
		entities.add(new CubeEntity(new Vector3d(0, 0, -300)));
	}

	public void update(int delta) {
		Controls.c.update(delta);
		
		World.w.update(delta);
		
		for(Entity e : entities){
			e.update(delta);
		}
	}


	public void render(Graphics g) {
		World.w.render(g);
		
		for(Entity e : entities){
			e.render(g);
		}
		
		Gui.g.render(g);
	}

}
