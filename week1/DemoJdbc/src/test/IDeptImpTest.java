package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import dao.DBUtility;
import dao.IDeptImp;
import entity.Dept;

class IDeptImpTest {

	static IDeptImp dao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		dao = new IDeptImp();
	}

	@Test
	void testInsert() {
		Dept dep = new Dept();
		dep.setName("temp2");
		dep.setUsername("temp2");
		dep.setPassword("temp");
		dep.setAddress("temp");
		dep.setState("temp");
		dep.setCountry("temp");
		dep.setEmail("temp");
		dep.setRole("regular");
		int act = dao.insert(dep);
		assertEquals(1,act);
	}

//	@Test
//	void testUpdate() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSelectOne() {
//		fail("Not yet implemented");
//	}

}
