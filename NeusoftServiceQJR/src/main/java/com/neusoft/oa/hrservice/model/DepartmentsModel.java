package com.neusoft.oa.hrservice.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;



import lombok.Data;

@Alias("Departments")
@Data
public class DepartmentsModel implements Serializable {
	private int deptno = 0;
	private String deptname = null;
	private String ddesc = null;

}