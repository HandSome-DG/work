package com.arrcen.web.vo;

import lombok.Data;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/18 16:34
 * @since 1.0.0
 */
@Data
public class ResultVO<T> {

    private String msg;
    private Integer code;
    private T data;

    public static <T> ResultVO success(T data){
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setMsg("success");
        resultVO.setCode(1);
        resultVO.setData(data);
        return resultVO;
    }

    public static <T> ResultVO error(String msg){
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(0);
        resultVO.setMsg(msg);
        resultVO.setData(null);
        return resultVO;
    }
}

