package com.ecommerce.project.Service;

import java.util.List;

import com.ecommerce.project.model.User;

public interface UserService {
	public void createUser(User user);

	public List<User> getallUserDetails();

	public void EditUserDetails(int userId, User newuser);

	public void deleteUserDetails(int userId);
}
