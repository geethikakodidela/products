package com.ecommerce.project.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.project.Repository.UserRepository;
import com.ecommerce.project.Service.UserService;
import com.ecommerce.project.model.User;

@Service
public class UserServiceImplementation implements UserService {
	@Autowired
	UserRepository userrepository;

	public void createUser(User user) {
		userrepository.save(user);
	}

	public List<User> getallUserDetails() {
		return userrepository.findAll();
	}

	public void EditUserDetails(int userId, User newuser) {
		Optional<User> data = userrepository.findById(userId);
		User user = data.get();
		user.setUserId(newuser.getUserId());
		user.setLname(newuser.getLname());
		userrepository.save(user);
	}

	public void deleteUserDetails(int userId) {
		userrepository.deleteById(userId);
	}
}
