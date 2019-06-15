package com.Trade.repository;

import org.springframework.data.repository.CrudRepository;

import com.Trade.model.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer>{

}
