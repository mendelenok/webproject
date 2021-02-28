package edu.juniorplus.domain;

import java.util.List;

public class User {

	private Long id;
	private String login;
	private String email;
	private String password;
	private List<String> phoneNumber;

	public User() {
	}

	public User(Long id, String login, String email, String password, List<String> phoneNumber) {
		this.id = id;
		this.login = login;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", login='" + login + '\'' +
			", email='" + email + '\'' +
			", password='" + password + '\'' +
			", phoneNumber=" + phoneNumber +
			'}';
	}
}
