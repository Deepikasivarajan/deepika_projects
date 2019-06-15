package com.Trade.service;

import java.util.List;

import com.Trade.model.User;

public interface UserService {

	User save(User user);

	List<User> getUserList();

	User getUser(int id);

}
