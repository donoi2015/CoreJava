package headfirstdp.headfirst.iterator.transition;

import java.util.*;

class Waitress {
    private ArrayList menus;

    public Waitress(ArrayList menus) {
	this.menus = menus;
    }

    public void printMenu() {
        for (Object menu1 : menus) {
            Menu menu = (Menu) menu1;
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
	while (iterator.hasNext()) {
	    MenuItem menuItem = (MenuItem) iterator.next();
	    System.out.print(menuItem.getName() + ", ");
	    System.out.print(menuItem.getPrice() + " -- ");
	    System.out.println(menuItem.getDescription());
	}
    }
}
