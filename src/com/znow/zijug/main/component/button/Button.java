package com.znow.zijug.main.component.button;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.glfw.GLFW.glfwGetMouseButton;
import static org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_LEFT;
import static org.lwjgl.glfw.GLFW.GLFW_PRESS;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;

import java.nio.DoubleBuffer;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryStack;

import com.znow.zijug.main.component.Component;

public class Button extends Component {

	private String title;
	private ActionHandler actionHandler;
	private long glfwWindow;
	private boolean mouseIsPressed;
	
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
		if (glfwGetMouseButton(glfwWindow, GLFW_MOUSE_BUTTON_LEFT) == GLFW_RELEASE && mouseIsPressed) {
			mouseIsPressed = false;
			
			MemoryStack stack = stackPush();
			DoubleBuffer xpos = stack.mallocDouble(1);
			DoubleBuffer ypos = stack.mallocDouble(1);
			GLFW.glfwGetCursorPos(glfwWindow, xpos, ypos);
			System.out.println("X: " + xpos.get(0) + "    Y: " + ypos.get(0));
			
			return (x <= xpos.get(0) && x + width >= xpos.get(0)) && (y <= ypos.get(0) && y + height >= ypos.get(0));
		}
		else {
			if (glfwGetMouseButton(glfwWindow, GLFW_MOUSE_BUTTON_LEFT) == GLFW_PRESS)
				mouseIsPressed = true;
		}
		return false;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void addActionHandler(ActionHandler actionHandler, long glfwWindow) {
		this.actionHandler = actionHandler;
		this.glfwWindow = glfwWindow;
	}
	
}
