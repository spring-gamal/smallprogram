/**
 * Project Name:Base-Service
 * File Name:PurcottonException.java
 * Package Name:com.purcotton.middleware.base.exception
 * Date:2017年11月7日下午2:17:11
 * Copyright (c) 2017, All Rights Reserved.
 */

package com.gamal.project.small.program.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ClassName:PurcottonException <br/>
 * Reason: 系统异常类 <br/>
 * Date: 2017年11月7日 下午2:17:11 <br/>
 * 
 * @author zfzhu
 * @version
 * @see
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PurcottonException extends RuntimeException
{

    private static final long serialVersionUID = 4032989491792212508L;

    private String code;

    private String messsage;

    public PurcottonException(String code)
    {
        this.code = code;
    }

    public PurcottonException(String code, Throwable cause)
    {
        super(cause);
        this.code = code;
    }

    public PurcottonException(String code, String message, Throwable cause)
    {
        super(cause);
        this.code = code;
        this.messsage = message;
    }

    public PurcottonException(String code, String message)
    {
        this.code = code;
        this.messsage = message;
    }
}
