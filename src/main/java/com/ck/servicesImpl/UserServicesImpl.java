package com.ck.servicesImpl;

import com.ck.dao.UserMapper;
import com.ck.model.User;
import com.ck.services.UserServices;

import javax.annotation.Resource;  

import org.springframework.stereotype.Service; 

@Service("userService") 
public class UserServicesImpl implements UserServices {

	@Resource
	private UserMapper userDAO;
	@Override
	public User getUser(int UserID) {
		// TODO Auto-generated method stub
		return this.userDAO.selectByPrimaryKey(UserID);
	}
@Override
public int insertUser(User user) {
	// TODO Auto-generated method stub
	//User user =new User(userName,passWord,age);
	return this.userDAO.insertSelective(user);
}
}
