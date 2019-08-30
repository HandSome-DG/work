package com.arrcen.web.service;

import com.arrcen.web.pojo.ElementCode;

import java.util.List;

public interface ElementService {
    boolean save(ElementCode elementCode);

    List<ElementCode> selectAll();
}
