package com.wjb.forum.service.Impl;

import com.wjb.forum.db.dao.RoleMapper;
import com.wjb.forum.db.po.Role;
import com.wjb.forum.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public Role getRoleById(int roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }
}
