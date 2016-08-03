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

    /**
     * @Documented 是否會保存到 Javadoc 文件中
     */


    /**
     * @Inherited 是否可以被繼承，預設為 false
     */

    /**
     * @Retention 描述註解的生命週期
     *
     *1.SOURCE:在Source Code保留
     *2.CLASS:在編譯後Class保留
     *3.RUNTIME:在JVM虛擬機執行時期保留
     */

    /**
     * @Target 被描述的註解可以用在什麼地方，可傳入的參數有以下
     *
     *1.CONSTRUCTOR:描述建構子
     *2.FIELD:描述類別成員的變數
     *3.LOCAL_VARIABLE:描述區域變數
     *4.METHOD:描述方法
     *5.PACKAGE:描述PACKAGE
     *6.PARAMETER:描述參數
     *7.TYPE:描述類別、介面、註解類型或列舉　　　　　　
     */

}