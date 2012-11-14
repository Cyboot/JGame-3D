JGame-3D
========

ToDo:
- Gefüllte Objecte rendern
- Hoch- Runterschauen implementieren
- Renderreihenfolge
- Shapes zusammenfassen (Kompositum, Shape3D.add(Shape3D) )
- Geschoss 
- easy Physics: Gravitation



Gefüllte Objecte rendern
------------------------
- Triangulate:
	- Fläche wird in Dreiecke eingeteilt
	- fillPolygon() zeichnet die Fläche
	- testen ob Vor- oder Rückseite zum Beobachter zeigt 



Renderreihenfolge
-----------------
- Von Hinten nach vorne Rendern
- Vertices werden am ende der update() berechnet
	- Paralleles Berechnen (Einreihung in einer Queue, ThreadPool nimmt sich Vertices raus)
	- Punkte werden in HashMap<Vector3d, Point> gespeichert
	- in Rendermethode werden Punkte aus HashMap ausgelesen
