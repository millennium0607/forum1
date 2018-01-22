package com.wjb.forum.service.Impl;

import com.wjb.forum.constant.state.NoticeType;
import com.wjb.forum.db.dao.NoticeMapper;
import com.wjb.forum.db.po.Notice;
import com.wjb.forum.db.po.NoticeExample;
import com.wjb.forum.service.NoticeService;
import com.wjb.forum.utils.BeanUtil;
import com.wjb.forum.vo.NoticeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.StyledEditorKit;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    @Autowired
    private BeanUtil beanUtil;
    @Override
    public List<NoticeVO> getAllNoticeVO() {
        List<Notice> noticeList = this.getAllNotice();
        List<NoticeVO> noticeVOList = new LinkedList<>();
        for(Notice notice:noticeList){
            noticeVOList.add(beanUtil.toNoticeVO(notice));
        }
        return noticeVOList;
    }


    @Override
    public List<Notice> getAllNotice() {
        return noticeMapper.selectByExample(null);
    }

    @Override
    public int sendSystemNotice(String body) {
        Notice notice = new Notice();
        notice.setBody(body);
        notice.setCreatetime(new Date());
        notice.setSenduserid(1);
        notice.setType(NoticeType.System.getName());
        return noticeMapper.insert(notice);
    }

    @Override
    public int sendCommonNotice(String body, String receive) {
        return 0;
    }

    @Override
    public List<Notice> getIndexNotice() {
       List<Notice> notices = noticeMapper.getTop15Notice();
        return notices;
    }
}
