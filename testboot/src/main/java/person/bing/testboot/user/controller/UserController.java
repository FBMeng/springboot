package person.bing.testboot.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import person.bing.testboot.user.bean.UserModel;
import person.bing.testboot.user.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/getUser")
	public Object getUser(){
		List<UserModel> models = new ArrayList<>();
		models = service.getUser();
		return models;
	}
}
