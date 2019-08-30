package com.arrcen.web.response;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈API统一返回格式〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/7/22 14:51
 * @since 1.0.0
 */
public class ResponseFormat {

    private static HashMap<Integer,String> map = Maps.newHashMap();

    static {
        /*失败状态码*/
        map.put(0,"false");
        /* 成功状态码 */
        map.put(1,"success");

       /* *//* 服务器错误 *//*
        map.put(1000,"服务器错误");

        *//* 参数错误：10001-19999 *//*
        map.put(10001, "参数无效");
        map.put(10002, "参数为空");
        map.put(10003, "参数类型错误");
        map.put(10004, "参数缺失");

        *//* 用户错误：20001-29999*//*
        map.put(20001, "用户未登录");
        map.put(20002, "账号不存在或密码错误");
        map.put(20003, "账号已被禁用");
        map.put(20004, "用户不存在");
        map.put(20005, "用户已存在");

        *//* 业务错误：30001-39999 *//*
        map.put(30001, "某业务出现问题");

        *//* 系统错误：40001-49999 *//*
        map.put(40001, "系统繁忙，请稍后重试");

        *//* 数据错误：50001-599999 *//*
        map.put(50001, "数据未找到");
        map.put(50002, "数据有误");
        map.put(50003, "数据已存在");
        map.put(50004,"查询出错");

        *//* 接口错误：60001-69999 *//*
        map.put(60001, "内部系统接口调用异常");
        map.put(60002, "外部系统接口调用异常");
        map.put(60003, "该接口禁止访问");
        map.put(60004, "接口地址无效");
        map.put(60005, "接口请求超时");
        map.put(60006, "接口负载过高");

        *//* 权限错误：70001-79999 *//*
        map.put(70001, "无权限访问");*/
    }

    public static GenericResponse retParam(Integer status,Object data) {
        GenericResponse json = new GenericResponse(status, map.get(status), data);
        return json;
    }

}
