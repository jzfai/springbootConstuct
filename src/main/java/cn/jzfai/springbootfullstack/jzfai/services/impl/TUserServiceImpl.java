package cn.jzfai.springbootfullstack.jzfai.services.impl;

import cn.jzfai.springbootfullstack.jzfai.domain.User;
import cn.jzfai.springbootfullstack.jzfai.exception.MyException;
import cn.jzfai.springbootfullstack.jzfai.mapper.TUserMapper;
import cn.jzfai.springbootfullstack.jzfai.services.TUserService;
import cn.jzfai.springbootfullstack.jzfai.utils.JsonData;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

/**
 * @program: jizhifai
 * @description: TUserService的实现类
 * @author: jzfai
 * @create: 2018-10-26 00:47
 **/
@Service
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserMapper tUserMapper;
    @Resource
    private User user;

    @Override
    public Integer insert(User user) {
        Integer insertId=tUserMapper.insert(user);
        return insertId;
    }

    @Override
    public Object getAll() {
        Object getListArray=tUserMapper.getAll();
        return JsonData.buildSuccess(getListArray);
    }


    @Override
    /*开启事物*/
    /*@Transactional(propagation= Propagation.REQUIRED)*/
    public Integer deleteByUid(Integer uid) {
        Integer affectId=tUserMapper.deleteByUid(uid);
        if(affectId==0){
            throw new MyException("msg","插入失败");
        }else {
            return affectId;
        }
    }
}
