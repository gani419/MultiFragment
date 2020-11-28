package com.gandroid.multifragment.model;

public class InboxModel {
    private String form;
    private String content;
    private String time;

    public InboxModel(String form, String content, String time) {
        this.form = form;
        this.content = content;
        this.time = time;
    }

    public String getForm() {
        return form;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "InboxModel{" +
                "form='" + form + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}