package headfirstdp.headfirst.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    private ArrayList menuComponents = new ArrayList();
    private String name;
    private String description;

    public Menu(String name, String description) {
	this.name = name;
	this.description = description;
    }

    public void add(MenuComponent menuComponent) {
	menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
	menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
	return (MenuComponent) menuComponents.get(i);
    }

    public String getName() {
	return name;
    }

    public String getDescription() {
	return description;
    }

    public void print() {
	System.out.print("\n" + getName());
	System.out.println(", " + getDescription());
	System.out.println("---------------------");

        for (Object menuComponent1 : menuComponents) {
            MenuComponent menuComponent = (MenuComponent) menuComponent1;
            menuComponent.print();
        }
    }
}
