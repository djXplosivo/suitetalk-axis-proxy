package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchDateField;
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

public class ItemRevisionSearchBasic extends SearchRecordBasic implements Serializable {
   private SearchDateField effectiveDate;
   private SearchMultiSelectField externalId;
   private SearchStringField externalIdString;
   private SearchMultiSelectField internalId;
   private SearchLongField internalIdNumber;
   private SearchMultiSelectField item;
   private SearchStringField name;
   private SearchDateField obsoleteDate;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ItemRevisionSearchBasic.class, true);

   public ItemRevisionSearchBasic() {
      super();
   }

   public ItemRevisionSearchBasic(SearchDateField effectiveDate, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField item, SearchStringField name, SearchDateField obsoleteDate) {
      super();
      this.effectiveDate = effectiveDate;
      this.externalId = externalId;
      this.externalIdString = externalIdString;
      this.internalId = internalId;
      this.internalIdNumber = internalIdNumber;
      this.item = item;
      this.name = name;
      this.obsoleteDate = obsoleteDate;
   }

   public SearchDateField getEffectiveDate() {
      return this.effectiveDate;
   }

   public void setEffectiveDate(SearchDateField effectiveDate) {
      this.effectiveDate = effectiveDate;
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

   public SearchMultiSelectField getItem() {
      return this.item;
   }

   public void setItem(SearchMultiSelectField item) {
      this.item = item;
   }

   public SearchStringField getName() {
      return this.name;
   }

   public void setName(SearchStringField name) {
      this.name = name;
   }

   public SearchDateField getObsoleteDate() {
      return this.obsoleteDate;
   }

   public void setObsoleteDate(SearchDateField obsoleteDate) {
      this.obsoleteDate = obsoleteDate;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ItemRevisionSearchBasic)) {
         return false;
      } else {
         ItemRevisionSearchBasic other = (ItemRevisionSearchBasic)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.obsoleteDate == null && other.getObsoleteDate() == null || this.obsoleteDate != null && this.obsoleteDate.equals(other.getObsoleteDate()));
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
         if (this.getEffectiveDate() != null) {
            _hashCode += this.getEffectiveDate().hashCode();
         }

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

         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
         }

         if (this.getObsoleteDate() != null) {
            _hashCode += this.getObsoleteDate().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "ItemRevisionSearchBasic"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("effectiveDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "effectiveDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
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
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
      elemField.setFieldName("obsoleteDate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "obsoleteDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
