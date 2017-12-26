package com.wjb.forum.db.po;

import java.util.Date;

public class Post {
    private Integer postId;

    private Integer postBoardId;

    private String postUserName;

    private String postTitle;

    private Integer postGoodCount;

    private Integer postBadCount;

    private Integer postViewCount;

    private Integer postReplyCount;

    private Integer postStatus;

    private Date postCreateTime;

    private Date postUpdateTime;

    private String postContent;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getPostBoardId() {
        return postBoardId;
    }

    public void setPostBoardId(Integer postBoardId) {
        this.postBoardId = postBoardId;
    }

    public String getPostUserName() {
        return postUserName;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName == null ? null : postUserName.trim();
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public Integer getPostGoodCount() {
        return postGoodCount;
    }

    public void setPostGoodCount(Integer postGoodCount) {
        this.postGoodCount = postGoodCount;
    }

    public Integer getPostBadCount() {
        return postBadCount;
    }

    public void setPostBadCount(Integer postBadCount) {
        this.postBadCount = postBadCount;
    }

    public Integer getPostViewCount() {
        return postViewCount;
    }

    public void setPostViewCount(Integer postViewCount) {
        this.postViewCount = postViewCount;
    }

    public Integer getPostReplyCount() {
        return postReplyCount;
    }

    public void setPostReplyCount(Integer postReplyCount) {
        this.postReplyCount = postReplyCount;
    }

    public Integer getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Integer postStatus) {
        this.postStatus = postStatus;
    }

    public Date getPostCreateTime() {
        return postCreateTime;
    }

    public void setPostCreateTime(Date postCreateTime) {
        this.postCreateTime = postCreateTime;
    }

    public Date getPostUpdateTime() {
        return postUpdateTime;
    }

    public void setPostUpdateTime(Date postUpdateTime) {
        this.postUpdateTime = postUpdateTime;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
    }
}