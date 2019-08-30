package com.arrcen.web.service.serviceImpl;

import com.arrcen.web.mapper.ElementMapper;
import com.arrcen.web.pojo.ElementCode;
import com.arrcen.web.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/19 13:55
 * @since 1.0.0
 */
@Service
public class ElementServiceImpl implements ElementService {

    @Autowired
    private ElementMapper elementMapper;
    @Override
    public boolean save(ElementCode elementCode) {
        int result = elementMapper.save(elementCode);
        if(result>0){
            return true;
        }
        return false;
    }

    @Override
    public List<ElementCode> selectAll() {

        List<ElementCode> elementCodes = elementMapper.selectAll();
        return elementCodes;

    }
}
