package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.Account;

@Transactional
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

	public Account checkLogin(String username, String pass) {
		List<Account> list = this.getList();
		for (int i = 0; i < list.size(); i++) {
			if (username.equals(list.get(i).getUsername()) && pass.equals(list.get(i).getPassword())) {
				return list.get(i);
			}
		}
		return null;
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
		session.save(account);
	}
}
