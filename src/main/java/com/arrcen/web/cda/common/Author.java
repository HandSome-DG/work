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
    "time",
    "assignedAuthor"
})
@XmlRootElement(name = "author")
@Data
public class Author {

    @XmlElement(required = true)
    protected Time time;
    @XmlElement(required = true)
    protected AssignedAuthor assignedAuthor;
    @XmlAttribute(name = "typeCode", required = true)
    protected String typeCode;
    @XmlAttribute(name = "contextControlCode", required = true)
    protected String contextControlCode;

    @Override
    public String toString() {
        return "Author{" +
                "time=" + time +
                ", assignedAuthor=" + assignedAuthor +
                ", typeCode='" + typeCode + '\'' +
                ", contextControlCode='" + contextControlCode + '\'' +
                '}';
    }



}
