package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 發現MyOverride註解上面有兩個註解, 這就是元註解。
 * 元註解就是用來定義註解的註解，定義註解的作用範圍。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface MyOverride {

    /**
     * 元注解共有四种@Retention, @Target, @Inherited, @Documented
     */
}