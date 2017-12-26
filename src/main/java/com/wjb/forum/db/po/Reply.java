package com.wjb.forum.db.po;

import java.util.Date;

public class Reply {
    private Integer replyId;

    private Integer replyPostId;

    private String replyUserName;

    private Integer replyGoodCount;

    private Integer replyBadCount;

    private Date replyCreateTime;

    private String replyContent;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(Integer replyPostId) {
        this.replyPostId = replyPostId;
    }

    public String getReplyUserName() {
        return replyUserName;
    }

    public void setReplyUserName(String replyUserName) {
        this.replyUserName = replyUserName == null ? null : replyUserName.trim();
    }

    public Integer getReplyGoodCount() {
        return replyGoodCount;
    }

    public void setReplyGoodCount(Integer replyGoodCount) {
        this.replyGoodCount = replyGoodCount;
    }

    public Integer getReplyBadCount() {
        return replyBadCount;
    }

    public void setReplyBadCount(Integer replyBadCount) {
        this.replyBadCount = replyBadCount;
    }

    public Date getReplyCreateTime() {
        return replyCreateTime;
    }

    public void setReplyCreateTime(Date replyCreateTime) {
        this.replyCreateTime = replyCreateTime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }
}