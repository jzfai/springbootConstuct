package cn.jzfai.springbootfullstack.jzfai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@ServletComponentScan//要使用Servlet filter listen  要加ServletComponentScan属性
@MapperScan("cn.jzfai.springbootfullstack.jzfai.mapper")//扫面mapper包
@EnableScheduling  //开启定时任务
@EnableAsync //开启异步任务
public class JzfaiApplication {
    public static void main(String[] args) {
        SpringApplication.run(JzfaiApplication.class, args);
    }
    /*配置单个文件上传大小*/
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //单个文件最大
        factory.setMaxFileSize("10240KB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("1024000KB");
        return factory.createMultipartConfig();
    }
}