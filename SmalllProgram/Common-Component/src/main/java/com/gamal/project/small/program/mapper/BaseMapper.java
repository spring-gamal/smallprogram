package com.gamal.project.small.program.mapper;

import java.util.List;

public interface BaseMapper<T, Q>
{
    List<T> getAll();

    T getOne(Integer id);

    List<T> pageSearch(Q q);

    int insert(T t);

    void update(T t);

    int delete(Integer id);
}
