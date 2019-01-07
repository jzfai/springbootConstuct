package cn.jzfai.springbootfullstack.mapper;

import cn.jzfai.springbootfullstack.domain.TRole;
import cn.jzfai.springbootfullstack.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TUserMapper {
    @Insert(
            "insert into t_user(name,password,role_id)\n" +
                    "values (#{name},#{password},#{role_id});"
    )
    @Options(useGeneratedKeys = true,keyColumn = "rid",keyProperty = "rid")
    int insert(User user);

    @Select(
            "select * from t_user"
    )
    @Options(useGeneratedKeys = true,keyColumn = "uid",keyProperty = "uid")
    List<TRole> getAll();

    @Delete(
            "delete from t_user where  uid=#{uid};"
    )
    @Options(useGeneratedKeys = true,keyColumn = "uid",keyProperty = "uid")
    Integer deleteByUid(Integer uid);
}
