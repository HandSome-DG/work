package com.arrcen.web.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 〈API统一类〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/7/22 14:45
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
public class GenericResponse {

    private Integer code;
    private String message;
    private Object content;



}
