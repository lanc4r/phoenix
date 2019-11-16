package com.lanc4r.phoenix.attendance.dao.entity;

import com.lanc4r.phoenix.base.dao.BaseEntity;
import lombok.Data;

/**
 * @author Lanc4r
 * @create 2019-11-11 6:05 PM
 *
 * 用户表实体类
 */
@Data
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

}
