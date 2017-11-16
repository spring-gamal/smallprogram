package com.gamal.project.small.program.commons;

import java.util.ArrayList;
import java.util.List;

public class ApiResultMsg<T> extends ResultMsg
{
    private List<T> list = new ArrayList<T>();

    public ApiResultMsg()
    {

    }

    public ApiResultMsg(String code)
    {
        super(code);
    }

    public List<T> getList()
    {
        return list;
    }

    public void setList(List<T> list)
    {
        this.list = list;
    }

}
