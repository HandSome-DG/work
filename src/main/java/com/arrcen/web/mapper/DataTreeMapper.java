package com.arrcen.web.mapper;

import com.arrcen.web.pojo.DataElement;
import com.arrcen.web.pojo.HealthDataValue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DataTreeMapper {
    List<String> getParents();

    List<String> getSeconds(String dataSetName);

    List<String> getThirds(String dataChildSetName);

    DataElement getElementInfo(@Param("dataElementName") String dataElementName, @Param("parentName") String name);

    List<HealthDataValue> getHealthDataValue(String dataElementIdentifier);
}
