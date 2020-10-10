/*
 * 	주제(Subject): Spring JDBCTemplate - Annotation 방식 구현
 *  파일명(Filename): AccountDAO.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  생성일자(Create date): 2020-10-10
 *  설명(Description):
 * 
 * 
 */

package com.website.example.dao;

import java.sql.SQLException;

import com.website.example.vo.AccountVO;


public interface AccountDAO {
	
	void createAccount(AccountVO vo) throws SQLException;
	int getBalance(String name);
	void minus(String name, int money) throws SQLException;
	void plus(String name, int money) throws SQLException;
	
}
