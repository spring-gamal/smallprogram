package com.gamal.project.small.program.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamal.project.small.program.bean.BaseBean;
import com.gamal.project.small.program.commons.CommonPage;
import com.gamal.project.small.program.commons.SystemErrorCode;
import com.gamal.project.small.program.mapper.BaseMapper;
import com.gamal.project.small.program.query.BaseQuery;
import com.gamal.project.small.program.service.BaseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public abstract class BaseServiceImpl<T extends BaseBean, Q extends BaseQuery> implements BaseService<T, Q>
{

    public List<T> getAll()
    {
        return getMapper().getAll();
    }

    public T getOne(Integer id)
    {
        return getMapper().getOne(id);
    }

    public void insert(T t)
    {
        // t.setId(getRandomId());
        getMapper().insert(t);
    }

    public void update(T t)
    {
        getMapper().update(t);
    }

    @Transactional
    public String delete(Integer id)
    {
        String code = SystemErrorCode.SUCCESS.getCode();
        int count = getMapper().delete(id);
        if (count == 0)
        {
            throw new RuntimeException();
        }
        return code;
    }

    public CommonPage<T> pageSearch(int currentPage, int pageSize, Q q)
    {
        Page<T> page = new Page<T>();
        // 分页
        if (currentPage > 0 && pageSize > 0)
        {
            page = PageHelper.startPage(currentPage, pageSize);
        }
        getMapper().pageSearch(q);
        return new CommonPage<T>(page);
    }

    public CommonPage<T> pageSearch(int currentPage, int pageSize, boolean isCount, String orderStr, Q q)
    {
        Page<T> page = new Page<T>();
        // 分页
        if (currentPage > 0 && pageSize > 0)
        {
            if (StringUtils.isNotBlank(orderStr))
            {
                page = PageHelper.startPage(currentPage, pageSize, orderStr);
            }
            else if (isCount)
            {
                page = PageHelper.startPage(currentPage, pageSize, isCount);
            }
        }

        getMapper().pageSearch(q);

        return new CommonPage<T>(page);
    }

    /**
     * 获取mapper对象
     * 
     * @return
     */
    public abstract BaseMapper<T, Q> getMapper();

}
