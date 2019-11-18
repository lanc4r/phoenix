package com.lanc4r.phoenix.user.form;

import lombok.Data;

/**
 * @author Lanc4r
 * @create 2019-11-18 10:40 AM
 */
@Data
public class UserForm {

    /** 用户ID */
    private Long id;
    /** 用户名称 */
    private String name;
    /** 用户性别 */
    private Integer sex;
    /** 生日 */
    private String birth;
    /** 用户邮箱 */
    private String email;
}
