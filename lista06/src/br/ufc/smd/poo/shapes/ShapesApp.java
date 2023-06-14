package br.ufc.smd.poo.shapes;

import br.ufc.smd.poo.shapes.model.*;

public class ShapesApp {

	public static void main(String[] args) {
		Circle circle = new Circle("Circle", 5, 5, 3);
		circle.draw();
		System.out.println("Is point (4, 4) inside the circle? " + circle.isInside(4, 4));

		System.out.println("");
		
		Rect rect = new Rect("Rectangle", 0, 0, 6, 4);
		rect.draw();
		System.out.println("Is point (2, 2) inside the rectangle? " + rect.isInside(2, 2));

	}

}
