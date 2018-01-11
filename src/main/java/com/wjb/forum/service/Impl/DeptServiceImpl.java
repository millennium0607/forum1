package com.wjb.forum.service.Impl;

import com.wjb.forum.db.dao.DeptMapper;
import com.wjb.forum.db.po.Dept;
import com.wjb.forum.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public Dept getDeptById(int deptId) {
        return deptMapper.selectByPrimaryKey(deptId);
    }
}
