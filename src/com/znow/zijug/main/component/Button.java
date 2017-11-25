package com.znow.zijug.main.component;

import static org.lwjgl.opengl.GL11.*;

public class Button extends Component {

	private String title;
	
	public Button(String title) {
		super(35, 25);
		this.title = title;
	}
	
	public Button(int x, int y, int width, int height, String title) {
		super(x, y, width, height);
		this.title = title;
	}

	@Override
	public void update() {
		draw();
		System.out.println("Button " + title + " update.");
	}
	
	private void draw() {
		System.out.println("Draw button.");
		
		glBegin(GL_QUADS);
		glColor3f(0.0f, 0.0f, 0.0f);
		glVertex2i(x, y);
		glVertex2i(x + width, y);
		glVertex2i(x + width, y + height);
		glVertex2i(x, y + height);
		glEnd();
		
		System.out.println("Done.");
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
}
