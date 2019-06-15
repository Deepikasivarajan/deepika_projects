package com.Trade.service;

import java.util.List;

import com.Trade.model.Stock;

public interface StockService {

	Stock save(Stock stock);

	List<Stock> getStockList();

}
