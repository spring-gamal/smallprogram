package com.gamal.project.small.program.commons;

import lombok.Data;

@Data
public class ResultMsg
{
    private String code;

    private String message;

    public ResultMsg()
    {
        this.code = "1";
        this.message = "操作成功";
    }

    public ResultMsg(String code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public ResultMsg(String code)
    {
        this.code = code;
    }

}
