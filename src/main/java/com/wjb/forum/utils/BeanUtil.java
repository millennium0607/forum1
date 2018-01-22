package com.wjb.forum.utils;

import com.wjb.forum.constant.state.NoticeType;
import com.wjb.forum.db.po.Dept;
import com.wjb.forum.db.po.Notice;
import com.wjb.forum.db.po.Role;
import com.wjb.forum.db.po.User;
import com.wjb.forum.service.DeptService;
import com.wjb.forum.service.RoleService;
import com.wjb.forum.service.UserService;
import com.wjb.forum.vo.NoticeVO;
import com.wjb.forum.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

@Component
public class BeanUtil {

    @Autowired
    private DeptService deptService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserService userService;


    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm");

    /**
     * Change to userVO
     * @param user
     * @return
     */
    public UserVO toUserVO(User user){
        UserVO userVO = new UserVO();
        userVO.setAvator(user.getAvator());
        userVO.setId(user.getId());
        Dept dept= deptService.getDeptById(user.getDeptid());
        userVO.setDept(dept.getName());
        userVO.setPassword(user.getPassword());
        Role role = roleService.getRoleById(user.getRoleid());
        userVO.setRoleid(user.getRoleid());
        userVO.setRole(role.getRoles());
        userVO.setRoleTip(role.getTips());
        userVO.setSalt(user.getSalt());
        userVO.setUsername(user.getUsername());
        return userVO;
    }



    public NoticeVO toNoticeVO(Notice notice){
        String message = "";
        if (notice.getBody().trim().length()>40)
            message = notice.getBody().substring(0,39)+"...";
        else
            message = notice.getBody();

        NoticeVO noticeVO = new NoticeVO();
        noticeVO.setBody(notice.getBody());
        noticeVO.setMessage(message+"<br/><small class=\"text-muted\">"+sdf.format(notice.getCreatetime())+"</small>");

        if(NoticeType.System.getName().endsWith(notice.getType())){
            noticeVO.setAvatar("systemAvatar");
            noticeVO.setSendUserName("System notice");
        }else {
            User user= userService.getUserById(notice.getSenduserid());
            noticeVO.setAvatar(user.getAvator().endsWith("0")?"girl":"body");
            noticeVO.setSendUserName(user.getUsername());
        }

        return noticeVO;
    }
}
