package com.znow.zijug.main.container;

import java.util.ArrayList;
import java.util.List;

import com.znow.zijug.main.component.Component;

public abstract class Container extends Component {
	
	protected List<Component> components = new ArrayList<Component>();
	protected ContainerLayout layout;
	
	public void add(Component component) {
		if (layout == ContainerLayout.FLAT)
			sortFlat(components.get(components.size() - 1), component);
		else if (layout == ContainerLayout.LIST)
			sortList(components.get(components.size() - 1), component);
		
		components.add(component);
	}
	
	public void remove(Component component) {
		components.remove(component);
	}
	
	public void removeAll() {
		components.removeAll(components);
	}
	
	public List<Component> getComponents() {
		return components;
	}
	
	public void setLayout(ContainerLayout layout) {
		this.layout = layout;
	}
	
	private void sortFlat(Component c1, Component c2) {
		
	}
	
	private void sortList(Component c1, Component c2) {
		
	}
	
}
