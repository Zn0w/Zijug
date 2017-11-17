package com.znow.zijug.main.container;

import java.nio.IntBuffer;

import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;

import static org.lwjgl.glfw.GLFW.glfwGetWindowSize;
import static org.lwjgl.glfw.GLFW.glfwMakeContextCurrent;

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
	
	public void update() {
		renderer.prepare();
	}
	
}
