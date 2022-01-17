package com.sweetshop;

import java.util.Map;
import java.util.Map.Entry;

public class Order {
	private int id;
	private Map<Sweet,Integer> sweetMap;
	private String customerName;
	private long phoneNumber;
	private double totalPrice;

	@Override
	public String toString() {
		return "Order [id=" + id + ", sweetMap=" + sweetMap + ", customerName=" + customerName + ", phoneNumber="
				+ phoneNumber + ", totalPrice=" + totalPrice + "]";
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public Map< Sweet,Integer> getSweetMap() {
		return sweetMap;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getTotalPrice() {
		totalPrice=0;
		for (Entry<Sweet, Integer> map:sweetMap.entrySet()) {
		totalPrice=totalPrice +map.getKey().price*map.getValue();
		}
		return totalPrice;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSweetMap(Map<Sweet, Integer> sweetMap) {
		this.sweetMap = sweetMap;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
