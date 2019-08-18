package com.neusoft.oa.hrservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.hrservice.model.DepartmentsModel;
@Mapper
public interface IDepartmentsMapper {
	public List<DepartmentsModel>  selectListByAll()throws Exception;
}
