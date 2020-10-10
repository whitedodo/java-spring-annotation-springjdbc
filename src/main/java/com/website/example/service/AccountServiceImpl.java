/*
 * 	주제(Subject): Spring JDBCTemplate - Annotation 방식 구현
 *  파일명(Filename): AccountServiceImpl.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  생성일자(Create date): 2020-10-10
 *  설명(Description):
 * 
 * 
 */

package com.website.example.service;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.website.example.dao.AccountDAO;
import com.website.example.dao.AccountDAOImpl;
import com.website.example.vo.AccountVO;

@Repository
@Transactional
public class AccountServiceImpl implements AccountService{

	private AccountDAO accountDAO;
	private DataSource ds = null;
	
	public AccountServiceImpl(DataSource ds) {
		this.accountDAO = new AccountDAOImpl(ds);
		this.ds = ds;
	}

	@Override
	public void accountCreate(AccountVO vo) throws SQLException {
		this.accountDAO.createAccount(vo);		
	}
	
	@Override
	public void accountTransfer(String sender, String receiver, int money) throws SQLException {
		
    	int balance = accountDAO.getBalance(sender); // 보내는 사람 잔액 체크
    	
        if(balance >= money){ // 보내는 돈이 잔액보다 많으면
    	
			accountDAO.minus(sender, money);
			accountDAO.plus(receiver, money);
	        					
        } else{

        	System.out.println("돈 없음");
        	//throw new NoMoneyException();
        }
		
	}


}
