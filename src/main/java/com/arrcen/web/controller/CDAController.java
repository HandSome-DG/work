package com.arrcen.web.controller;

import com.alibaba.fastjson.JSON;
import com.arrcen.web.cda.common.ClinicalDocument;
import com.arrcen.web.utils.RecodeUtil;
import com.arrcen.web.utils.XmlUtil;
import com.arrcen.web.vo.ResultVO;
import com.arrcen.web.vo.ZtreeVO;
import lombok.extern.java.Log;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;
import sun.plugin.net.cookie.Netscape4CookieHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 〈〉
 *
 * @author HandSome、DG
 * @email wangdi96@qq.com
 * @create 2019/6/25 9:27
 * @since 1.0.0
 */
@RestController
@RequestMapping("/info")
public class CDAController {

    @GetMapping("/cda")
    public ResultVO<ClinicalDocument> get(){
        Object cli = XmlUtil.convertXmlFileToObject(ClinicalDocument.class, "D:/development_tool/HBuilderX/workspace/xmls/24小时内入出院记录.xml");
//        String toJSONString = JSON.toJSONString(cli);

        return ResultVO.success(cli);
    }

    /**
     * 生成微信图片二维码
     *
     * @param request
     * @param response
     * @param content   为前端传过来的二维码的内容，即路径链接
     * @throws Exception
     */
    @GetMapping("/qrcode")
    public void qrcode(HttpServletRequest request, HttpServletResponse response, @RequestParam(name = "content") String content) throws Exception {
        if (StringUtils.isBlank(content)) {
            response.sendRedirect("/404.html");
            return;
        }
        //调用工具类，生成二维码
        RecodeUtil.creatRrCode(content, 180,180,response);   //180为图片高度和宽度
    }


    @RequestMapping("/get")
    public ResultVO<List<ZtreeVO>> getInfo() throws Exception {

        ClinicalDocument cli = (ClinicalDocument) XmlUtil.convertXmlFileToObject(ClinicalDocument.class, "E:/ARRCEN/共享文档生成工具/Debug/XML/CXJ_4404_C0024.xml");

        if (cli!=null){
            List<ZtreeVO> list= getZtree(cli);
            return ResultVO.success(list);
        }

        return ResultVO.error("false");
    }

    private List<ZtreeVO> getZtree(Object obj) throws Exception {

        List<ZtreeVO> list = new ArrayList<>();


        //对象类型为一般数据类型
        if(obj instanceof String || obj instanceof Long || obj instanceof Byte){
            return null;
        }else {
            Class<? extends Object> aClass = obj.getClass();
            ZtreeVO ztreeVO = new ZtreeVO();
            ztreeVO.setName(aClass.getSimpleName().toLowerCase());

            Field[] declaredFields = aClass.getDeclaredFields();
            int length = declaredFields.length;
            System.out.println(length);

            List<ZtreeVO> list2 = new ArrayList<>();

            //对象内有字段
            if (length > 0) {
                for (Field declaredField : declaredFields) {

                    String name = declaredField.getName();

                    // 将属性的首字符大写，方便构造get，set方法
                    name = name.substring(0, 1).toUpperCase() + name.substring(1);
                    String s = declaredField.getGenericType().toString();

//                    System.out.println(s);
//                    boolean baseDataType = isBaseDataType(s);

                    //字段为引用数据类型
//                    if (!baseDataType) {
                        List<ZtreeVO> list1 = new ArrayList<>();
//反射由get方法获取字段值
                        Method m = obj.getClass().getMethod("get" + name);

                        if (m.invoke(obj) instanceof String||m.invoke(obj) instanceof Long||m.invoke(obj) instanceof Byte||m.invoke(obj)==null) {
                            continue;
                        }



                        if(s.contains("List")){
                            List<Object> l = (List<Object>) m.invoke(obj);
                            for (Object o : l) {
                                list1 = getZtree(o);

                            }
                        }else {
                            //递归
                            list1 = getZtree(m.invoke(obj));
                        }
//                    }else {
//                        continue;
//                    }
                    ZtreeVO ztreeVO2 = new ZtreeVO();
                    ztreeVO2.setName(declaredField.getName());
                    ztreeVO2.setChildren(list1);
                    list2.add(ztreeVO2);

                    ztreeVO.setChildren(list2);

                }
            }
            list.add(ztreeVO);
        }

        return list;
    }

    /**
     * 判断一个类是否为基本数据类型。
     * @param clazz 要判断的类。
     * @return true 表示为基本数据类型。
     */
    private static boolean isBaseDataType(String clazz)  throws Exception
    {
        return
                (
                                clazz.equals("class java.lang.String") ||
                                clazz.equals("class java.long.Integer")||
                                clazz.equals("class java.long.Byte") ||
//                                clazz.equals(Long.class) ||
//                                clazz.equals(Double.class) ||
//                                clazz.equals(Float.class) ||
//                                clazz.equals(Character.class) ||
//                                clazz.equals(Short.class) ||
//                                clazz.equals(BigDecimal.class) ||
//                                clazz.equals(BigInteger.class) ||
                                clazz.equals("class java.long.Boolean") ||
                                clazz.equals("class java.util.Date")
//                                clazz.equals(DateTime.class) ||
//                                clazz.isPrimitive()
                );
    }

    public static void main(String[] args) throws Exception {
        boolean baseDataType =CDAController.isBaseDataType("class java.long.String");
        System.out.println(baseDataType);
    }

    @RequestMapping("/put")
    public ResultVO cdaDocument(@RequestBody String arrNodes, HttpServletRequest request){
        System.out.println(arrNodes);

        return ResultVO.error("false");
    }
}
