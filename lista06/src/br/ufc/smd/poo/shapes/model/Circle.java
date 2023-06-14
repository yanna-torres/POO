package br.ufc.smd.poo.shapes.model;

public class Circle extends Shape {

	private float radius;

	public Circle(String name, float x, float y, float radius) {
		super(name, x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("[CIRCLE] Drawing circle at postion (" + this.getX() + ", " + this.getY()
				+ ") with radius of " + this.getRadius() + ".");
	}

	@Override
	public boolean isInside(float x, float y) {
		float distance = (float) Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));

		return distance < getRadius();
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
}
