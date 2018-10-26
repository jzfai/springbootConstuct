package cn.jzfai.springbootfullstack.jzfai.domain;

import org.springframework.stereotype.Component;

/**
 * @program: jizhifai
 * @description: 角色对象
 * @author: jzfai
 * @create: 2018-10-25 21:30
 **/
@Component
public class TRole {
    private int rid;
    private String type;
    private int role_id;

    @Override
    public String toString() {
        return "TRole{" +
                "rid=" + rid +
                ", type='" + type + '\'' +
                ", role_id=" + role_id +
                '}';
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
