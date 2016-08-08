package com.example.main;

import com.example.annotation.MyAnnotation;

public class GetMyAnnotation {

    @MyAnnotation(creater = "LeeMengZn", date = "2016/08/03", version = 2)
    public String work() {  
        return "work over!";  
    }  
}  