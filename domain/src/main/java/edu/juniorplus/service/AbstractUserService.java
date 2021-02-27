package edu.juniorplus.service;

import edu.javajunior.dao.UserDao;

public abstract class AbstractUserService implements UserService{

	private final UserDao userDao;

	public AbstractUserService(UserDao userDao) {
		this.userDao = userDao;
	}
}
