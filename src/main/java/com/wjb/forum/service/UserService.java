package com.wjb.forum.service;

import com.wjb.forum.db.po.User;

public interface UserService {
    User getUserByName(String userName);
}
