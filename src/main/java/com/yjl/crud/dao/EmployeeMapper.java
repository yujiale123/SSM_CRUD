package com.yjl.crud.dao;

import com.yjl.crud.bean.Employee;
import com.yjl.crud.bean.EmployeeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    //删除员工信息
    int deleteByExample(EmployeeExample example);

    //根据id删除员工信息
    int deleteByPrimaryKey(Integer empId);

    //查询员工信息
    int insert(Employee record);

    //查询员工信息
    int insertSelective(Employee record);

    //查询多个员工存入集合中
    List<Employee> selectByExample(EmployeeExample example);

    //查询单个员工
    Employee selectByPrimaryKey(Integer empId);

    //查询多个员工并且附带部门信息存入集合中
    List<Employee> selectByExampleWithDept(EmployeeExample example);

    //查询单个员工附带部门信息
    Employee selectByPrimaryKeyWithDept(Integer empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}