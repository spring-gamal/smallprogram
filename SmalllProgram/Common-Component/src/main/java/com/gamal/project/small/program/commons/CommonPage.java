package com.gamal.project.small.program.commons;

import java.io.Serializable;
import java.util.List;

import com.github.pagehelper.Page;

import lombok.Data;

@Data
public class CommonPage<T> implements Serializable
{
    private static final long serialVersionUID = 6887431270696013168L;

    private List<T> rows;

    private long total;

    public CommonPage()
    {
    }

    public CommonPage(Page<T> page)
    {
        this.rows = page.getResult();
        this.total = page.getTotal();
    }

}
