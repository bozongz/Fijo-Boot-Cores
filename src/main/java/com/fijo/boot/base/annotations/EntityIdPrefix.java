/*
 *
 */
package com.fijo.boot.base.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用途：数据库实体主键前缀
 * 作者: zhangbo
 * 时间: 2019/10/28  16:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD })
public @interface EntityIdPrefix {
    String prefix();
}
