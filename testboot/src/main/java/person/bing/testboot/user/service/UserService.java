package person.bing.testboot.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import person.bing.testboot.user.bean.UserModel;
import person.bing.testboot.user.dao.java.UserMapping;

@Service
public class UserService {
	@Autowired
	private UserMapping mapping;
	
	public List<UserModel> getUser(){
		List<UserModel> models = new ArrayList<UserModel>();
		models = mapping.getUser();
		return models;
	}
}
