package com.lanc4r.phoenix.attendance.dao.entity;

/**
 * @author Lanc4r
 * @create 2019-11-11 6:26 PM
 *
 * 用户任务表实体类 —— 此表分表，后期想办法操作一下！！！！ (感觉不简单啊)
 */
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    public Integer getComplete_flag() {
        return complete_flag;
    }

    public void setComplete_flag(Integer complete_flag) {
        this.complete_flag = complete_flag;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}
