package com.iotactivity.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by sam on 2017/3/14.
 */

public class people extends DataSupport {
    private int id;
    private String name;
    private String grade;
    private String p_class;
    private String mobile;
    private String qq;
    private String mail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getP_class() {
        return p_class;
    }

    public void setP_class(String p_class) {
        this.p_class = p_class;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
