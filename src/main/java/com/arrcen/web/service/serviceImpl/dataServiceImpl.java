package com.arrcen.web.service.serviceImpl;

import com.arrcen.web.mapper.DataMapper;
import com.arrcen.web.pojo.Data;
import com.arrcen.web.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.List;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/11 10:46
 * @since 1.0.0
 */
@Service
@WebService
public class dataServiceImpl implements DataService {

    @Autowired
    private DataMapper dataMapper;

    @Override
    public Data getData(String id) {
        return dataMapper.getData(id);
    }

    @Override
    public List<Data> getDataList(Integer pre, Integer suf) {

        List<Data> dataList = dataMapper.getDataList(pre, suf);
        return dataList;
    }

    public static void main(String[] args) {
        String address = "http://127.0.0.1:8888/data";
        dataServiceImpl dataService = new dataServiceImpl();
        Endpoint.publish(address,dataService);
        System.out.println("success");
    }
}
