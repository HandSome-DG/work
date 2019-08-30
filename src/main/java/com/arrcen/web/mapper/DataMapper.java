package com.arrcen.web.mapper;

import com.arrcen.web.pojo.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataMapper {
    Data getData(String id);

    List<Data> getDataList(@Param("pre") Integer pre, @Param("suf") Integer suf);
}
