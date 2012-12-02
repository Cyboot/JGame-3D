package de.timweb.Test3D.util;

import de.timweb.Test3D.math.Vector3d;

public enum Axis {
	X(new Vector3d(1, 0, 0)), //
	Y(new Vector3d(0, 1, 0)), //
	Z(new Vector3d(0, 0, 1));

	private Vector3d axis;
	
	Axis(Vector3d v) {
		axis = v;
	}
}
