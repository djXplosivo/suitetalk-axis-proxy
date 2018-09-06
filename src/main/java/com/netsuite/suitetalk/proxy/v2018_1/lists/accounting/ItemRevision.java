package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
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

public class ItemRevision extends Record implements Serializable {
   private RecordRef item;
   private String name;
   private Calendar effectiveDate;
   private Calendar obsoleteDate;
   private String memo;
   private Boolean inactive;
   private String internalId;
   private String externalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ItemRevision.class, true);

   public ItemRevision() {
      super();
   }

   public ItemRevision(NullField nullFieldList, String internalId, String externalId, RecordRef item, String name, Calendar effectiveDate, Calendar obsoleteDate, String memo, Boolean inactive) {
      super(nullFieldList);
      this.internalId = internalId;
      this.externalId = externalId;
      this.item = item;
      this.name = name;
      this.effectiveDate = effectiveDate;
      this.obsoleteDate = obsoleteDate;
      this.memo = memo;
      this.inactive = inactive;
   }

   public RecordRef getItem() {
      return this.item;
   }

   public void setItem(RecordRef item) {
      this.item = item;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Calendar getEffectiveDate() {
      return this.effectiveDate;
   }

   public void setEffectiveDate(Calendar effectiveDate) {
      this.effectiveDate = effectiveDate;
   }

   public Calendar getObsoleteDate() {
      return this.obsoleteDate;
   }

   public void setObsoleteDate(Calendar obsoleteDate) {
      this.obsoleteDate = obsoleteDate;
   }

   public String getMemo() {
      return this.memo;
   }

   public void setMemo(String memo) {
      this.memo = memo;
   }

   public Boolean getInactive() {
      return this.inactive;
   }

   public void setInactive(Boolean inactive) {
      this.inactive = inactive;
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
      if (!(obj instanceof ItemRevision)) {
         return false;
      } else {
         ItemRevision other = (ItemRevision)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate())) && (this.obsoleteDate == null && other.getObsoleteDate() == null || this.obsoleteDate != null && this.obsoleteDate.equals(other.getObsoleteDate())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.inactive == null && other.getInactive() == null || this.inactive != null && this.inactive.equals(other.getInactive())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
         }

         if (this.getEffectiveDate() != null) {
            _hashCode += this.getEffectiveDate().hashCode();
         }

         if (this.getObsoleteDate() != null) {
            _hashCode += this.getObsoleteDate().hashCode();
         }

         if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
         }

         if (this.getInactive() != null) {
            _hashCode += this.getInactive().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemRevision"));
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
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("name");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "name"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("effectiveDate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "effectiveDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("obsoleteDate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "obsoleteDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("memo");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "memo"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("inactive");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "inactive"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
