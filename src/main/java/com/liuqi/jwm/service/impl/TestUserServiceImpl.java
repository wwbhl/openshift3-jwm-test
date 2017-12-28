package com.liuqi.jwm.service.impl;


import com.liuqi.jwm.dao.mapper.TestUserMapper;
import com.liuqi.jwm.pojo.TestUser;
import com.liuqi.jwm.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestUserServiceImpl implements TestUserService {

    @Autowired
    private TestUserMapper userMapper;

    public List<TestUser> getUsers(Integer userId) {

        return userMapper.queryById(userId);
    }
}
