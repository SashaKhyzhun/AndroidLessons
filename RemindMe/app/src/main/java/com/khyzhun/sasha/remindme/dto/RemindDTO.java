package com.khyzhun.sasha.remindme.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

//Data transfer object
public class RemindDTO {

    private String id;
    private String title;
    private Date remindDate;

    //обязательно должен быть пустой, потому что когда мы создаем новый конструктор,
    // то конструктор по умолчанию - перетирается
    public RemindDTO() {
    }

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}