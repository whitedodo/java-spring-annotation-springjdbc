/*
 * 	주제(Subject): Spring JDBCTemplate - Annotation 방식 구현
 *  파일명(Filename): MainTest.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  생성일자(Create date): 2020-10-10
 *  설명(Description):
 * 
 * 
 */

package com.website.example.unit;

import java.sql.SQLException;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.website.example.common.RootConfig;
import com.website.example.service.AccountService;
import com.website.example.vo.AccountVO;


class MainTest {

	@Test
	void test() throws SQLException {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfig.class);
		
		AccountService service = (AccountService) applicationContext.getBean("accountServiceImpl");
		
		AccountVO vo = new AccountVO();
		
		/*
		// 1. 계정 생성
		vo.setName("홍길동");
		vo.setBalance(10000);
		vo.setRegidate(Timestamp.valueOf("2020-01-20 10:05:20"));
		service.accountCreate(vo);
		
		// 2. 계정 생성
		vo.setName("홍길자");
		vo.setBalance(0);
		vo.setRegidate(Timestamp.valueOf("2020-01-20 22:05:20"));
		service.accountCreate(vo);
		*/
		
		// 3. 거래 처리
		service.accountTransfer("홍길동", "홍길자", 500);
		
	}

}
