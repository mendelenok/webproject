package edu.juniorplus.controller;

import edu.juniorplus.service.UserService;

public abstract class AbstractUserController implements UserController{

	private final UserService userService;

	public AbstractUserController(UserService userService) {
		this.userService = userService;
	}

	public abstract String createUser(String data);
	public abstract String getUser(String data);
	public abstract String removeUser(String data);
	public abstract String updateUser(String data);
}
