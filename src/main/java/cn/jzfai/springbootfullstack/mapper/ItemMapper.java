package cn.jzfai.springbootfullstack.mapper;

import cn.jzfai.springbootfullstack.domain.Item;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ItemMapper {
    Item getAll();
}
