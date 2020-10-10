/*
 * 	주제(Subject): Spring JDBCTemplate - Annotation 방식 구현
 *  파일명(Filename): RootConfig.java
 *  저자(Author): Dodo / rabbit.white at daum dot net
 *  생성일자(Create date): 2020-10-10
 *  설명(Description):
 * 
 * 
 */

package com.website.example.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@Import({DBConfig.class})
@ComponentScan(basePackages = {"com.website.example"})
//@ComponentScan(basePackages = {"com.local.example.beans", "com.local.example.advisor"})
public class RootConfig {



}