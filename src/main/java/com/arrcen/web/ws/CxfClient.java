package com.arrcen.web.ws;


import com.arrcen.web.pojo.PubOid;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/8/1 10:15
 * @since 1.0.0
 */
public class CxfClient {

    public static void main(String[] args) {
        excute();
    }

    private static void excute() {
        try {
            String address = "http://127.0.0.1:8889/services/pubOid?wsdl";
            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
            jaxWsProxyFactoryBean.setAddress(address);
            jaxWsProxyFactoryBean.setServiceClass(PubOidService.class);
            PubOidService po = (PubOidService)jaxWsProxyFactoryBean.create();
            List<PubOid> pubOids = po.pagePubOid(1);
            System.out.println(pubOids.size());
            pubOids.forEach(pubOid -> System.out.println(pubOid.getOid名称()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
