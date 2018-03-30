package com.ezest.springsec.service;

import java.util.List;

import com.ezest.springsec.model.UserProfile;

public interface UserProfileService {
	UserProfile findById(int id);
	 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
}
