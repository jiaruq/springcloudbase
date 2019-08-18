package com.neusoft.oa.hrservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.oa.hrservice.model.DepartmentsModel;
import com.neusoft.oa.hrservice.service.IDepartmentsService;

@RestController
@RequestMapping("departments")
public class DepartmentsController {
	@Autowired
	private IDepartmentsService deptService=null;
	@GetMapping(value = "/list/all")
	public List<DepartmentsModel> getListByAll()throws Exception{
		return deptService.getListByAll();
	}
}
