package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountDao;
import com.model.Account;

@Service
@Transactional
public class AccountService {
	
	
	private AccountDao accountDao;
	@Autowired
	public void setAccountDao (AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	
	public List<Account> getList() {
		return accountDao.getList();
	}
	public Account getAccount(String username) {
		return accountDao.getAccount(username);
	}
	public void save(Account account) {
		accountDao.save(account);
	}
	public void update(Account account) {
		accountDao.update(account);
	}
}
