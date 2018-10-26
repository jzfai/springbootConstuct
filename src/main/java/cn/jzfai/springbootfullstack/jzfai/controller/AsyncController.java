package cn.jzfai.springbootfullstack.jzfai.controller;

import cn.jzfai.springbootfullstack.jzfai.task.AsyncTask;
import cn.jzfai.springbootfullstack.jzfai.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @program: jizhifai
 * @description: 异步方法测试
 * @author: jzfai
 * @create: 2018-10-26 04:50
 **/
@RequestMapping("/async")
@RestController
public class AsyncController {
    @Autowired
    private AsyncTask task;
    @PostMapping(value = "async_task")
    public JsonData exeTask() throws InterruptedException{
        long begin = System.currentTimeMillis();

//		task.task1();
//		task.task2();
//		task.task3();
        Future<String> task4 = task.task4();
        Future<String> task5 = task.task5();
        Future<String> task6 = task.task6();
        Boolean t4=task4.isDone();
        Boolean t5=task5.isDone();
        Boolean t6=task6.isDone();
        System.out.println("t4-t5的值");
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(task4.toString());
        if (t4&&t5&&t6) {
            System.out.println("完成了");
        }

        long end = System.currentTimeMillis();

        long total = end-begin;
        System.out.println("执行总耗时="+total);
        return JsonData.buildSuccess(total);
    }

}
