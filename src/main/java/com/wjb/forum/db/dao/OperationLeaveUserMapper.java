package com.wjb.forum.db.dao;

import com.wjb.forum.db.po.OperationLeaveUser;
import com.wjb.forum.db.po.OperationLeaveUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationLeaveUserMapper {
    long countByExample(OperationLeaveUserExample example);

    int deleteByExample(OperationLeaveUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperationLeaveUser record);

    int insertSelective(OperationLeaveUser record);

    List<OperationLeaveUser> selectByExample(OperationLeaveUserExample example);

    OperationLeaveUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperationLeaveUser record, @Param("example") OperationLeaveUserExample example);

    int updateByExample(@Param("record") OperationLeaveUser record, @Param("example") OperationLeaveUserExample example);

    int updateByPrimaryKeySelective(OperationLeaveUser record);

    int updateByPrimaryKey(OperationLeaveUser record);
}