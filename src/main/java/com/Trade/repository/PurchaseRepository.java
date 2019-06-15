package com.Trade.repository;

import org.springframework.data.repository.CrudRepository;

import com.Trade.model.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase,Long> {

}
