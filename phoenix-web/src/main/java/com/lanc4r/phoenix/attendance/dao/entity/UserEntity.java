package com.lanc4r.phoenix.attendance.dao.entity;

import com.lanc4r.phoenix.base.dao.BaseEntity;

/**
 * @author Lanc4r
 * @create 2019-11-11 6:05 PM
 *
 * 用户表实体类
 */
public class UserEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;
    /** 用户名称 */
    private String name;
    /** 用户性别 */
    private Integer sex;
    /** 生日 */
    private String birth;
    /** 用户邮箱 */
    private String email;
    /** 用户状态 */
    private Integer status;
    /**
     * 创建时间和修改时间 TODO:### 后面写 Handler 来进行数据的转化
     */
    private String createtime;
    private String modifytime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birth='" + birth + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", createtime='" + createtime + '\'' +
                ", modifytime='" + modifytime + '\'' +
                '}';
    }
}
