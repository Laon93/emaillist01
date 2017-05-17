package com.jx372.emaillist.dao.test;

import java.util.List;

import com.jx372.emaillist.dao.EmaillistDao;
import com.jx372.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		//insertTest();
		getListTest();
	}
	
	public static void getListTest() {
		EmaillistDao dao = new EmaillistDao();
		List<EmaillistVo> list= dao.getList();
		
		for( EmaillistVo vo : list ) {
			System.out.println( vo );
		}
	}
	
	public static void insertTest() {
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstName( "둘" );
		vo.setLastName( "리" );
		vo.setEmail( "dooly@gmail.com" );
		
		EmaillistDao dao = new EmaillistDao();
		dao.insert(vo);
	}

}
