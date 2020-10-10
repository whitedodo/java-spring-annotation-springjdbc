/*
 * 	주제(Subject): Spring JDBCTemplate - Annotation 방식 구현
 *  파일명(Filename): AccountService.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  생성일자(Create date): 2020-10-10
 *  설명(Description):
 * 
 * 
 */

package com.website.example.service;

import java.sql.SQLException;


import com.website.example.vo.AccountVO;


public interface AccountService {

	void accountCreate(AccountVO vo) throws SQLException;
	void accountTransfer(String sender, String receiver, int money) throws SQLException;
	
}
