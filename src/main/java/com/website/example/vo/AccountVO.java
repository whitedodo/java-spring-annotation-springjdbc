/*
 * 	주제(Subject): Spring JDBCTemplate - Annotation 방식 구현
 *  파일명(Filename): AccountVO.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  생성일자(Create date): 2020-10-10
 *  설명(Description):
 * 
 * 
 */

package com.website.example.vo;

import java.sql.Timestamp;;

public class AccountVO {
	
	private int idx;
	private String name;
	private int balance;
	private Timestamp regidate;
	
	public int getIdx() {
		return idx;
	}
	
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Timestamp getRegidate() {
		return regidate;
	}
	
	public void setRegidate(Timestamp regidate) {
		this.regidate = regidate;
	}
	
}
