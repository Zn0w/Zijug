package com.znow.zijug.main.graphics;

import static org.lwjgl.opengl.GL11.*;

class Renderer {
	
	void init(int windowWidth, int windowHeight) {
		System.out.println("Width: " + windowWidth + "    Height: " + windowHeight);
		
		glMatrixMode(GL_PROJECTION);
		glOrtho(0, 0, windowWidth, windowHeight, 1, -1);
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
		glClearColor(1, 1, 1, 1);
	}
	
	void prepare() {
		glClear(GL_COLOR_BUFFER_BIT);
	}
	
}
