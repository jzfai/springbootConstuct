package cn.jzfai.springbootfullstack.jzfai.domain;

import org.springframework.stereotype.Component;

import java.util.Date;

/*user对象*/
@Component
public class User {
	private int uid;
	private String name;
	private String password;
	private Date create_time;
	private int role_id;

	@Override
	public String toString() {
		return "User{" +
				"uid=" + uid +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", create_time=" + create_time +
				", role_id=" + role_id +
				'}';
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public int getRole_id() {
		return role_id;
	}



	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
}
