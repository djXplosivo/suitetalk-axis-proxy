package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ManufacturingCostTemplateSearchBasic extends SearchRecordBasic implements Serializable {
   private SearchMultiSelectField externalId;
   private SearchStringField externalIdString;
   private SearchMultiSelectField internalId;
   private SearchLongField internalIdNumber;
   private SearchBooleanField isInactive;
   private SearchMultiSelectField item;
   private SearchStringField memo;
   private SearchStringField name;
   private SearchMultiSelectField subsidiary;
   private SearchCustomFieldList customFieldList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ManufacturingCostTemplateSearchBasic.class, true);

   public ManufacturingCostTemplateSearchBasic() {
      super();
   }

   public ManufacturingCostTemplateSearchBasic(SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInactive, SearchMultiSelectField item, SearchStringField memo, SearchStringField name, SearchMultiSelectField subsidiary, SearchCustomFieldList customFieldList) {
      super();
      this.externalId = externalId;
      this.externalIdString = externalIdString;
      this.internalId = internalId;
      this.internalIdNumber = internalIdNumber;
      this.isInactive = isInactive;
      this.item = item;
      this.memo = memo;
      this.name = name;
      this.subsidiary = subsidiary;
      this.customFieldList = customFieldList;
   }

   public SearchMultiSelectField getExternalId() {
      return this.externalId;
   }

   public void setExternalId(SearchMultiSelectField externalId) {
      this.externalId = externalId;
   }

   public SearchStringField getExternalIdString() {
      return this.externalIdString;
   }

   public void setExternalIdString(SearchStringField externalIdString) {
      this.externalIdString = externalIdString;
   }

   public SearchMultiSelectField getInternalId() {
      return this.internalId;
   }

   public void setInternalId(SearchMultiSelectField internalId) {
      this.internalId = internalId;
   }

   public SearchLongField getInternalIdNumber() {
      return this.internalIdNumber;
   }

   public void setInternalIdNumber(SearchLongField internalIdNumber) {
      this.internalIdNumber = internalIdNumber;
   }

   public SearchBooleanField getIsInactive() {
      return this.isInactive;
   }

   public void setIsInactive(SearchBooleanField isInactive) {
      this.isInactive = isInactive;
   }

   public SearchMultiSelectField getItem() {
      return this.item;
   }

   public void setItem(SearchMultiSelectField item) {
      this.item = item;
   }

   public SearchStringField getMemo() {
      return this.memo;
   }

   public void setMemo(SearchStringField memo) {
      this.memo = memo;
   }

   public SearchStringField getName() {
      return this.name;
   }

   public void setName(SearchStringField name) {
      this.name = name;
   }

   public SearchMultiSelectField getSubsidiary() {
      return this.subsidiary;
   }

   public void setSubsidiary(SearchMultiSelectField subsidiary) {
      this.subsidiary = subsidiary;
   }

   public SearchCustomFieldList getCustomFieldList() {
      return this.customFieldList;
   }

   public void setCustomFieldList(SearchCustomFieldList customFieldList) {
      this.customFieldList = customFieldList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ManufacturingCostTemplateSearchBasic)) {
         return false;
      } else {
         ManufacturingCostTemplateSearchBasic other = (ManufacturingCostTemplateSearchBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
         if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
         }

         if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
         }

         if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
         }

         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
         }

         if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
         }

         if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
         }

         if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ManufacturingCostTemplateSearchBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("externalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "externalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("externalIdString");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "externalIdString"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalId");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("internalIdNumber");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "internalIdNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchLongField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("isInactive");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "isInactive"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchBooleanField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("memo");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "memo"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("name");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "name"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subsidiary");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "subsidiary"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("customFieldList");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "customFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}