package com.znow.zijug.main.container;

import com.znow.zijug.main.component.Component;

public class Panel extends Container {

	@Override
	public void update() {
		for (Component component : components) {
			component.update();
		}
	}
	
}
