package cn.jzfai.springbootfullstack.services;

import cn.jzfai.springbootfullstack.domain.User;

public interface TUserService {
    Integer insert(User user);
    Object getAll();
    Integer deleteByUid(Integer uid);
}
