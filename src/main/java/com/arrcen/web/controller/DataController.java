package com.arrcen.web.controller;

import com.arrcen.web.pojo.Data;
import com.arrcen.web.pojo.PubOid;
import com.arrcen.web.response.GenericResponse;
import com.arrcen.web.response.ResponseFormat;
import com.arrcen.web.service.DataService;
import com.arrcen.web.ws.PubOidService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈〉
 * @create 2019/6/11 10:28
 * @since 1.0.0
 */
@RestController
@RequestMapping("/data")
@Api(value = "DataController",description = "卫生数据元相关操作",tags = "{卫生数据元}")
@ApiResponses({
        @ApiResponse(code = 500,message = "系统错误"),
        @ApiResponse(code = 200,message = "成功",response = ResponseEntity.class)
})
public class DataController {

    @Autowired
    private DataService dataService;

    @Autowired
    private PubOidService pubOidService;


    @ApiOperation(value = "获取卫生数据元的详细信息",httpMethod = "GET",notes = "根据url的id来获取卫生数据元的详细信息")
    @ApiImplicitParam(name = "id", value = "卫生数据元标识符", required = true,dataType = "String",paramType = "path")
    @GetMapping("/get/{id}")
    public GenericResponse getData(@PathVariable("id") String id){
        Data data = dataService.getData(id);
        if(data==null){
            return ResponseFormat.retParam(0,"查询失败");
        }
        return ResponseFormat.retParam(200,data);
    };

    @ApiOperation(value = "分页查询",httpMethod = "GET",notes = "输入页码查询该页数据")
    @ApiImplicitParam(name = "pagenum",value = "页码",required = false,dataType = "String",paramType = "path")
    @GetMapping("/getList/{pagenum}")
    public GenericResponse getDataList(@PathVariable("pagenum") Integer pageNum,Integer pageSize){

        if(pageNum<1){
            pageSize=1;
        }

        pageSize=10;

        Integer suf = pageNum*pageSize;
        Integer pre = suf-pageSize+1;

        List<Data> dataList = dataService.getDataList(pre, suf);
        if(dataList==null){
            return ResponseFormat.retParam(0,"false");
        }
        return ResponseFormat.retParam(200,dataList);
    }

    @GetMapping("/pubOid/{pageNum}")
    public List<PubOid> get(@PathVariable("pageNum") Integer pageNum){
        List<PubOid> pubOids = pubOidService.pagePubOid(pageNum);
        return pubOids;
    }
}
