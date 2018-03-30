package com.ezest.springsec.dao;

import java.util.List;

import com.ezest.springsec.model.UserProfile;

public interface UserProfileDao {
	 List<UserProfile> findAll();
     
	    UserProfile findByType(String type);
	     
	    UserProfile findById(int id);
}
