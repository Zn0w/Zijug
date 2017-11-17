package com.znow.zijug.main.container;

import static org.lwjgl.glfw.GLFW.glfwGetWindowSize;
import static org.lwjgl.glfw.GLFW.glfwMakeContextCurrent;

import java.nio.IntBuffer;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;

import com.znow.zijug.main.component.Component;
import com.znow.zijug.main.graphics.Renderer;

public class Window extends Container {
	
	private Renderer renderer = new Renderer();
	
	public Window(long glfwWindow) {
		glfwMakeContextCurrent(glfwWindow);
		GL.createCapabilities(); // Turns OpenGL on
		
		MemoryStack stack = MemoryStack.stackPush();
		IntBuffer width = stack.mallocInt(1);
		IntBuffer height = stack.mallocInt(1);
		glfwGetWindowSize(glfwWindow, width, height);
		renderer.init(width.get(0), height.get(0));
	}
	
	@Override
	public void update() {
		renderer.prepare();
		for (Component component : components) {
			component.update();
		}
	}
	
}
