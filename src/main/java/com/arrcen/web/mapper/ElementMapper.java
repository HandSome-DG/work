package com.arrcen.web.mapper;

import com.arrcen.web.pojo.ElementCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ElementMapper {
    int save(ElementCode elementCode);

    List<ElementCode> selectAll();
}
