package com.yuri.TestSpringBoot.Entity;

public class UserEntity extends User {
    private String m_emailAddresss;
    private String m_phoneNumber;
    private String m_userSex;
    private String m_signText;

    public UserEntity() {
    }

    public UserEntity(String m_userId, String m_username, String m_password, String m_emailAddresss, String m_phoneNumber, String m_userSex, String m_signText) {
        super(m_userId, m_username, m_password);
        this.m_emailAddresss = m_emailAddresss;
        this.m_phoneNumber = m_phoneNumber;
        this.m_userSex = m_userSex;
        this.m_signText = m_signText;
    }

    public String getM_emailAddresss() {
        return m_emailAddresss;
    }

    public void setM_emailAddresss(String m_emailAddresss) {
        this.m_emailAddresss = m_emailAddresss;
    }

    public String getM_phoneNumber() {
        return m_phoneNumber;
    }

    public void setM_phoneNumber(String m_phoneNumber) {
        this.m_phoneNumber = m_phoneNumber;
    }

    public String getM_userSex() {
        return m_userSex;
    }

    public void setM_userSex(String m_userSex) {
        this.m_userSex = m_userSex;
    }

    public String getM_signText() {
        return m_signText;
    }

    public void setM_signText(String m_signText) {
        this.m_signText = m_signText;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "m_emailAddresss='" + m_emailAddresss + '\'' +
                ", m_phoneNumber='" + m_phoneNumber + '\'' +
                ", m_userSex='" + m_userSex + '\'' +
                ", m_signText='" + m_signText + '\'' +
                '}';
    }
}
