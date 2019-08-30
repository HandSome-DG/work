package com.arrcen.web.controller;

import com.arrcen.web.pojo.DataElement;
import com.arrcen.web.service.DataTreeService;
import com.arrcen.web.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/20 14:26
 * @since 1.0.0
 */
@RestController
@RequestMapping("/dataTree")
public class DataTreeController {

    @Autowired
    private DataTreeService dataTreeService;

    @RequestMapping("/getAll")
    public ResultVO<Object> getData(){


//        List<Object> list = dataTreeService.getData();
//        if(list.size()>0){
//            return ResultVO.success(list);
//        }
        return ResultVO.error("false");
    }


    @RequestMapping("/dataElementInfo")
    public ResultVO<Object> dataElementInfo(@RequestParam String dataElementName, @RequestParam String parentName){

        Map<String, Object> map = dataTreeService.getElementInfo(dataElementName, parentName);
        if (map.size()>0){
            return ResultVO.success(map);
        }
        return ResultVO.error("false");
    }
}
