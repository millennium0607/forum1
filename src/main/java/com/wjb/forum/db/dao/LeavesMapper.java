package com.wjb.forum.db.dao;

import com.wjb.forum.db.po.Leaves;
import com.wjb.forum.db.po.LeavesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeavesMapper {
    long countByExample(LeavesExample example);

    int deleteByExample(LeavesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Leaves record);

    int insertSelective(Leaves record);

    List<Leaves> selectByExample(LeavesExample example);

    Leaves selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Leaves record, @Param("example") LeavesExample example);

    int updateByExample(@Param("record") Leaves record, @Param("example") LeavesExample example);

    int updateByPrimaryKeySelective(Leaves record);

    int updateByPrimaryKey(Leaves record);
}