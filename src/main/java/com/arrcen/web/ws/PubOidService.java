package com.arrcen.web.ws;

import com.arrcen.web.pojo.PubOid;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface PubOidService {
    @WebMethod
    public List<PubOid> pagePubOid(@WebParam(name = "pageNum") Integer pageNum);
}
