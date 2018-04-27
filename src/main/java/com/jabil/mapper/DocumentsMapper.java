package com.jabil.mapper;

import com.jabil.pojo.Documents;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface DocumentsMapper extends Mapper<Documents> {
    public List<Documents> queryForList();
}