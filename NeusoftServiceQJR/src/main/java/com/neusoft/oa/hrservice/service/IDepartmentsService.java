package com.neusoft.oa.hrservice.service;

import java.util.List;

import com.neusoft.oa.hrservice.model.DepartmentsModel;

public interface IDepartmentsService {
   public List<DepartmentsModel> getListByAll() throws Exception;
}
