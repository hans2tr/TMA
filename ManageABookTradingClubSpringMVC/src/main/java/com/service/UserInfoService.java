package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserInfoDao;
import com.model.UserInfo;
@Service
@Transactional
public class UserInfoService {
	
	private UserInfoDao userInfoDao;
	@Autowired
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
	
	public UserInfo getInfoByUsername(String username) {
		return userInfoDao.getInfoByUsername(username);
	}
	public void save(UserInfo userInfo) {
		userInfoDao.save(userInfo);
	}
	public void update(UserInfo userInfo) {
		userInfoDao.update(userInfo);
	}
}
