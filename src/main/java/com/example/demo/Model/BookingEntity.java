package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SlotBookings")
public class BookingEntity {
	@Id
	private int sno;
	private String name;
	private int timein;
	private int totalhrs;
	private String paymentstatus;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTimein() {
		return timein;
	}
	public void setTimein(int timein) {
		this.timein = timein;
	}
	public int getTotalhrs() {
		return totalhrs;
	}
	public void setTotalhrs(int totalhrs) {
		this.totalhrs = totalhrs;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public BookingEntity(int sno, String name, int timein, int totalhrs, String paymentstatus) {
		super();
		this.sno = sno;
		this.name = name;
		this.timein = timein;
		this.totalhrs = totalhrs;
		this.paymentstatus = paymentstatus;
	}
	public BookingEntity()
	{
		
	}
	
	
	
}