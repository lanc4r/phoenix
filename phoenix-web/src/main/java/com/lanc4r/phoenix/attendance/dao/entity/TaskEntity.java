package com.lanc4r.phoenix.attendance.dao.entity;

import com.lanc4r.phoenix.base.dao.BaseEntity;
import lombok.Data;

/**
 * @author Lanc4r
 * @create 2019-11-11 6:21 PM
 *
 * 任务表实体类
 */
@Data
public class TaskEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;
    /** 任务名称 */
    private String name;
    /** 任务类型 */
    private Integer type;
    /** 任务状态 */
    private Integer status;
    /** 创建时间 */
    private String createtime;
    /** 修改时间 */
    private String modifytime;
    /** 删除标识 */
    private Integer deleteflag;

}
