package edu.javajunior.dao;

import edu.javajunior.entity.UserEntity;

import java.util.HashMap;
import java.util.Map;

public class MapUserDao implements UserDao {

	private final Map<Long, UserEntity> userDataHolder;
	private Long currentId;

	public MapUserDao() {
		this.userDataHolder = new HashMap<>();
		currentId = 0L;
	}

	@Override
	public UserEntity createUserEntity(UserEntity user) {
		user.setId(currentId);
		userDataHolder.put(currentId, user);
		++currentId;
		return user;
	}

	@Override
	public UserEntity getUserEntity(Long id) {
		return userDataHolder.get(id);
	}

	@Override
	public void removeUserEntity(Long id) {
		userDataHolder.remove(id);
	}

	@Override
	public void updateUserEntity(UserEntity user) {
		userDataHolder.put(user.getId(), user);
	}

}
