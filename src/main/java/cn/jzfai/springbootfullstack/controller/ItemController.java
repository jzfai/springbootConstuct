package cn.jzfai.springbootfullstack.controller;

import cn.jzfai.springbootfullstack.domain.Item;
import cn.jzfai.springbootfullstack.mapper.ItemMapper;
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
    @Autowired
    private ItemMapper itemMapper;
    @GetMapping("getAll")
    public Item getItem(){
        System.out.println("jjj");
        Item itemAll = itemMapper.getAll();
       return itemAll;
    }
}

