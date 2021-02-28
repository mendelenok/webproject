package edu.juniorplus.controller;

public class EchoController implements UserController{

	@Override
	public String handleRequest(String string) {
		return string;
	}
}
