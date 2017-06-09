package mpp.library;

import java.util.List;

abstract class Publication {
	String title;
	int maxDuartion;
	boolean Availability;
	List<Copy> copies;
	List<Reservation> reservations;
}
