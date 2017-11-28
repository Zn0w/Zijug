package com.znow.zijug.glfw_input;

import org.lwjgl.glfw.GLFWMouseButtonCallback;
import static org.lwjgl.glfw.GLFW.glfwGetMouseButton;
import static org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_LEFT;

public class MouseButtonHandler extends GLFWMouseButtonCallback {
	
	@Override
	public void invoke(long window, int button, int action, int mods) {
		if (glfwGetMouseButton(window, GLFW_MOUSE_BUTTON_LEFT))
	}
	
}
