package mpp.library;

import java.util.ArrayList;
import java.util.List;

abstract class Member {
	int memberId;
	String name;
	String phoneNo;
	String address;
	ArrayList<LoanHistory> loanedbooks;
	List<Reservation> reservations;
	
}