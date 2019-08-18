package com.neusoft.oa.hrservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.hrservice.mapper.IDepartmentsMapper;
import com.neusoft.oa.hrservice.model.DepartmentsModel;
import com.neusoft.oa.hrservice.service.IDepartmentsService;
@Service
@Transactional
public class DepartmentsServiceImpl implements IDepartmentsService {
	@Autowired
	private IDepartmentsMapper deptMapper=null;
	@Override
	public List<DepartmentsModel> getListByAll() throws Exception {
		// TODO Auto-generated method stub
		return deptMapper.selectListByAll();
	}

}
