package com.arrcen.web.controller;

import com.arrcen.web.pojo.ElementCode;
import com.arrcen.web.service.ElementService;
import com.arrcen.web.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/18 16:08
 * @since 1.0.0
 */
@RestController
//@RequestMapping("/element")
public class ElementController {

    @Autowired
    private ElementService elementService;

    @PutMapping("/save")
    public Integer saveElement(String name, Model model){
        ElementCode elementCode = new ElementCode();
        elementCode.setElementName(name);
        elementCode.setParentId(0);
        boolean result = elementService.save(elementCode);
        if (result){
            return 1;
        }
        return 0;
    }

    @GetMapping("/getAll")
    public ResultVO<List<ElementCode>> getTableData(Model model){
        List<ElementCode> list = elementService.selectAll();
        if(list.size()>0){
//            model.addAttribute("list",list);
            return ResultVO.success(list);
        }
        return null;
    }


}
