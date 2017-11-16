/**
 * Project Name:Base-Service
 * File Name:SystemCode.java
 * Package Name:com.purcotton.middleware.base.bean
 * Date:2017年11月7日下午2:22:51
 * Copyright (c) 2017, All Rights Reserved.
 */

package com.gamal.project.small.program.commons;

import com.github.pagehelper.StringUtil;

/**
 * ClassName: SystemErrorCode <br/>
 * Function: 定义系统编码. <br/>
 * 编码规则：服务类型（4位） + 业务类型（3位）
 * [
 * 业务类型
 * 000-300 系统错误;<br/>
 * 600-999 业务错误;<br/>
 * 301-599 留用扩展<br/>
 * ]
 * <br/>
 * eg： 1000001\2000001
 * Date: 2017年11月7日 下午2:22:51 <br/>
 * 
 * @author zfzhu
 * @version
 * @see
 */
public enum SystemErrorCode
{
    SUCCESS("200", "执行成功");

    private String code;

    private String message;

    private SystemErrorCode(String code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public static String getMessage(String code)
    {
        if (StringUtil.isNotEmpty(code))
        {

            for (SystemErrorCode o : SystemErrorCode.values())
            {
                if (o.getCode().equals(code))
                {
                    return o.getMessage();
                }
            }
        }

        return "";
    }

}
