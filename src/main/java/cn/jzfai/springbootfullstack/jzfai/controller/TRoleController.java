package cn.jzfai.springbootfullstack.jzfai.controller;

import cn.jzfai.springbootfullstack.jzfai.domain.TRole;
import cn.jzfai.springbootfullstack.jzfai.mapper.TRoleMapper;
import cn.jzfai.springbootfullstack.jzfai.utils.JsonData;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: jizhifai
 * @description: t_role库的操作域
 * @author: jzfai
 * @create: 2018-10-25 21:56
 **/
@RestController
@RequestMapping("tRole")
public class TRoleController {
    @Resource
    private TRoleMapper tRoleMapper;
    @Resource
    private TRole tRole;
    @PostMapping("/getAll")
    Object getAll(){
        return JsonData.buildSuccess(tRoleMapper.getAll());
    }
    @PostMapping("/insert")
    /*Object insert(@RequestBody TRole tRole)对象json的形式获取*/
//    Object insert(@RequestHeader("access_token") String accessToken, @RequestBody TRole tRole){
    Object insert(@RequestHeader("access_token") String accessToken,String type,Integer role_id){
        System.out.println("access_token");
        System.out.println(accessToken);
        System.out.println(type);
        System.out.println(role_id);
         tRoleMapper.insert(tRole);

        return JsonData.buildSuccess(1);
    }
}
