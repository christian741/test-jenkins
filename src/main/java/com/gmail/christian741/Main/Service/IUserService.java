package com.gmail.christian741.Main.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gmail.christian741.Main.entity.User;

public interface IUserService {
	
	public void saveUser(User user);
	public void updateUser(User user);
	public Page<User> getUsers(Pageable pageable);
	public User getUserById(Integer id);
	public void blockUser(Integer id);

}
