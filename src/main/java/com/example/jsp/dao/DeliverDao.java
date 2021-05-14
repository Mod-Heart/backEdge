package com.example.jsp.dao;

import com.example.jsp.pojo.Deliver;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 橙鼠鼠
 */
@Mapper
public interface DeliverDao {
    int save(@Param("deliver") Deliver deliver);

    void delete(@Param("deliver") int id);

    Deliver selectById(@Param("target") int id);

    List<Deliver> selectAll();

    void update(@Param("deliver") Deliver deliver);

    Integer getId(@Param("deliver") Deliver deliver);
}
