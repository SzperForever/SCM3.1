package com.jabil.service.Documents;

import com.jabil.mapper.DocumentsMapper;
import com.jabil.pojo.Documents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DocServiceImpl implements DocService{
    @Autowired
    DocumentsMapper documentsMapper;

    @Override
    public List<Documents> findAllDocs() {
        return documentsMapper.selectAll();
    }
}
