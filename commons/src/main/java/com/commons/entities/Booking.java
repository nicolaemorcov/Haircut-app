package com.commons.entities;
import java.util.Date;

import com.commons.service.ServiceEntity;
public class Booking {
	private Long bookingId;
	private ServiceEntity serviceId;
	private final Date registeredOn = new Date();
	private Date date = new Date();
	private Long customerId;
	private Long barberId;
	private double bookingPrice;
	
	public Booking(Long bookingId, ServiceEntity serviceId, Date date, Long customerId, Long barberId) {
		super();
		this.bookingId = bookingId;
		this.serviceId = serviceId;
		this.date = date;
		this.customerId = customerId;
		this.barberId = barberId;
	}
	
	// generated (protected, final)
	//getters
	protected final Long getBookingId() {
		return bookingId;
	}
	protected final ServiceEntity getServiceId() {
		return serviceId;
	}
	protected final Date getDate() {
		return date;
	}

	public long getCustomerId() {
		return customerId;
	}
	public double getBookingPrice() {
		return bookingPrice;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getBarberId() {
		return barberId;
	}

	public void setBarberId(long barberId) {
		this.barberId = barberId;
	}

	protected final Date getRegisteredOn() {
		return registeredOn;
	}
	
	//setters
	protected final void setServiceId(ServiceEntity serviceId) {
		this.serviceId = serviceId;
	}
	protected final void setDate(Date date) {
		this.date = date;
	}
	
	protected final void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	
	protected final void settBookingPrice(double bookingPrice) {
		this.bookingPrice = bookingPrice;
	}

	
}

