package com.yuri.TestSpringBoot.Dao;

import com.yuri.TestSpringBoot.Entity.User;
import com.yuri.TestSpringBoot.Entity.UserEntity;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

public class UserSearchProvider {
    private final String m_tableName = "t_user";

    //判断传入的字段并根据结果更新用户数据 -- 前端需要进行判断
    //update t_user set username = #{username}, password = #{password} where userId = #{userId}
    public String updateUserInfoProvider(User user){
        SQL sql = new SQL().UPDATE(m_tableName);
        if(StringUtils.hasText(user.getM_username())){
            sql.SET("username = #{user.m_username}");
        }
        if(StringUtils.hasText(user.getM_password())){
            sql.SET("password = #{user.m_password}");
        }
        sql.WHERE("userId = #{user.m_userId}");
        return sql.toString();
    }

}
