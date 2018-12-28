package cn.jzfai.springbootfullstack.jzfai;

import cn.jzfai.springbootfullstack.jzfai.test.Emp;
import cn.jzfai.springbootfullstack.jzfai.test.EmpService;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;
import java.util.logging.Logger;


@RunWith(SpringRunner.class)  //底层用junit  SpringJUnit4ClassRunner
@SpringBootTest(classes={JzfaiApplication.class})//启动整个springboot工程
@AutoConfigureMockMvc
public class SpringBootTestDemo {
	@Test
	public void testOne(){
		System.out.println("test hello 1");
		TestCase.assertEquals(1, 1);
		
	}
	//日志记录器


	
	@Test
	public void testTwo(){
		System.out.println("test hello 2");
		TestCase.assertEquals(1, 1);
	}



	@Autowired
	ApplicationContext context;

	@Test
	public void ddddXml(){
       //没有找到就报错
		//System.out.println("empService: " + context.getBean("empService"));
		System.out.println("empService2: " + context.getBean("empService2"));
	}

	@Autowired
	Emp emp;
	@Test
	public void contextLoads() {
		System.out.println("emp的值");
		System.out.println(emp);
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
