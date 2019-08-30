package com.arrcen.web.cda.consts.sec;

import com.arrcen.web.cda.consts.ConstsValue;


public interface DocumentHead {

    /**
    *地域代码  CN代表中国
    */
    @ConstsValue
    public static String realmCode = "CN" ;

    /**
    *文档注册模型 root
    */
    @ConstsValue
    public static String root = "2.16.840.1.113883.1.3";

    /**
    *文档注册模型 extension
    */
    @ConstsValue
    public static String extension = "POCD_MT000040";
    
    /**
    * 文档流水号标识 root
    */
    public static String id_root="2.16.156.10011.1.1";
    

    /**
    * 用来说明记录文档的类型 codeSystem
    */
    @ConstsValue
    public static String code_codeSystem="2.16.156.10011.2.4";

    /**
    * 用来说明记录文档的类型 codeSystemName
    */
    @ConstsValue
    public static String getCode_codeSystemName="卫生信息共享文档编码体系";


    /**
    * 文档密级代码 codeSystem
    */
    @ConstsValue
    public static String confidentialityCode_codeSystem = "2.16.840.1.113883.5.25";

    /**
    * 文档语言类型编码 code
    */
    @ConstsValue
    public static String languageCode_code ="zh-CN";


    /**
    * 文档记录对象或健康保健对象 typeCode
    */
    @ConstsValue
    public static String recordTarget_typeCode="RCT";

    /**
    * 文档记录对象或健康保健对象 contextControlCode
    */
    @ConstsValue
    public static String recordTarget_contextControlCode="OP" ;

    /**
    * 患者角色 classCode
    */
    public static String patientRole_classCode="PAT";
    
    /**
    * 健康卡号标识 root
    */
    public static String health_id_root="2.16.156.10011.1.19";

    /**
    * 住院号标识 root
    */
    public static String hospital_id_root="2.16.156.10011.1.12";

    /**
    * 患者个人信息 classCode
    */
    public static String patient_classCode="PSN";

    /**
    * 患者个人信息 determinerCode
    */
    public static String patient_determinerCode="INSTANCE";

    /**
    * 患者身份证号标识 root
    */
    public static String patient_id_root="2.16.156.10011.1.3";

    /**
    * 性别代码 codeSystem
    */
    public static String administrativeGenderCode_codeSystem="2.16.156.10011.2.3.3.4";

    /**
    * 性别代码 codeSystemName
    */
    public static String administrativeGenderCode_codeSystemName="生理性别代码表（GB/T 2261.1）";

    /**
    * 婚姻状况 codeSystem
    */
    public static String maritalStatusCode_codeSystem="2.16.156.10011.2.3.3.5";

    /**
    * 婚姻状况 codeSystemName
    */
    public static String maritalStatusCode_codeSystemName="婚姻状况代码表（GB/T 2261.2）";

    /**
    * 职业类别代码 codeSystem
    */
    public static String occupationCode_codeSystem="2.16.156.10011.2.3.3.13";
    
    /**
    * 职业类别代码 codeSystemName
    */
    public static String occupationCode_codeSystemName="从业状况（个人身体）代码表";
    

    /**
    * 提供患者服务机构 classCode
    */
    public static String providerOrganization_classCode="ORG";
    
    /**
    * 提供患者服务机构 determinerCode
    */
    public static String providerOrganization_determinerCode="INSTANCE";

    /**
    * 文档创作者 typeCode
    */
    public static String author_typeCode="AUT";

    /**
    * 文档创作者 contextControlCode
    */
    public static String author_contextControlCode="OP";

    /**
    * 指定创作者
    */
    public static String assignedAuthor_classCode="ASSIGNED";

    /**
    * 文档管理机构信息
    */
    public static String custodian_typeCode="CST";

    /**
    * 文档保管医疗机构标识
    */
    public static String custodian_id_root="2.16.156.10011.1.5";




    
    

























}
