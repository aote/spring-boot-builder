package com.aote.builder.service.impl;

import com.aote.builder.dao.StudentMapper;
import com.aote.builder.model.Student;
import com.aote.builder.service.StudentService;
import com.aote.builder.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* Created by CodeGenerator on 2020/04/17.
*/
@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
@Resource
private StudentMapper studentMapper;

}
