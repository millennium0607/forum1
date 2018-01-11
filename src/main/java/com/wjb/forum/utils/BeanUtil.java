package com.wjb.forum.utils;

import com.wjb.forum.db.po.Dept;
import com.wjb.forum.db.po.Role;
import com.wjb.forum.db.po.User;
import com.wjb.forum.service.DeptService;
import com.wjb.forum.service.RoleService;
import com.wjb.forum.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanUtil {

    @Autowired
    private DeptService deptService;
    @Autowired
    private RoleService roleService;

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
}
