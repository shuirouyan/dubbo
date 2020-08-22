package cn.test.interfaces.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author WinterSun
 * @date 2020/8/22 - 13:23
 */
public class User implements Serializable {

    private static final long serialVersionUID = 5376373444616694331L;

    private int id;
    private String name;
    private int age;
    private Date birth;
    private Date createTime;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", createTime=" + createTime +
                ", email='" + email + '\'' +
                '}';
    }
}
