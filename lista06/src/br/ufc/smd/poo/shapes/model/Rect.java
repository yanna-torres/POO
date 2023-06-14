package br.ufc.smd.poo.shapes.model;

public class Rect extends Shape {

	private float height;

	private float width;

	public Rect(String name, float x, float y, float height, float width) {
		super(name, x, y);
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("[CIRCLE] Drawing circle at postion (" + this.getX() + ", " + this.getY()
				+ ") with height of " + this.getHeight() + " and width of " + this.getWidth() + ".");

	}

	@Override
	public boolean isInside(float x, float y) {
		return x >= getX() && x <= getX() + getWidth() && y >= getY() && y <= getY() + getHeight();
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

}
