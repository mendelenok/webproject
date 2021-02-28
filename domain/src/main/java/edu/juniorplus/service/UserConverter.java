package edu.juniorplus.service;

import edu.javajunior.entity.UserEntity;
import edu.juniorplus.domain.User;

public class UserConverter {

	public UserEntity convert(User user){
		return new UserEntity(user.getId(), user.getLogin(), user.getEmail(), user.getPassword(), user.getPhoneNumber());
	}

	public User convert(UserEntity userEntity){
		return new User(userEntity.getId(), userEntity.getLogin(), userEntity.getEmail(), userEntity.getPassword(), userEntity.getPhoneNumber());
	}
}
