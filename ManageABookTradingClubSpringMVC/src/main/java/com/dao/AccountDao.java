package com.dao;

import java.util.List;


import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.model.Account;

@Repository
public class AccountDao extends AbstractDao {

	@SuppressWarnings("unchecked")
	public List<Account> getList() {
		Session session = this.sessionFactory.getCurrentSession();

		List<Account> list = session.createQuery("from Account").list();
		// for (Account account : list) {
		// System.out.println(account.getId() + " " + account.getUsername() + " " +
		// account.getPassword()+account.getUserInfo().getName()+"
		// "+account.getUserInfo().getPhonenumber());
		// }
		return list;
	}

	@SuppressWarnings("unchecked")
	public Account getAccount(String username) {
		Session session = this.sessionFactory.getCurrentSession();
		List<Account> account = session.createQuery("from Account a where a.username='" + username + "'").list();
//		System.out.println(account.get(0).getId() + " " + account.get(0).getUsername() + " " + account.get(0).getPassword());
		if(account.size()>0) {
			return account.get(0);
		}
		return null;
	}

	public void save(Account account) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(account);
	}
	public void update(Account account) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(account);
	}
}
