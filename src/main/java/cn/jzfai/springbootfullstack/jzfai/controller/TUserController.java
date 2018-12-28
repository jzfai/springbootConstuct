package cn.jzfai.springbootfullstack.jzfai.controller;

import cn.jzfai.springbootfullstack.jzfai.domain.User;
import cn.jzfai.springbootfullstack.jzfai.exception.MyException;
import cn.jzfai.springbootfullstack.jzfai.services.impl.TUserServiceImpl;
import cn.jzfai.springbootfullstack.jzfai.utils.JsonData;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @program: jizhifai
 * @description: 用户列表控制器
 * @author: jzfai
 * @create: 2018-10-26 00:57
 **/
@RestController
@RequestMapping("tUser")
public class TUserController {
     @Resource
     private TUserServiceImpl tUserService;

     @GetMapping("/insert")
     Object insert(@RequestBody User user){
            int insertId=tUserService.insert(user);
            return JsonData.buildSuccess(insertId);
     }

     @PostMapping("/getAll")
     Object getAll(){
         Object listArray=tUserService.getAll();
         return JsonData.buildSuccess(listArray);
     }

    @PostMapping("/deleteAll")
        /*开启事物*/
    @Transactional(propagation= Propagation.REQUIRED)
    Object deleteAll(){
        Object listArray= null;
        try {
            listArray = tUserService.deleteByUid(16);
            listArray=tUserService.deleteByUid(14);
            listArray=tUserService.deleteByUid(9);
        } catch (RuntimeException e) {
            System.out.println("controller异常");
            throw new MyException("msg","删除失败");
        }
        return JsonData.buildSuccess(listArray);
    }
}
