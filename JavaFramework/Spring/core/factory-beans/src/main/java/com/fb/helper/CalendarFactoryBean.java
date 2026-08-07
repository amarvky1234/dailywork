package com.fb.helper;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalendarFactoryBean implements FactoryBean<Calendar> {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minutes;

    public CalendarFactoryBean(int day, int month, int year, int hour, int minutes) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
    }

    @Override
    public Calendar getObject() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day,hour,minutes);
        return calendar;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }
}
