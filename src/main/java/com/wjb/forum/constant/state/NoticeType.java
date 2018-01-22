package com.wjb.forum.constant.state;

public enum NoticeType {
    System("SystemNotice"),
    Common("CommonNotice")
    ;

    private String name;

    private NoticeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
