package com.example.main;

import com.example.annotation.MyAnnotation;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        try {
            /**
             * 透過反射取得GetMyAnnotation註解訊息與方法
             */
            Class<?> className = Class.forName(GetMyAnnotation.class.getName());
            Method[] methods = className.getMethods();
            for (Method method : methods) {
                /**
                 * 如果一個注解指定類型是存在於此元素上方法返回true，否則返回false。這種方法主要是為了便於訪問標記注釋而設計。
                 */
                if (method.isAnnotationPresent(MyAnnotation.class)) {
                    /**
                     * 此方法返回當前這個元素上的所有注釋。
                     */
                    MyAnnotation myAnnotation = (MyAnnotation) method.getAnnotation(MyAnnotation.class);
                    System.out.println("GetMyAnnotation's creater ---> " + myAnnotation.creater() + " time " + myAnnotation.date());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 這裡是使用自定義 自定義註解 MyAnnotation 的範例。
     * MyAnnotation 作用為給方法添加相關信息，包括 creater、date、version。
     *
     * @return
     */
    @MyAnnotation(creater = "LeeMengZn", date = "2016/08/03", version = 2)
    public String getAppName() {
        return "trinea";
    }

    /**
     * 標準註解
     *
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
