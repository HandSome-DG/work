package com.arrcen.web.pojo;


/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/11 9:49
 * @since 1.0.0
 */
@lombok.Data
public class Data {

    /**数据元标识符*/
    private String id;
    /**数据元名称*/
    private String name;
    /**定义*/
    private String definition;
    /**数据类型*/
    private String type;
    /**表示格式*/
    private String format;
    /**数据元允许值*/
    private String beTrue;
    /**数据元值域代码*/
    private String dataValueCode;
    /**版本*/
    private String version;
    /**备注*/
    private String desc;

}
