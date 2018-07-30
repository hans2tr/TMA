package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import com.model.UserInfo;

@Transactional
public class UserInfoDao extends AbstractDao{
	
		@SuppressWarnings("unchecked")
		public UserInfo getInfoByUsername(String username) {
			Session session = this.sessionFactory.getCurrentSession();
			List<UserInfo> userInfo =session.createQuery("from UserInfo u where u.account.username='"+username+"'").list();
			return userInfo.get(0);
			
		}
		public void save(UserInfo userInfo) {
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(userInfo);
		}
}
