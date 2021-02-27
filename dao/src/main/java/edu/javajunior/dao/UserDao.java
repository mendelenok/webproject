package edu.javajunior.dao;

import edu.javajunior.entity.UserEntity;

public interface UserDao {
	UserEntity createUserEntity(UserEntity user);
	UserEntity getUserEntity(Long id);
	void removeUserEntity(Long id);
	void updateUserEntity(UserEntity user);
}
