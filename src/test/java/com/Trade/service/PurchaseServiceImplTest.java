package com.Trade.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.Trade.model.Purchase;
import com.Trade.model.User;

@RunWith(MockitoJUnitRunner.class)
public class PurchaseServiceImplTest {

	@Test
	public void testGetSet() {
		Purchase purchase = new Purchase();
		User user = new User(1,"user1");
		purchase.setPurchaseId(1);
		purchase.setStockName("wipro");
		purchase.setStockPrice(1000);
		purchase.setQuantity(5);
		purchase.setDate(new Date());
		purchase.setTotalStockprice(10000);
		purchase.setFees(10);
		purchase.setTotalFees(40000);
		purchase.setUser(user);
		
		Date date = new Date();
		assertTrue(purchase.getPurchaseId() ==1);
		assertTrue(purchase.getStockName() =="wipro");
		assertTrue(purchase.getStockPrice() ==1000);
		assertTrue(purchase.getQuantity() ==5);
		assertThat(date).isAfterOrEqualsTo(purchase.getDate());
		assertTrue(purchase.getTotalStockprice()==10000);
		assertTrue(purchase.getFees()==10);
		assertTrue(purchase.getTotalFees()==40000);
		assertTrue(purchase.getUser()==user);
	}
}
