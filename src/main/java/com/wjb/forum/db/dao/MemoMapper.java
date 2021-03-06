package com.wjb.forum.db.dao;

import com.wjb.forum.db.po.Memo;
import com.wjb.forum.db.po.MemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemoMapper {
    long countByExample(MemoExample example);

    int deleteByExample(MemoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Memo record);

    int insertSelective(Memo record);

    List<Memo> selectByExample(MemoExample example);

    Memo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Memo record, @Param("example") MemoExample example);

    int updateByExample(@Param("record") Memo record, @Param("example") MemoExample example);

    int updateByPrimaryKeySelective(Memo record);

    int updateByPrimaryKey(Memo record);
}