package com.Trade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stockId;
	private String stockName;

	public Stock() {
		super();

	}

	public Stock(int stockId, String stockName) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}
