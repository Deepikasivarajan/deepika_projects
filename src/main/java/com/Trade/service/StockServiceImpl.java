package com.Trade.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trade.model.Stock;
import com.Trade.repository.StockRepository;

@Service
@Transactional

public class StockServiceImpl implements StockService {
	@Autowired
	StockRepository repo;

	public Stock save(Stock stock) {
			
		return repo.save(stock);

	 	}

	public List<Stock> getStockList() {

		return (List<Stock>) repo.findAll();
	}

}
