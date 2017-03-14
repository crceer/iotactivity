package com.iotactivity.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by sam on 2017/3/14.
 */

public class activity extends DataSupport {
    private int id;
    private String date;
    private String type;
    private String content;
    private int count;

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
