package cn.jzfai.springbootfullstack.jzfai;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@RunWith(SpringRunner.class)  //底层用junit  SpringJUnit4ClassRunner
@SpringBootTest(classes={JzfaiApplication.class})//启动整个springboot工程
@AutoConfigureMockMvc
public class SpringBootTestDemo {
	@Autowired
	DataSource dataSource;




	@Test
	public void testOne() throws SQLException {
		System.out.println("dataSource的值");
		System.out.println(dataSource.getClass());
		Connection connection =dataSource.getConnection();
		System.out.println(connection);

	}
	
	@Test
	public void testTwo(){
		System.out.println("test hello 2");
		TestCase.assertEquals(1, 1);
	}


	@Test
	public void testDatasoutce(){

	}


	/*
	* 测试mockmvc类
	* */
	@Resource
	private MockMvc mockMvc;

	@Test
	public void apiTest() throws Exception {

		MvcResult mvcResult =  mockMvc.perform( MockMvcRequestBuilders.get("/api/v1/gopage") ).
				andExpect( MockMvcResultMatchers.status().isOk() ).andReturn();
		int status = mvcResult.getResponse().getStatus();
		System.out.println(status);

	}
	
	
	
	@Before
	public void testBefore(){
		System.out.println("before");
	}
	
	
	
	@After
	public void testAfter(){
		System.out.println("after");
	}
	
}
