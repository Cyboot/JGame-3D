JGame-3D
========

ToDo:
- Gef�llte Objecte rendern
- Hoch- Runterschauen implementieren
- Renderreihenfolge
- Shapes zusammenfassen (Kompositum, Shape3D.add(Shape3D) )
- Geschoss 
- easy Physics: Gravitation



Gef�llte Objecte rendern
------------------------
- Triangulate:
	- Fl�che wird in Dreiecke eingeteilt
	- fillPolygon() zeichnet die Fl�che
	- testen ob Vor- oder R�ckseite zum Beobachter zeigt 



Renderreihenfolge
-----------------
- Von Hinten nach vorne Rendern
- Vertices werden am ende der update() berechnet
	- Paralleles Berechnen (Einreihung in einer Queue, ThreadPool nimmt sich Vertices raus)
	- Punkte werden in HashMap<Vector3d, Point> gespeichert
	- in Rendermethode werden Punkte aus HashMap ausgelesen
