package com.mc.mapper;

import com.mc.pojo.Type;

import java.util.List;

public interface TypeMapper {
    public Type findById(long typeId);
    public List<Type> findAll();
}
