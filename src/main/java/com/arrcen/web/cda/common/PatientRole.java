//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.06.24 ʱ�� 05:21:55 PM CST 
//


package com.arrcen.web.cda.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "patient",
    "providerOrganization"
})
@XmlRootElement(name = "patientRole")
public class PatientRole {

    @XmlElement(required = true)
    protected List<Id> id;
    @XmlElement(required = true)
    protected Patient patient;
    @XmlElement(required = true)
    protected ProviderOrganization providerOrganization;
    @XmlAttribute(name = "classCode", required = true)
    protected String classCode;

    @Override
    public String toString() {
        return "PatientRole{" +
                "id=" + id +
                ", patient=" + patient +
                ", providerOrganization=" + providerOrganization +
                ", classCode='" + classCode + '\'' +
                '}';
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Id }
     * 
     * 
     */
    public List<Id> getId() {
        if (id == null) {
            id = new ArrayList<Id>();
        }
        return this.id;
    }

    public void setId(List<Id> id) {
        this.id = id;
    }

    /**
     * ��ȡpatient���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * ����patient���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatient(Patient value) {
        this.patient = value;
    }

    /**
     * ��ȡproviderOrganization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProviderOrganization }
     *     
     */
    public ProviderOrganization getProviderOrganization() {
        return providerOrganization;
    }

    /**
     * ����providerOrganization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderOrganization }
     *     
     */
    public void setProviderOrganization(ProviderOrganization value) {
        this.providerOrganization = value;
    }

    /**
     * ��ȡclassCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * ����classCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

}
