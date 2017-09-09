package com.wjy.services;

import com.wjy.mybatis.dao.DepartmentMapper;
import com.wjy.mybatis.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;

	public List<Department> getDepartments(){
		return departmentMapper.selectByExample(null);
	}
	
}
