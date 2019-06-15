package com.Trade.service;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.Trade.model.Stock;
import com.Trade.repository.StockRepository;
import com.Trade.service.StockServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class StockServiceImplTest {
	
	@Mock
	StockRepository stockRepository;
	
	@InjectMocks
	StockServiceImpl stockServiceImpl;
	
	static List<Stock> expectval1 = null;
	Stock stock1 = new Stock(1,"wipro");
	
	
	  @Test 
	  public void testsave() {
      Stock stock =new Stock(2,"soft");
	  Mockito.when(stockRepository.save(stock)).thenReturn(stock);
	  Stock actval1 = stockServiceImpl.save(stock);
	  Assert.assertEquals(stock, actval1);
	  
	  }
	 
	
	@Test
	public void testgetStockList() {
		expectval1 = new ArrayList<Stock>();
		expectval1.add(stock1);
		Mockito.when(stockRepository.findAll()).thenReturn(expectval1);
		List<Stock> actval1 = stockServiceImpl.getStockList();
		Assert.assertEquals(expectval1.size(),actval1.size());
		
	}
	
	@Test
	public void testGetSet() {
		Stock stock = new Stock();
		stock.setStockId(1);
		stock.setStockName("Tcs");
		assertTrue(stock.getStockId() ==1);
		assertTrue(stock.getStockName() =="Tcs");
		
	}
}
