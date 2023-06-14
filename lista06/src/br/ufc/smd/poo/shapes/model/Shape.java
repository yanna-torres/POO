package br.ufc.smd.poo.shapes.model;

public abstract class Shape {

	private String name;

	private float x;

	private float y;

	public Shape(String name, float x, float y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public abstract void draw();

	public abstract boolean isInside(float x, float y);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
