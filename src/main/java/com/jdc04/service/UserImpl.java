package com.jdc04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc04.Entity.User;
import com.jdc04.Repo.UserRepo;

@Service
public class UserImpl implements UserService {
	@Autowired
	private UserRepo repo;

	@Override
	public void registerUser(User user) {

		repo.save(user);

	}

}
