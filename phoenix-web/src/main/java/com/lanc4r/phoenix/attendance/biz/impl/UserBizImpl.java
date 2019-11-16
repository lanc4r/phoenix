package com.lanc4r.phoenix.attendance.biz.impl;

import com.lanc4r.phoenix.attendance.biz.IUserBiz;
import com.lanc4r.phoenix.attendance.dao.IUserDao;
import com.lanc4r.phoenix.attendance.dao.IUserTaskDao;
import com.lanc4r.phoenix.attendance.dao.entity.UserEntity;
import com.lanc4r.phoenix.attendance.dao.entity.UserTaskEntity;
import com.lanc4r.phoenix.utils.util.Number.NumberUtils;
import com.lanc4r.phoenix.utils.util.String.LStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lanc4r
 * @create 2019-11-12 1:49 PM
 */
@Service
public class UserBizImpl implements IUserBiz {

    @Autowired
    private IUserDao userDao;
    @Autowired
    private IUserTaskDao userTaskDao;

    @Override
    public UserEntity getUserById(Long userId) {
        UserEntity userEntity = userDao.getUserById(userId);
        System.out.println("userEntity=" + userEntity);
        return userEntity;
    }

    @Override
    public void addUserTask(Long userId) {
        UserTaskEntity userTaskEntity = new UserTaskEntity();
        userTaskEntity.setUser_id(userId);
        userTaskEntity.setTask_id(2L);
        userTaskEntity.setComplete_flag(0);
        userTaskEntity.setMark("lalala");
        userTaskEntity.setDate("20191112");

        String tableName = "user_task_";
        Long index = userId % 10;
        tableName += index;

        userTaskDao.addUserTask(userTaskEntity, tableName);
    }

}
