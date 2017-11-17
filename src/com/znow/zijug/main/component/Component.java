package com.znow.zijug.main.component;

public abstract class Component {
	
	protected int x, y, width, height;
	
	public Component() {
		
	}
	
	public Component(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public abstract void update();
	
}
