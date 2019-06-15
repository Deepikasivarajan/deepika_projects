package com.Trade.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trade.model.Purchase;
import com.Trade.repository.PurchaseRepository;

@Service
@Transactional
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	PurchaseRepository repo;

	public Purchase purchase(Purchase purchase) {

		if (purchase.getQuantity() < 500) {

			purchase.setDate(new Date());
			long totalStockPrice = purchase.getQuantity() * purchase.getStockPrice();
			purchase.setTotalStockprice(totalStockPrice);
			long fees = (long) (totalStockPrice * (0.10 / 100));
			purchase.setFees(fees);
			long totalFees = totalStockPrice + fees;
			purchase.setTotalFees(totalFees);
			repo.save(purchase);
			return purchase;
		}

		else {

			purchase.setDate(new Date());
			long totalStockPrice = purchase.getQuantity() * purchase.getStockPrice();
			purchase.setTotalStockprice(totalStockPrice);
			long fees = (long) (totalStockPrice * (0.15 / 100));
			purchase.setFees(fees);
			long totalFees = purchase.getTotalFees() + fees;
			purchase.setTotalFees(totalFees);
			repo.save(purchase);
			return purchase;
		}

	}

}
