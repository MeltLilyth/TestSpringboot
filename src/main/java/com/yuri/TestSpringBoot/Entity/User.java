package com.yuri.TestSpringBoot.Entity;

public class User {
    private String m_userId;  //用户Id
    private String m_username;//用户名
    private String m_password;//用户密码

    public User() {
    }

    public User(String m_userId, String m_username, String m_password) {
        this.m_userId = m_userId;
        this.m_username = m_username;
        this.m_password = m_password;
    }

    public String getM_userId() {
        return m_userId;
    }

    public void setM_userId(String m_userId) {
        this.m_userId = m_userId;
    }

    public String getM_username() {
        return m_username;
    }

    public void setM_username(String m_username) {
        this.m_username = m_username;
    }

    public String getM_password() {
        return m_password;
    }

    public void setM_password(String m_password) {
        this.m_password = m_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "m_userId='" + m_userId + '\'' +
                ", m_username='" + m_username + '\'' +
                ", m_password='" + m_password + '\'' +
                '}';
    }
}
