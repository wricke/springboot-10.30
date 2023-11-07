package com.example.pojo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:pric
 * Date:2023/11/1 21:44
 */
@Data
public class Result {
    private Boolean success;
    private int code;
    private String message;
    private Map<String,Object>data = new HashMap<>();


    public static Result ok(){
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(20000);
        r.setMessage("成功");
        return  r;
    }

    public static Result erroe(){
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(20001);
        r.setMessage("失败");
        return  r;
    }

    public Result data(String key , Object value) {
         this.data.put(key,value);
         return this;
    }

    public Result data(Map<String,Object>map) {
        this.setData(map);
        return this;
    }

}
