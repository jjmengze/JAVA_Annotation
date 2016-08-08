package com.example.main;

import com.example.annotation.MyAnnotation;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        System.out.print(getAppName());
    }

    /**
     * 這裡是使用自定義 自定義註解 MyAnnotation 的範例。
     * MyAnnotation 作用為給方法添加相關信息，包括 creater、date、version。
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
