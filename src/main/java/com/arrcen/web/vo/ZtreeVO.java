package com.arrcen.web.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class ZtreeVO {

    private String id;
    @JsonProperty("pId")
    private String pId;
    private String name;
    private Boolean checked;
    private Boolean open;
    private Boolean isParent;

    //多层级关系

    private List<ZtreeVO> children;

    private List<Object> children1;

}
