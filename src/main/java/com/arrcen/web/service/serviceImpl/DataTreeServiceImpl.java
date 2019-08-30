package com.arrcen.web.service.serviceImpl;

import com.arrcen.web.mapper.DataTreeMapper;
import com.arrcen.web.pojo.DataElement;
import com.arrcen.web.pojo.HealthDataValue;
import com.arrcen.web.service.DataTreeService;
import com.arrcen.web.vo.KeyAndValue;
import com.arrcen.web.vo.ZtreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/20 14:31
 * @since 1.0.0
 */
@Service
public class DataTreeServiceImpl implements DataTreeService {

    @Autowired
    private DataTreeMapper dataTreeMapper;
    @Override
    public List<Object> getData() {
        List<Object> list = new ArrayList<>();
        //获取数据集名称
        List<String> dataSetNameList = dataTreeMapper.getParents();
        /*dataSetNameList.forEach(String->{
            ZtreeVO ztreeVO = new ZtreeVO();
            ztreeVO.setName(String);
            list.add(ztreeVO);
        });*/
        for (String dataSetName : dataSetNameList) {
            ZtreeVO ztreeVO = new ZtreeVO();
//            Map<String, Object> parentsMap = new HashMap<>();
//            parentsMap.put("name",dataSetName);
            ztreeVO.setName(dataSetName);
            //获取数据子集名称
            List<String> dataChildSetNameList = dataTreeMapper.getSeconds(dataSetName);
            List<Object> secondList = new ArrayList<>();
            for (String dataChildSetName : dataChildSetNameList) {
                ZtreeVO ztreeVO1 = new ZtreeVO();
//                Map<String, Object> dataChildSetMap = new HashMap<>();
//                dataChildSetMap.put("name",dataChildSetName);
                ztreeVO1.setName(dataChildSetName);
                //获取数据元名称
                List<String> dataElementNameList= dataTreeMapper.getThirds(dataChildSetName);
                List<Object> thirdList = new ArrayList<>();
                for (String s : dataElementNameList) {
//                    Map<String, String> map = new HashMap<>();
//                    map.put("name",s);
                    ZtreeVO ztreeVO2 = new ZtreeVO();
                    ztreeVO2.setName(s);
//                    thirdList.add(map);
                    thirdList.add(ztreeVO2);
//                    dataChildSetMap.put("children",thirdList);
                    ztreeVO1.setChildren1(thirdList);
                }
//                secondList.add(dataChildSetMap);
                secondList.add(ztreeVO1);
            }
//            parentsMap.put("children",secondList);
            ztreeVO.setChildren1(secondList);
//            list.add(parentsMap);
            list.add(ztreeVO);
        }
        return list;
    }

    @Override
    public Map<String, Object> getElementInfo(String dataElementName, String name) {
        Map<String, Object> map = new HashMap<>();
        DataElement elementInfo = dataTreeMapper.getElementInfo(dataElementName, name);
        String dataElementIdentifier = elementInfo.getDataElementIdentifier();
        List<HealthDataValue> healthDataValueList = dataTreeMapper.getHealthDataValue(dataElementIdentifier);
            List<KeyAndValue> valueList = new ArrayList<>();
            healthDataValueList.forEach(healthDataValue->{
                if(healthDataValue!=null){
                    KeyAndValue keyAndValue = new KeyAndValue();
                    keyAndValue.setKey(healthDataValue.getValue());
                    keyAndValue.setValue(healthDataValue.getValueMeans());
                    if(healthDataValue.getRemarks()==null){
                        keyAndValue.setRemarks("");
                    }else {
                        keyAndValue.setRemarks(healthDataValue.getRemarks());
                    }
                    valueList.add(keyAndValue);
                }
            });
            map.put("valueList",valueList);
            map.put("healthDataValueList",healthDataValueList.get(0));

        map.put("elementInfo",elementInfo);
        return map;
    }
}
