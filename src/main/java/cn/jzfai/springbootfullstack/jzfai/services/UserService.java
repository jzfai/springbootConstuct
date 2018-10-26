package cn.jzfai.springbootfullstack.jzfai.services;


import cn.jzfai.springbootfullstack.jzfai.domain.User;

public interface UserService {

	public int add(User user);
	/**
	 * 功能描述：测试事务
	 * @return
	 */
	public int addAccount();

}
