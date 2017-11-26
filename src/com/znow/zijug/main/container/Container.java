package com.znow.zijug.main.container;

import java.util.ArrayList;
import java.util.List;

import com.znow.zijug.main.component.Component;

public abstract class Container extends Component {
	
	protected List<Component> components = new ArrayList<Component>();
	protected ContainerLayout layout;
	protected int xMargin = 5, yMargin = 5;
	protected int totalWidth = 0, totalHeight = 0;
	
	public void add(Component component) {
		if (layout == ContainerLayout.FLAT && !components.isEmpty())
			sortFlat(components.get(components.size() - 1), component);
		else if (layout == ContainerLayout.LIST && !components.isEmpty())
			sortList(components.get(components.size() - 1), component);
		
		// I'm going to do something about that 
		//P.S. This piece of code is for window.pack() function
		
		/*if (component instanceof Container) {
			if(layout == ContainerLayout.FLAT) {
				totalWidth += ((Container) component).totalWidth + xMargin;
				if(totalHeight < ((Container) component).totalHeight)
					totalHeight = ((Container) component).totalHeight;
			}
			else if (layout == ContainerLayout.LIST) {
				totalHeight += ((Container) component).totalHeight + yMargin;
				if(totalWidth < ((Container) component).totalWidth)
					totalWidth = ((Container) component).totalWidth;
			}
		}
		else {
			if(layout == ContainerLayout.FLAT) {
				totalWidth += component.getWidth() + xMargin;
				if(totalHeight < component.getHeight())
					totalHeight = component.getHeight();
			}
			else if (layout == ContainerLayout.LIST) {
				totalHeight += component.getHeight() + yMargin;
				if(totalWidth < component.getWidth())
					totalWidth = component.getWidth();
			}
		}
		
		System.out.println(totalWidth + " | " + totalHeight);*/
		
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
		c2.setX(c1.getX() + c2.getWidth() + 5);
		c2.setY(c2.getY());
	}
	
	private void sortList(Component c1, Component c2) {
		c2.setX(c1.getX());
		c2.setY(c1.getY() + c2.getHeight() + 5);
	}
	
}
