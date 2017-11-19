package com.znow.zijug.main.container;

import java.util.ArrayList;
import java.util.List;

import com.znow.zijug.main.component.Component;

public abstract class Container extends Component {
	
	protected List<Component> components = new ArrayList<Component>();
	
	public void add(Component component) {
		components.add(component);
	}
	
	List<Component> getComponents() {
		return components;
	}
	
}
