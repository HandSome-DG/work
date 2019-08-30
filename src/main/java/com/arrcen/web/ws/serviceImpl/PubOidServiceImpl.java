package com.arrcen.web.ws.serviceImpl;

import com.arrcen.web.mapper.PubOidMapper;
import com.arrcen.web.pojo.PubOid;
import com.arrcen.web.ws.PubOidService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/8/1 9:15
 * @since 1.0.0
 */
@WebService(serviceName = "PubOidService",targetNamespace = "http://serviceImpl.ws.web.arrcen.com",
        endpointInterface = "com.arrcen.web.ws.PubOidService")
@Component
public class PubOidServiceImpl implements PubOidService {

    @Autowired
    private PubOidMapper pubOidMapper;

    @Override
    public List<PubOid> pagePubOid(Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        List<PubOid> pubOids = pubOidMapper.selectAll();
        return pubOids;
    }
}
