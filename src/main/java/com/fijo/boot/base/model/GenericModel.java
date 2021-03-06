package com.fijo.boot.base.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用途：通用实体
 * 作者: zhangbo
 * 时间: 2019/10/28  21:47
 */
@Data
@MappedSuperclass
public abstract class GenericModel{

    @Column(name = "CREATE_TIME")
    private String createTime;//创建日期

    @Column(name = "CREATE_USER_NAME")
    private String createUserName;//创建人

    @Column(name = "CREATE_USER_ID")
    private Integer createUserId;//创建人ID

    @Column(name = "UPDATE_TIME")
    private String updateTime;//更新时间

    @Column(name = "UPDATE_USER_NAME")
    private String updateUserName;//更新人

    @Column(name = "UPDATE_USER_ID")
    private Integer updateUserId;//更新人ID

    @Column(name = "ENABLED")
    private String enabled;//是否有效

    @Column(name = "REMOVED")
    private String removed; //是否删除

    @Transient
    private String wherecondition; //自定义查询条件（单个）

    @Transient
    private String updatecondition; //自定义更新（单个）

    @Transient
    private List<String> wherelist; //自定义查询条件（多个）

    @Transient
    private List<String> updatelist; //自定义更新（多个）

    @Transient
    private String orderByClause;//排序

    @Transient
    private String groupByClause;//分组

    @Transient
    private String limitCount;

}
