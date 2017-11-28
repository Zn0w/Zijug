package com.znow.zijug.glfw_input;

import org.lwjgl.glfw.GLFWCursorPosCallback;

public class CursorHandler extends GLFWCursorPosCallback {

	@Override
	public void invoke(long window, double xPos, double yPos) {
		System.out.println("X: " + xPos + "    Y : " + yPos);
	}
	
}
