package com.demo.springbootmybatis.entity;

import lombok.Data;

import java.util.Date;

@Data
public class DangerWork {

    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 危险作业的工单编码
     */
    private String dangerousCode;
    /**
     * 危险作业名称
     */
    private String dangerousName;
    /**
     * 危险作业班组的部门ID
     */
    private Integer dangerousDeptId;

    /**
     * 危险作业班组的部门名称
     */
    private String dangerousDeptName;

    /**
     * 危险作业人员名字
     */
    private String dangerousUserName;

    /**
     * 危险作业发生的地点
     */
    private String dangerousLocation;

    /**
     * 危险作业的等级
     */
    private Integer dangerousLevel;
    private String dangerousLevelName;
    /**
     * 危险作业的监护人
     */
    private String dangerousGuardian;

    /**
     * 危险作业时间
     */
    private Date dangerousTime;
    private String strTime;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片
     */
    private String imgs;

    /**
     * 提交该条记录的用户ID
     */
    private Integer commitUserId;

    /**
     * 提交该条记录的用户名字
     */
    private String commitUserName;

}
