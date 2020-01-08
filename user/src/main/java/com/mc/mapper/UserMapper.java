package com.mc.mapper;

import com.mc.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> findAll(int pageNum, int pageSize);
    public int count();
    public User findById(long userid);
    public void save(User user);
    public void update(User user);
    public void deleteById(long userid);
}
