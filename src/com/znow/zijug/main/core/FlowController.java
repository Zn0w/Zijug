package com.znow.zijug.main.core;

import static org.lwjgl.glfw.GLFW.glfwInit;

import org.lwjgl.glfw.GLFWErrorCallback;

public class FlowController {
	
	public static void init() {
		// Setup an error callback. The default implementation
		// will print the error message in System.err.
		GLFWErrorCallback.createPrint(System.err).set();

		// Initialize GLFW. Most GLFW functions will not work before doing this.
		if ( !glfwInit() )
			throw new IllegalStateException("Unable to initialize GLFW");
	}
	
}
