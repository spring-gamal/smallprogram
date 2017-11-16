package com.gamal.project.small.program.query;

import java.util.Date;

import lombok.Data;

@Data
public class BaseQuery
{
    private String id;

    /**
     * 开始创建时间
     */
    private Date startCreateDate;

    /**
     * 结束创建时间
     */
    private Date endCreateDate;

    /**
     * 开始更新时间
     */
    private Date startUpdateDate;

    /**
     * 结束更新时间
     */
    private Date endUpdateDate;

    /**
     * 状态
     */
    private Integer status;

}
