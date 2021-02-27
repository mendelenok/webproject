package edu.juniorplus.service;

import edu.juniorplus.domain.User;

public interface UserService {
	User createUser(User user);
	User getUser(Long id);
	void removeUser(Long id);
	void updateUser(User user);
}
