package com.arrcen.web.service;

import com.arrcen.web.pojo.Data;

import java.util.List;


public interface DataService {
    Data getData(String id);

    List<Data> getDataList(Integer pre, Integer suf);
}
