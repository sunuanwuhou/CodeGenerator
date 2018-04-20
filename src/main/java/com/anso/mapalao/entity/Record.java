package com.anso.mapalao.entity;

import java.util.Date;

public class Record {
    /** */
    private String dateTime;

    /** */
    private String c1Leak;

    /** */
    private String c2Noise;

    /** */
    private String c3Spread;

    /** */
    private Date createTime;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime == null ? null : dateTime.trim();
    }

    public String getC1Leak() {
        return c1Leak;
    }

    public void setC1Leak(String c1Leak) {
        this.c1Leak = c1Leak == null ? null : c1Leak.trim();
    }

    public String getC2Noise() {
        return c2Noise;
    }

    public void setC2Noise(String c2Noise) {
        this.c2Noise = c2Noise == null ? null : c2Noise.trim();
    }

    public String getC3Spread() {
        return c3Spread;
    }

    public void setC3Spread(String c3Spread) {
        this.c3Spread = c3Spread == null ? null : c3Spread.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}