package com.aote.builder.service.impl;

import com.aote.builder.dao.UserMapper;
import com.aote.builder.model.User;
import com.aote.builder.service.UserService;
import com.aote.builder.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
* Created by CodeGenerator on 2020/04/17.
*/
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
@Resource
private UserMapper userMapper;

}
