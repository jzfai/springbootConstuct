package cn.jzfai.springbootfullstack.domain;

import java.util.Date;

/**
 * @program: jizhifai
 * @description: redis 的user的测试类
 * @author: jzfai
 * @create: 2018-10-26 04:14
 **/

public class RedisUser {
    private int age;

    private String pwd;

    private String phone;

    private Date createTime;

    @Override
    public String toString() {
        return "RedisUser{" +
                "age=" + age +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public RedisUser() {//使用StringToJson方法是这个构造函数不能省

    }

    public RedisUser(int age, String pwd, String phone, Date createTime) {
        this.age = age;
        this.pwd = pwd;
        this.phone = phone;
        this.createTime = createTime;
    }
}
