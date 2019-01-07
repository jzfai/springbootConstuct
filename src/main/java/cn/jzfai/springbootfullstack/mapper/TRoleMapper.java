package cn.jzfai.springbootfullstack.mapper;

import cn.jzfai.springbootfullstack.domain.TRole;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TRoleMapper {
     @Insert(
             "insert into t_role(type,role_id)\n" +
                     "values (#{type},#{role_id});"
     )
     @Options(useGeneratedKeys = true,keyColumn = "rid",keyProperty = "rid")
     int insert(TRole tRole);

    @Select(
            "select * from t_role"
    )
    @Results({
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "create_time",property = "createTime")
            //javaType = java.util.Date.class
    })
    List<TRole> getAll();
}
