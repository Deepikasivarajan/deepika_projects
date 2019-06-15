package com.Trade.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long purchaseId;
	private String stockName;
	private long stockPrice;
	private long quantity;
	private Date date;
	private long totalStockprice;
	private long fees;
	private long totalFees;
	
	@ManyToOne
	@JoinColumn(name="id")
	private User user;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(long stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getTotalStockprice() {
		return totalStockprice;
	}

	public void setTotalStockprice(long totalStockprice) {
		this.totalStockprice = totalStockprice;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public long getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(long totalFees) {
		this.totalFees = totalFees;
	}

	public long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	

}
