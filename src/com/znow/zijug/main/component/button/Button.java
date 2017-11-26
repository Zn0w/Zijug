package com.znow.zijug.main.component.button;

import static org.lwjgl.opengl.GL11.*;

import com.znow.zijug.main.component.Component;

public class Button extends Component {

	private String title;
	private ActionHandler actionHandler;
	
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
		if (isClicked() && actionHandler != null)
			actionHandler.onAction();
	}
	
	private void draw() {
		glBegin(GL_QUADS);
		glColor3f(0.0f, 0.0f, 0.0f);
		glVertex2i(x, y);
		glVertex2i(x + width, y);
		glVertex2i(x + width, y + height);
		glVertex2i(x, y + height);
		glEnd();
	}
	
	private boolean isClicked() {
		return true;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void addActionHandler(ActionHandler actionHandler) {
		this.actionHandler = actionHandler;
	}
	
}
