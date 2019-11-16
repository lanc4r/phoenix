package com.lanc4r.phoenix.attendance.dao;

import com.lanc4r.phoenix.attendance.dao.entity.UserTaskEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Lanc4r
 * @create 2019-11-11 6:35 PM
 *
 * user_task 表对应的实体操作类
 */

@Mapper
public interface IUserTaskDao {

    public void addUserTask(@Param("userTask") UserTaskEntity userTaskEntity, @Param("tableName") String tableName);

}
