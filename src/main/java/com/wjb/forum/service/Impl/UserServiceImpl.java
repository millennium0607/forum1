package com.wjb.forum.service.Impl;

import com.wjb.forum.db.dao.UserMapper;
import com.wjb.forum.db.po.User;
import com.wjb.forum.db.po.UserExample;
import com.wjb.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserByName(String userName) {
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(example);
        if (users.isEmpty()||users.size()<=0)
            return null;
        return  users.get(0);
    }
}
