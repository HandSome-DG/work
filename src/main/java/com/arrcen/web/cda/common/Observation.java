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
    "code",
    "value",
    "entryRelationship"
})
@XmlRootElement(name = "observation")
@Data
public class Observation {

    @XmlElement(required = true)
    protected Code code;
    @XmlElement(required = true)
    protected TValue value;
    protected EntryRelationship entryRelationship;
    @XmlAttribute(name = "moodCode", required = true)
    protected String moodCode;
    @XmlAttribute(name = "classCode", required = true)
    protected String classCode;

    @Override
    public String toString() {
        return "Observation{" +
                "code=" + code +
                ", value=" + value +
                ", entryRelationship=" + entryRelationship +
                ", moodCode='" + moodCode + '\'' +
                ", classCode='" + classCode + '\'' +
                '}';
    }



}
