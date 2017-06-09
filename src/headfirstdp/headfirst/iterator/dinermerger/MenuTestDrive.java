package headfirstdp.headfirst.iterator.dinermerger;

import java.util.*;

public class MenuTestDrive {
    public static void main(String args[]) {
	PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
	DinerMenu dinerMenu = new DinerMenu();

	Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

	waitress.printMenu();
    }

    public static void printMenu() {
	PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
	DinerMenu dinerMenu = new DinerMenu();

	ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

        for (Object breakfastItem : breakfastItems) {
            MenuItem menuItem = (MenuItem) breakfastItem;
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

	MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for (MenuItem menuItem : lunchItems) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
}
