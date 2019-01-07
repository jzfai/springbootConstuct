//package cn.jzfai.springbootfullstack.services.impl;
//
//import java.util.Date;
//
//import cn.jzfai.springbootfullstack.domain.User;
//import cn.jzfai.springbootfullstack.mapper.UserMapper;
//import cn.jzfai.springbootfullstack.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.Resource;
//
//@Service
//public abstract class UserServiceImpl implements UserService {
//
//	 @Resource
//	 private UserMapper userMapper;
//
//	@Override
//	public int add(User user) {
//		userMapper.insert(user);
//		int id = user.getId();
//		return id;
//	}
//
//	/*事物测试*/
//	@Override
//	@Transactional(propagation=Propagation.REQUIRED)
//	public int addAccount() {
//		User user = new User();
//		user.setAge(88);
//		user.setCreateTime(new Date());
//		user.setName("测试事务啦加入事务");
//		user.setPhone("10010101010");
//		userMapper.insert(user);
//		int i = 19/0;
//		return 0;
//	}
//
//
//

	
	
//}
