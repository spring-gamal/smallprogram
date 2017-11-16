package com.gamal.project.small.program.service;

import java.util.List;

import com.gamal.project.small.program.commons.CommonPage;


public interface BaseService<T, Q>
{
    List<T> getAll();

    T getOne(Integer id);

    CommonPage<T> pageSearch(int currentPage, int pageSize, Q q);

    /**
     * 分页查询
     * 
     * @param currentPage
     *            当前页数
     * @param pageSize
     *            每页条数
     * @param isCount
     *            是否count查询
     * @param orderStr
     *            排序
     * @param q
     *            查询参数
     * @return
     */
    CommonPage<T> pageSearch(int currentPage, int pageSize, boolean isCount, String orderStr, Q q);

    void insert(T t);

    void update(T t);

    String delete(Integer id);
}
