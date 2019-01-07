package cn.jzfai.springbootfullstack.task;

import org.apache.ibatis.annotations.Delete;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: jizhifai
 * @description: 时间测试
 * @author: jzfai
 * @create: 2018-10-26 04:44
 **/
@Component
public class ScheduleTask {
//	@Scheduled(fixedRateString ="2000" )//两秒执行一次
	//@Scheduled(cron="*/2 * * * * *")
	public void sum() throws InterruptedException{
		Thread.sleep(4000L);
		System.out.println("结束 当前时间:"+new Date());
	}
}
