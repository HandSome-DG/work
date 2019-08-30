//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.06.24 ʱ�� 05:21:55 PM CST 
//


package com.arrcen.web.cda.common;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_value", propOrder = {
    "value"
})
@XmlSeeAlso({
    ST.class,
    CD.class
})
@Data
public class TValue {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "displayName")
    protected String displayName;
    @XmlAttribute(name = "codeSystemName")
    protected String codeSystemName;
    @XmlAttribute(name = "codeSystem")
    protected String codeSystem;
    @XmlAttribute(name = "code")
    protected String code;

    @Override
    public String toString() {
        return "TValue{" +
                "value='" + value + '\'' +
                ", displayName='" + displayName + '\'' +
                ", codeSystemName='" + codeSystemName + '\'' +
                ", codeSystem='" + codeSystem + '\'' +
                ", code='" + code + '\'' +
                '}';
    }



}
