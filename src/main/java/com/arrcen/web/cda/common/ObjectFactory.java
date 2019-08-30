//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2019.06.24 ʱ�� 05:21:55 PM CST 
//


package com.arrcen.web.cda.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.arrcen.web.cda.common package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Value_QNAME = new QName("urn:hl7-org:v3", "value");
    private final static QName _Title_QNAME = new QName("urn:hl7-org:v3", "title");
    private final static QName _Name_QNAME = new QName("urn:hl7-org:v3", "name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.arrcen.web.cda.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssignedPerson }
     * 
     */
    public AssignedPerson createAssignedPerson() {
        return new AssignedPerson();
    }

    /**
     * Create an instance of {@link RecordTarget }
     * 
     */
    public RecordTarget createRecordTarget() {
        return new RecordTarget();
    }

    /**
     * Create an instance of {@link PatientRole }
     * 
     */
    public PatientRole createPatientRole() {
        return new PatientRole();
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link Patient }
     * 
     */
    public Patient createPatient() {
        return new Patient();
    }

    /**
     * Create an instance of {@link AdministrativeGenderCode }
     * 
     */
    public AdministrativeGenderCode createAdministrativeGenderCode() {
        return new AdministrativeGenderCode();
    }

    /**
     * Create an instance of {@link Age }
     * 
     */
    public Age createAge() {
        return new Age();
    }

    /**
     * Create an instance of {@link ProviderOrganization }
     * 
     */
    public ProviderOrganization createProviderOrganization() {
        return new ProviderOrganization();
    }

    /**
     * Create an instance of {@link AsOrganizationPartOf }
     * 
     */
    public AsOrganizationPartOf createAsOrganizationPartOf() {
        return new AsOrganizationPartOf();
    }

    /**
     * Create an instance of {@link WholeOrganization }
     * 
     */
    public WholeOrganization createWholeOrganization() {
        return new WholeOrganization();
    }

    /**
     * Create an instance of {@link Code }
     * 
     */
    public Code createCode() {
        return new Code();
    }

    /**
     * Create an instance of {@link EffectiveTime }
     * 
     */
    public EffectiveTime createEffectiveTime() {
        return new EffectiveTime();
    }

    /**
     * Create an instance of {@link Section }
     * 
     */
    public Section createSection() {
        return new Section();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link Observation }
     * 
     */
    public Observation createObservation() {
        return new Observation();
    }

    /**
     * Create an instance of {@link TValue }
     * 
     */
    public TValue createTValue() {
        return new TValue();
    }

    /**
     * Create an instance of {@link EntryRelationship }
     * 
     */
    public EntryRelationship createEntryRelationship() {
        return new EntryRelationship();
    }

    /**
     * Create an instance of {@link TemplateId }
     * 
     */
    public TemplateId createTemplateId() {
        return new TemplateId();
    }

    /**
     * Create an instance of {@link ConfidentialityCode }
     * 
     */
    public ConfidentialityCode createConfidentialityCode() {
        return new ConfidentialityCode();
    }

    /**
     * Create an instance of {@link ClinicalDocument }
     * 
     */
    public ClinicalDocument createClinicalDocument() {
        return new ClinicalDocument();
    }

    /**
     * Create an instance of {@link RealmCode }
     * 
     */
    public RealmCode createRealmCode() {
        return new RealmCode();
    }

    /**
     * Create an instance of {@link TypeId }
     * 
     */
    public TypeId createTypeId() {
        return new TypeId();
    }

    /**
     * Create an instance of {@link LanguageCode }
     * 
     */
    public LanguageCode createLanguageCode() {
        return new LanguageCode();
    }

    /**
     * Create an instance of {@link SetId }
     * 
     */
    public SetId createSetId() {
        return new SetId();
    }

    /**
     * Create an instance of {@link VersionNumber }
     * 
     */
    public VersionNumber createVersionNumber() {
        return new VersionNumber();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link AssignedAuthor }
     * 
     */
    public AssignedAuthor createAssignedAuthor() {
        return new AssignedAuthor();
    }

    /**
     * Create an instance of {@link Custodian }
     * 
     */
    public Custodian createCustodian() {
        return new Custodian();
    }

    /**
     * Create an instance of {@link AssignedCustodian }
     * 
     */
    public AssignedCustodian createAssignedCustodian() {
        return new AssignedCustodian();
    }

    /**
     * Create an instance of {@link RepresentedCustodianOrganization }
     * 
     */
    public RepresentedCustodianOrganization createRepresentedCustodianOrganization() {
        return new RepresentedCustodianOrganization();
    }

    /**
     * Create an instance of {@link Authenticator }
     * 
     */
    public Authenticator createAuthenticator() {
        return new Authenticator();
    }

    /**
     * Create an instance of {@link SignatureCode }
     * 
     */
    public SignatureCode createSignatureCode() {
        return new SignatureCode();
    }

    /**
     * Create an instance of {@link AssignedEntity }
     * 
     */
    public AssignedEntity createAssignedEntity() {
        return new AssignedEntity();
    }

    /**
     * Create an instance of {@link RelatedDocument }
     * 
     */
    public RelatedDocument createRelatedDocument() {
        return new RelatedDocument();
    }

    /**
     * Create an instance of {@link ParentDocument }
     * 
     */
    public ParentDocument createParentDocument() {
        return new ParentDocument();
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link StructuredBody }
     * 
     */
    public StructuredBody createStructuredBody() {
        return new StructuredBody();
    }

    /**
     * Create an instance of {@link ST }
     * 
     */
    public ST createST() {
        return new ST();
    }

    /**
     * Create an instance of {@link CD }
     * 
     */
    public CD createCD() {
        return new CD();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "value")
    public JAXBElement<TValue> createValue(TValue value) {
        return new JAXBElement<TValue>(_Value_QNAME, TValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:hl7-org:v3", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

}
