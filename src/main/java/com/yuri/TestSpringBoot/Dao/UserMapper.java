package com.yuri.TestSpringBoot.Dao;

import com.yuri.TestSpringBoot.Entity.User;
import com.yuri.TestSpringBoot.Entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    //查询表中所有的数据
    @Select("select * from t_user")
    public List<UserEntity> findAllUser();

    //根据用户Id查询指定的数据
    @Select("select * from t_user where userId = #{userId}")
    public User findUserById(@Param("userId") String userId);

    //添加新的用户数据
    @Insert("insert into t_user (userId,username,password) values (#{user.m_userId},#{user.m_username},#{user.m_password})")
    public void addNewUser(@Param("user") User user);

    //更新用户数据
    @UpdateProvider(type = UserSearchProvider.class , method = "updateUserInfoProvider")
    public void updateUserInfo(@Param("user") User user);

    //删除用户数据
    @Delete("delete from t_user where userId = #{userId}")
    public void deleteUserInfo(@Param("userId")String userId);
}
