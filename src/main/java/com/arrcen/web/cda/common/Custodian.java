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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assignedCustodian"
})
@XmlRootElement(name = "custodian")
@Data
public class Custodian {

    @XmlElement(required = true)
    protected AssignedCustodian assignedCustodian;
    @XmlAttribute(name = "typeCode", required = true)
    protected String typeCode;

    @Override
    public String toString() {
        return "Custodian{" +
                "assignedCustodian=" + assignedCustodian +
                ", typeCode='" + typeCode + '\'' +
                '}';
    }



}
