package com.lanc4r.phoenix.attendance.dao.entity;

import lombok.Data;

/**
 * @author Lanc4r
 * @create 2019-11-11 6:26 PM
 *
 * 用户任务表实体类 —— 此表分表，后期想办法操作一下！！！！ (感觉不简单啊)
 */
@Data
public class UserTaskEntity {

    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;
    /** 用户ID */
    private Long user_id;
    /** 任务ID */
    private Long task_id;
    /** 任务完成状态 */
    private Integer complete_flag;
    /** 任务完成备注 */
    private String mark;
    /** 任务日期 */
    private String date;
    /** 创建时间 */
    private String createtime;
    /** 修改时间 */
    private String modifytime;

}
