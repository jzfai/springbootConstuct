package cn.jzfai.springbootfullstack.jzfai.services;

import cn.jzfai.springbootfullstack.jzfai.domain.User;

public interface TUserService {
    Integer insert(User user);
    Object getAll();
    Integer deleteByUid(Integer uid);
}
