package cn.jzfai.springbootfullstack.jzfai.mapper;

import cn.jzfai.springbootfullstack.jzfai.domain.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemMapper {
    @Select(
            "select * from t_item"
    )
    List<Item> getAll();
}
