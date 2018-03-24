package com.ck.services;

import com.ck.model.User;

public interface UserServices {
	
	public User getUser(int UserID);
	public int insertUser(User user);

}
