package com.lanc4r.phoenix.attendance.biz;

import com.lanc4r.phoenix.attendance.dao.entity.UserEntity;

/**
 * @author Lanc4r
 * @create 2019-11-12 1:48 PM
 */
public interface IUserBiz {

    UserEntity getUserById(Long userId);

    void addUserTask(Long userId);
}
