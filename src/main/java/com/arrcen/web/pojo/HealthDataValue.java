package com.arrcen.web.pojo;

import lombok.Data;

import java.util.List;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/21 15:08
 * @since 1.0.0
 */
@Data
public class HealthDataValue {

    /**系统序号*/
    private Integer systemId;
    /**OID*/
    private String oId;
    /**值域代码*/
    private String rangeCode;
    /**值域名称*/
    private String rangeName;
    /**值*/
    private String value;
    /**值含义*/
    private String valueMeans;
    /**类别*/
    private String category;
    /**子类别*/
    private String childCategory;
    /**版本*/
    private String version;
    /**备注*/
    private String remarks;

}
