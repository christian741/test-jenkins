package com.gmail.christian741.Main.ImpService;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gmail.christian741.Main.entity.User;
import com.gmail.christian741.Main.reposiory.*;
import com.gmail.christian741.Main.Service.*;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepo repository;

	@Override
	public void saveUser(User user) {
		user.setCreatedDate(LocalDate.now());
		user.setEmailVerified(false);
		user.setLastModify(LocalDate.now());
		user.setPermission((short)1);
		repository.save(user);
		
	}

	@Override
	public void updateUser(User user) {
		User userEdit = this.getUserById(user.getId());
		userEdit.setCellphone(user.getCellphone());
		userEdit.setSession(user.getSession());
		userEdit.setEmail(user.getEmail());
		userEdit.setLastModify(LocalDate.now());
		userEdit.setPermission(user.getPermission());
		repository.save(userEdit);
		
	}

	@Override
	public Page<User> getUsers(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public User getUserById(Integer id) {
		User user = repository.findById(id).orElseThrow(()-> new NullPointerException("user not found"));
		return user;
	}

	@Override
	public void blockUser(Integer id) {
		User user = this.getUserById(id);
		user.setPermission((short)1);
	}
}
