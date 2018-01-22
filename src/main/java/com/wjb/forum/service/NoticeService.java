package com.wjb.forum.service;

import com.wjb.forum.db.po.Notice;
import com.wjb.forum.vo.NoticeVO;

import java.util.List;

public interface NoticeService {
    List<NoticeVO> getAllNoticeVO();

    List<Notice> getAllNotice();

    int sendSystemNotice(String body);

    int sendCommonNotice(String body,String receive);

    List<Notice> getIndexNotice();
}
