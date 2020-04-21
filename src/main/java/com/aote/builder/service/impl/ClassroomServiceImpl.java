package com.aote.builder.service.impl;

import com.aote.builder.dao.ClassroomMapper;
import com.aote.builder.model.Classroom;
import com.aote.builder.service.ClassroomService;
import com.aote.builder.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* Created by CodeGenerator on 2020/04/17.
*/
@Service
@Transactional
public class ClassroomServiceImpl extends AbstractService<Classroom> implements ClassroomService {
@Resource
private ClassroomMapper classroomMapper;

}
