package com.commons.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.commons.entities.Booking;
import com.commons.manager.objectmanagers.DataAccessObject;

public class BookingService {
	DataAccessObject dao;
	ShopService services;
	
	//this is for development only. will be removed when
	// there will be database available
	List<Booking> allBookings = new ArrayList<Booking>();
	
	public BookingService(DataAccessObject dao) {
		this.services = new ShopService();
		
		
	}
	
	public void createBooking(Booking booking) {
		dao.persist(booking);
		System.out.println("Create booking");
	}
	
	public void deleteBooking() {
		System.out.println("cancel booking");
	}
	
	public void updateBooking() {
		System.out.println("update booking");
	}
	
	public List<Booking> getAllBookings() {
		//will be removed when db available
		ServiceEntity se1 = services.getAllServices().get(0);
		ServiceEntity se2 = services.getAllServices().get(1);
		
		//will be removed all db available
		Booking b1 = new Booking(221l, se1, new Date(30032018), 331l, 441l);
		Booking b2 = new Booking(223l, se2, new Date(1042018), 332l, 442l);
		
		allBookings.add(b1);
		allBookings.add(b2);
		
		return allBookings;
	}
}
