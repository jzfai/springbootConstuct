package cn.jzfai.springbootfullstack.jzfai.controller;

import java.util.Date;


import cn.jzfai.springbootfullstack.jzfai.domain.RedisUser;
import cn.jzfai.springbootfullstack.jzfai.domain.User;
import cn.jzfai.springbootfullstack.jzfai.utils.JsonData;
import cn.jzfai.springbootfullstack.jzfai.utils.JsonUtils;
import cn.jzfai.springbootfullstack.jzfai.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/redis")
public class RdisTestController {

	@Autowired
	private RedisClient redis;
	
	@PostMapping(value="add")
	public Object add(){
		 
		//redisTpl.opsForValue().set("name", "xdclass2018");
		redis.set("username", "xddddddd");
		return JsonData.buildSuccess();
		
	}
	
	@PostMapping(value="get")
	public Object get(){
		
		//String value = redisTpl.opsForValue().get("name");
		String value = redis.get("username");
		return JsonData.buildSuccess(value);

	}
	

	@PostMapping(value="save_user")
	public Object saveUser(){
		Object redisUser = new RedisUser(1, "abc", "11", new Date());
		/*RedisUser对象要转换成String 被redis解析*/
		String userStr = JsonUtils.obj2String(redisUser);
		boolean flag = redis.set("base:user:11", userStr);
		return JsonData.buildSuccess(flag);

	}
	
	@PostMapping(value="find_user")
	public Object findUser(){
		System.out.println("find_user");
		String userStr = redis.get("base:user:11");
		System.out.println(userStr);
		RedisUser user = JsonUtils.string2Obj(userStr, RedisUser.class);
		return JsonData.buildSuccess(user);
	}
	
	
}
