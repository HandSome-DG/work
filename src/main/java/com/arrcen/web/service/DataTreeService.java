package com.arrcen.web.service;

import com.arrcen.web.pojo.DataElement;

import java.util.List;
import java.util.Map;

public interface DataTreeService {
    List<Object> getData();

    Map<String, Object> getElementInfo(String dataElementName, String parentName);
}
