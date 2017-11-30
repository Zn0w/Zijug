package com.znow.zijug.main.font;

public class Glyph {
	
	private final int x, y, width, height;
	private final float advanceWidth;
	
	public Glyph(int x, int y, int width, int height, float advanceWidth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.advanceWidth = advanceWidth;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public float getAdvanceWidth() {
		return advanceWidth;
	}
	
}
