/**
 * Project Name:Base-Service
 * File Name:BaseBean.java
 * Package Name:com.purcotton.middleware.base.bean
 * Date:2017年11月1日下午2:13:27
 * Copyright (c) 2017, All Rights Reserved.
 *
*/

package com.gamal.project.small.program.bean;

import java.util.Date;

import lombok.Data;

/**
 * ClassName:BaseBean <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年11月1日 下午2:13:27 <br/>
 * @author   zfzhu
 * @version   
 * @see 	 
 */
@Data
public class BaseBean
{

    private String id;
    
    private String creator;
    
    private String updator;
    
    private Date createDate;
    
    private Date updateDate;
    
}

