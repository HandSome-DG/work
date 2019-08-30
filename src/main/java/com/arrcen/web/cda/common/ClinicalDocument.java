//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.06.24 ʱ�� 05:21:55 PM CST 
//


package com.arrcen.web.cda.common;

import com.alibaba.fastjson.JSON;
import com.arrcen.web.utils.XmlUtil;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "id",
    "code",
    "title",
    "effectiveTime",
    "confidentialityCode",
    "languageCode",
    "setId",
    "versionNumber",
    "recordTarget",
    "author",
    "custodian",
    "authenticator",
    "relatedDocument",
    "component"
})
@XmlRootElement(name = "ClinicalDocument")
@Data
public class ClinicalDocument {

    @XmlElement(required = true)
    protected RealmCode realmCode;
    @XmlElement(required = true)
    protected TypeId typeId;
    @XmlElement(required = true)
    protected TemplateId templateId;
    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    protected Code code;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected EffectiveTime effectiveTime;
    @XmlElement(required = true)
    protected ConfidentialityCode confidentialityCode;
    @XmlElement(required = true)
    protected LanguageCode languageCode;
    @XmlElement(required = true)
    protected SetId setId;
    @XmlElement(required = true)
    protected VersionNumber versionNumber;
    @XmlElement(required = true)
    protected RecordTarget recordTarget;
    @XmlElement(required = true)
    protected Author author;
    @XmlElement(required = true)
    protected Custodian custodian;
    @XmlElement(required = true)
    protected Authenticator authenticator;
    @XmlElement(required = true)
    protected RelatedDocument relatedDocument;
    @XmlElement(required = true)
    protected Component component;

    @Override
    public String toString() {
        return "ClinicalDocument{" +
                "realmCode=" + realmCode +
                ", typeId=" + typeId +
                ", templateId=" + templateId +
                ", id=" + id +
                ", code=" + code +
                ", title='" + title + '\'' +
                ", effectiveTime=" + effectiveTime +
                ", confidentialityCode=" + confidentialityCode +
                ", languageCode=" + languageCode +
                ", setId=" + setId +
                ", versionNumber=" + versionNumber +
                ", recordTarget=" + recordTarget +
                ", author=" + author +
                ", custodian=" + custodian +
                ", authenticator=" + authenticator +
                ", relatedDocument=" + relatedDocument +
                ", component=" + component +
                '}';
    }

    public static void main(String[] args) {
        Object cli = XmlUtil.convertXmlFileToObject(ClinicalDocument.class, "D:/development_tool/HBuilderX/workspace/xmls/24小时内入出院记录.xml");
        String toJSONString = JSON.toJSONString(cli);
        System.out.println(toJSONString);

//        XmlUtil.convertToXml(new ClinicalDocument(),"E:/xmls/22.xml");
    }

}
