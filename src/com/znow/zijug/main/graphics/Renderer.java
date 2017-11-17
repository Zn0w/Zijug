package com.znow.zijug.main.graphics;

import static org.lwjgl.opengl.GL11.*;

public class Renderer {
	
	public void init(int windowWidth, int windowHeight) {
		System.out.println("Width: " + windowWidth + "    Height: " + windowHeight);
		
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity(); // Resets any previous projection matrices
		glOrtho(0, windowWidth, windowHeight, 0, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		
		glClearColor(0, 1, 1, 1);
	}
	
	public void prepare() {
		glClear(GL_COLOR_BUFFER_BIT);
	}
	
}
