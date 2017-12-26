package com.wjb.forum.service.Impl;

import com.wjb.forum.db.dao.UserMapper;
import com.wjb.forum.db.po.User;
import com.wjb.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByName(String userName) {
        return  userMapper.selectByPrimaryKey(1);
    }
}
