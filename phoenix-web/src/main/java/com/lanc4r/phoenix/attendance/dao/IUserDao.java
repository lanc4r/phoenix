package com.lanc4r.phoenix.attendance.dao;

import com.lanc4r.phoenix.attendance.dao.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Lanc4r
 * @create 2019-11-11 6:32 PM
 *
 * user表对应的数据层操作接口 —— 这个之后在写一个 Module 来专门放置关于 分表分库、缓存 配置等的操作，嗯，就酱紫~
 */

@Mapper
public interface IUserDao {

    @Select("select * from user where id = #{id}")
    UserEntity getUserById(@Param("id") Long id);

}
