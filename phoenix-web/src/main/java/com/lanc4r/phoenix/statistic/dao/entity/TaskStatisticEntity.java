package com.lanc4r.phoenix.statistic.dao.entity;

import com.lanc4r.phoenix.base.dao.BaseEntity;
import lombok.Data;

/**
 * @author Lanc4r
 * @create 2019-11-11 6:44 PM
 */
@Data
public class TaskStatisticEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;
    /** 用户ID */
    private Long user_id;
    /** 任务ID */
    private Long task_id;
    /** 任务日期 */
    private String date;
    /** 完成进度 */
    private Double completion_degree;
    /** 统计类型 */
    private Integer statistic_type;
    /** 创建时间 */
    private String createtime;
    /** 修改时间 */
    private String modifytime;

}
