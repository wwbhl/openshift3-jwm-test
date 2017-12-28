package com.liuqi.jwm.service;

import com.liuqi.jwm.pojo.TestUser;

import java.util.List;

public interface TestUserService {

    public List<TestUser> getUsers(Integer userId);
}
