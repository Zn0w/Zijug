package com.znow.zijug.main.container;

import static org.lwjgl.glfw.GLFW.glfwGetWindowSize;

import java.nio.IntBuffer;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;

import com.znow.zijug.main.component.Component;
import com.znow.zijug.main.graphics.Renderer;

public class Window extends Container {
	
	private Renderer renderer = new Renderer();
	
	public Window(long glfwWindow) {
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
	
	public void pack(long glfwWindow) {
		int sumWidth = 0;
		int sumHeight = 0;
		
		for (Component component : components) {
			sumWidth += component.getWidth();
			sumHeight += component.getHeight();
		}
		
		width = sumWidth;
		height = sumHeight;
		
		GLFW.glfwSetWindowSize(glfwWindow, width, height);
		renderer.init(width, height);
	}
	
}
