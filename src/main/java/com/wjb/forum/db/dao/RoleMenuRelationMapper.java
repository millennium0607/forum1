package com.wjb.forum.db.dao;

import com.wjb.forum.db.po.RoleMenuRelation;
import com.wjb.forum.db.po.RoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuRelationMapper {
    long countByExample(RoleMenuRelationExample example);

    int deleteByExample(RoleMenuRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenuRelation record);

    int insertSelective(RoleMenuRelation record);

    List<RoleMenuRelation> selectByExample(RoleMenuRelationExample example);

    RoleMenuRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleMenuRelation record, @Param("example") RoleMenuRelationExample example);

    int updateByExample(@Param("record") RoleMenuRelation record, @Param("example") RoleMenuRelationExample example);

    int updateByPrimaryKeySelective(RoleMenuRelation record);

    int updateByPrimaryKey(RoleMenuRelation record);
}