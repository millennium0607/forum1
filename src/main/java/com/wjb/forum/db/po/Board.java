package com.wjb.forum.db.po;

public class Board {
    private Integer boardId;

    private String boardName;

    private String boardDesc;

    private Integer boardPostNum;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName == null ? null : boardName.trim();
    }

    public String getBoardDesc() {
        return boardDesc;
    }

    public void setBoardDesc(String boardDesc) {
        this.boardDesc = boardDesc == null ? null : boardDesc.trim();
    }

    public Integer getBoardPostNum() {
        return boardPostNum;
    }

    public void setBoardPostNum(Integer boardPostNum) {
        this.boardPostNum = boardPostNum;
    }
}