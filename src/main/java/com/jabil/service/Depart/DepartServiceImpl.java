package com.jabil.service.Depart;

import com.jabil.mapper.DepartmentsMapper;
import com.jabil.pojo.Departments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    DepartmentsMapper departmentsMapper;

    @Override
    public ArrayList<Departments> findAllDeparts() {
        return (ArrayList<Departments>) departmentsMapper.selectAll();
    }
}
