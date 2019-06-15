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

import com.Trade.model.User;
import com.Trade.repository.UserRepository;
import com.Trade.service.UserServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserServiceImpl userServiceImpl;
	
	static List<User> expectval  = null;
	User user1 = new User(1,"user1");
	
	@Test
	public void testSave() {
		User user = new User(2,"user2");
		Mockito.when(userRepository.save(user)).thenReturn(user);
		User actval = userServiceImpl.save(user);
		Assert.assertEquals(user,actval);
	}
		
	@Test
	public void testGetUserList() {
		expectval = new ArrayList<User>();
		expectval.add(user1);
		Mockito.when(userRepository.findAll()).thenReturn(expectval);
		List<User> actval = userServiceImpl.getUserList();
		Assert.assertEquals(expectval.size(),actval.size());
				
		}
	
	@Test 
	public void testGetUser() {
		Mockito.when(userRepository.findByUserId(1)).thenReturn(user1);
		User actval1 = userServiceImpl.getUser(1);
		Assert.assertEquals(user1, actval1);
		
	}
	
	@Test
	public void testGetSet() {
		User user = new User();
		user.setUserId(1);
		user.setUserName("user1");
		assertTrue(user.getUserId() ==1);
		assertTrue(user.getUserName() =="user1");
		
	}
	
	
	
}
