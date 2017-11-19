package com.znow.zijug.main.container;

import java.util.ArrayList;
import java.util.List;

import com.znow.zijug.main.component.Component;

public abstract class Container extends Component {
	
	protected List<Component> components = new ArrayList<Component>();
	
	public void add(Component component) {
		components.add(component);
	}
	
	public void remove(Component component) {
		components.remove(component);
	}
	
	public void removeAll() {
		components.removeAll(components);
	}
	
	List<Component> getComponents() {
		return components;
	}
	
}
