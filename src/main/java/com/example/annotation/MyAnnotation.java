package com.example.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ameng on 8/3/16.
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface MyAnnotation {
    /**
     *這裡是 MyAnnotation 的class 部份
     * 使用@interface定義，註解名稱即為自定義的註解名稱
     * 自定義的註解配置參數為METHOD:描述方法
     * 自定義的註解配置參數為RUNTIME:在JVM虛擬機執行時期保留
     * 自定義的註解配置參數為Documented會保存到 Javadoc 文件中
     * 自定義的註解配置參數為是否可以被繼承，預設為 false
     *
     * 所有的方法沒有實際的描述（也就是沒有方法體），沒有參數沒有修飾符號只允許 public & abstract 修飾符號
     * 所有的方法預設為 public，不允許方法拋出例外
     * 方法返回的數值只能是基本類型，例如：String, Class, annotation, enumeration
     * 可以加入 default 修飾符號 表示預設數值
     */

    String creater() default "AmengZn";

    String date();

    int version() default 1;
}
