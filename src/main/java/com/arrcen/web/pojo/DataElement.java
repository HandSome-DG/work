package com.arrcen.web.pojo;

import lombok.Data;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/21 10:22
 * @since 1.0.0
 */
@Data
public class DataElement {

    /**系统序号*/
    private Integer systemId;
    /**内部标识符*/
    private String internalIdentifier;
    /**数据元标识符*/
    private String dataElementIdentifier;
    /**数据元名称*/
    private String dataElementName;
    /**定义*/
    private String definition;
    /**数据类型*/
    private String dataType;
    /**表示格式*/
    private String showFormat;
    /**数据元允许值*/
    private String allowedValue;
    /**数据集名称*/
    private String dataSetName;
    /**子集名称*/
    private String dataSetChildName;
    /**版本*/
    private String version;
    /**备注*/
    private String remarks;

}
