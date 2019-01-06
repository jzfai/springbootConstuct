package cn.jzfai.springbootfullstack.jzfai.controller;

import cn.jzfai.springbootfullstack.jzfai.domain.Item;
import cn.jzfai.springbootfullstack.jzfai.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

@RestController
@RequestMapping("item")
public class ItemController {
    @Resource
    private ItemMapper itemMapper;
   @GetMapping("getAll")
   public List<Item> getItem(){
       List<Item> itemAll = itemMapper.getAll();
       return itemAll;
   }
}

