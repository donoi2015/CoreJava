package headfirstdp.headfirst.iterator.dinermerger;

import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator {
    private MenuItem[] list;
    private int position;

    public AlternatingDinerMenuIterator(MenuItem[] list) {
	this.list = list;
	Calendar rightnow = Calendar.getInstance();
	position = rightnow.DAY_OF_WEEK % 2;
    }

    public Object next() {
	MenuItem menuItem = list[position];
	position = position + 2;
	return menuItem;
    }

    public boolean hasNext() {
	if (position >= list.length || list[position] == null) {
	    return false;
	} else {
	    return true;
	}
    }

    public String toString() {
	return "Alternating Diner Menu Iterator";
    }
}
