package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRefList;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaymentItem extends Record implements Serializable {
   private Calendar createdDate;
   private Calendar lastModifiedDate;
   private String description;
   private RecordRef paymentMethod;
   private Boolean undepFunds;
   private Boolean includeChildren;
   private RecordRef issueProduct;
   private RecordRef account;
   private RecordRef customForm;
   private String itemId;
   private String displayName;
   private Boolean isInactive;
   private Boolean availableToPartners;
   private RecordRef department;
   private RecordRef _class;
   private RecordRef location;
   private RecordRefList subsidiaryList;
   private TranslationList translationsList;
   private CustomFieldList customFieldList;
   private String internalId;
   private String externalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PaymentItem.class, true);

   public PaymentItem() {
      super();
   }

   public PaymentItem(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, String description, RecordRef paymentMethod, Boolean undepFunds, Boolean includeChildren, RecordRef issueProduct, RecordRef account, RecordRef customForm, String itemId, String displayName, Boolean isInactive, Boolean availableToPartners, RecordRef department, RecordRef _class, RecordRef location, RecordRefList subsidiaryList, TranslationList translationsList, CustomFieldList customFieldList) {
      super(nullFieldList);
      this.internalId = internalId;
      this.externalId = externalId;
      this.createdDate = createdDate;
      this.lastModifiedDate = lastModifiedDate;
      this.description = description;
      this.paymentMethod = paymentMethod;
      this.undepFunds = undepFunds;
      this.includeChildren = includeChildren;
      this.issueProduct = issueProduct;
      this.account = account;
      this.customForm = customForm;
      this.itemId = itemId;
      this.displayName = displayName;
      this.isInactive = isInactive;
      this.availableToPartners = availableToPartners;
      this.department = department;
      this._class = _class;
      this.location = location;
      this.subsidiaryList = subsidiaryList;
      this.translationsList = translationsList;
      this.customFieldList = customFieldList;
   }

   public Calendar getCreatedDate() {
      return this.createdDate;
   }

   public void setCreatedDate(Calendar createdDate) {
      this.createdDate = createdDate;
   }

   public Calendar getLastModifiedDate() {
      return this.lastModifiedDate;
   }

   public void setLastModifiedDate(Calendar lastModifiedDate) {
      this.lastModifiedDate = lastModifiedDate;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public RecordRef getPaymentMethod() {
      return this.paymentMethod;
   }

   public void setPaymentMethod(RecordRef paymentMethod) {
      this.paymentMethod = paymentMethod;
   }

   public Boolean getUndepFunds() {
      return this.undepFunds;
   }

   public void setUndepFunds(Boolean undepFunds) {
      this.undepFunds = undepFunds;
   }

   public Boolean getIncludeChildren() {
      return this.includeChildren;
   }

   public void setIncludeChildren(Boolean includeChildren) {
      this.includeChildren = includeChildren;
   }

   public RecordRef getIssueProduct() {
      return this.issueProduct;
   }

   public void setIssueProduct(RecordRef issueProduct) {
      this.issueProduct = issueProduct;
   }

   public RecordRef getAccount() {
      return this.account;
   }

   public void setAccount(RecordRef account) {
      this.account = account;
   }

   public RecordRef getCustomForm() {
      return this.customForm;
   }

   public void setCustomForm(RecordRef customForm) {
      this.customForm = customForm;
   }

   public String getItemId() {
      return this.itemId;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public String getDisplayName() {
      return this.displayName;
   }

   public void setDisplayName(String displayName) {
      this.displayName = displayName;
   }

   public Boolean getIsInactive() {
      return this.isInactive;
   }

   public void setIsInactive(Boolean isInactive) {
      this.isInactive = isInactive;
   }

   public Boolean getAvailableToPartners() {
      return this.availableToPartners;
   }

   public void setAvailableToPartners(Boolean availableToPartners) {
      this.availableToPartners = availableToPartners;
   }

   public RecordRef getDepartment() {
      return this.department;
   }

   public void setDepartment(RecordRef department) {
      this.department = department;
   }

   public RecordRef get_class() {
      return this._class;
   }

   public void set_class(RecordRef _class) {
      this._class = _class;
   }

   public RecordRef getLocation() {
      return this.location;
   }

   public void setLocation(RecordRef location) {
      this.location = location;
   }

   public RecordRefList getSubsidiaryList() {
      return this.subsidiaryList;
   }

   public void setSubsidiaryList(RecordRefList subsidiaryList) {
      this.subsidiaryList = subsidiaryList;
   }

   public TranslationList getTranslationsList() {
      return this.translationsList;
   }

   public void setTranslationsList(TranslationList translationsList) {
      this.translationsList = translationsList;
   }

   public CustomFieldList getCustomFieldList() {
      return this.customFieldList;
   }

   public void setCustomFieldList(CustomFieldList customFieldList) {
      this.customFieldList = customFieldList;
   }

   public String getInternalId() {
      return this.internalId;
   }

   public void setInternalId(String internalId) {
      this.internalId = internalId;
   }

   public String getExternalId() {
      return this.externalId;
   }

   public void setExternalId(String externalId) {
      this.externalId = externalId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PaymentItem)) {
         return false;
      } else {
         PaymentItem other = (PaymentItem)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.undepFunds == null && other.getUndepFunds() == null || this.undepFunds != null && this.undepFunds.equals(other.getUndepFunds())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && this.issueProduct.equals(other.getIssueProduct())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && this.availableToPartners.equals(other.getAvailableToPartners())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
            this.__equalsCalc = null;
            return _equals;
         }
      }
   }

   public synchronized int hashCode() {
      if (this.__hashCodeCalc) {
         return 0;
      } else {
         this.__hashCodeCalc = true;
         int _hashCode = super.hashCode();
         if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
         }

         if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
         }

         if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
         }

         if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
         }

         if (this.getUndepFunds() != null) {
            _hashCode += this.getUndepFunds().hashCode();
         }

         if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
         }

         if (this.getIssueProduct() != null) {
            _hashCode += this.getIssueProduct().hashCode();
         }

         if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
         }

         if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
         }

         if (this.getItemId() != null) {
            _hashCode += this.getItemId().hashCode();
         }

         if (this.getDisplayName() != null) {
            _hashCode += this.getDisplayName().hashCode();
         }

         if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
         }

         if (this.getAvailableToPartners() != null) {
            _hashCode += this.getAvailableToPartners().hashCode();
         }

         if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
         }

         if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
         }

         if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
         }

         if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
         }

         if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
         }

         if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
         }

         this.__hashCodeCalc = false;
         return _hashCode;
      }
   }

   public static TypeDesc getTypeDesc() {
      return typeDesc;
   }

   public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
      return new BeanSerializer(_javaType, _xmlType, typeDesc);
   }

   public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
      return new BeanDeserializer(_javaType, _xmlType, typeDesc);
   }

   static {
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PaymentItem"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("internalId");
      attrField.setXmlName(new QName("", "internalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      attrField = new AttributeDesc();
      attrField.setFieldName("externalId");
      attrField.setXmlName(new QName("", "externalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("createdDate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "createdDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("lastModifiedDate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "lastModifiedDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("description");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "description"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("paymentMethod");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "paymentMethod"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("undepFunds");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "undepFunds"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("includeChildren");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "includeChildren"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("issueProduct");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "issueProduct"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("account");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "account"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customForm");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "customForm"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("itemId");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "itemId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("displayName");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "displayName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isInactive");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "isInactive"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("availableToPartners");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "availableToPartners"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("department");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "department"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("_class");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "class"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "location"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subsidiaryList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "subsidiaryList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRefList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("translationsList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "translationsList"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "TranslationList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
