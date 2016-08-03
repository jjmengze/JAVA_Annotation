package com.example.main;

import com.example.annotation.MyAnnotation;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        System.out.print(getAppName());
    }

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
