package edu.juniorplus.controller;

import edu.juniorplus.domain.User;
import edu.juniorplus.service.UserService;

public class BasicUserController extends AbstractUserController{

	private static final String CREATE = "create";
	private static final String GET = "get";
	private static final String REMOVE = "remove";
	private static final String UPDATE = "update";
	private static final String DELIMITER = ":";

	public BasicUserController(UserService userService) {
		super(userService);
	}

	@Override
	public String createUser(String data) {
		System.out.println("Create user");
		String[] userData = data.split(DELIMITER);
		User user = new User();
		user.setLogin(userData[0]);
		user.setPassword(userData[1]);

		User newUser = getUserService().createUser(user);
		return newUser.toString();
	}

	@Override
	public String getUser(String data) {
		System.out.println("Get user");
		Long id = Long.valueOf(data);
		User user = getUserService().getUser(id);
		return user.toString();
	}

	@Override
	public String removeUser(String data) {
		System.out.println("Remove user");
		return data;
	}

	@Override
	public String updateUser(String data) {
		System.out.println("Update user");
		return data;
	}

	@Override
	public String handleRequest(String string) {
		if (string.startsWith(CREATE)) {
			return createUser(removeOperation(string, CREATE));
		}
		if (string.startsWith(GET)) {
			return getUser(removeOperation(string, GET));
		}
		if (string.startsWith(REMOVE)) {
			return removeUser(removeOperation(string, REMOVE));
		}
		if (string.startsWith(UPDATE)) {
			return updateUser(removeOperation(string, UPDATE));
		}
		throw new IllegalArgumentException("Unsupported operation");
	}

	private String removeOperation(String string, String operation){
		return string.substring(operation.length()).trim();
	}
}
