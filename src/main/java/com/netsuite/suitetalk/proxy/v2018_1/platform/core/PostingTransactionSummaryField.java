package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PostingTransactionSummaryField implements Serializable {
   private Boolean period;
   private Boolean account;
   private Boolean parentItem;
   private Boolean item;
   private Boolean entity;
   private Boolean department;
   private Boolean _class;
   private Boolean location;
   private Boolean subsidiary;
   private Boolean book;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PostingTransactionSummaryField.class, true);

   public PostingTransactionSummaryField() {
      super();
   }

   public PostingTransactionSummaryField(Boolean period, Boolean account, Boolean parentItem, Boolean item, Boolean entity, Boolean department, Boolean _class, Boolean location, Boolean subsidiary, Boolean book) {
      super();
      this.period = period;
      this.account = account;
      this.parentItem = parentItem;
      this.item = item;
      this.entity = entity;
      this.department = department;
      this._class = _class;
      this.location = location;
      this.subsidiary = subsidiary;
      this.book = book;
   }

   public Boolean getPeriod() {
      return this.period;
   }

   public void setPeriod(Boolean period) {
      this.period = period;
   }

   public Boolean getAccount() {
      return this.account;
   }

   public void setAccount(Boolean account) {
      this.account = account;
   }

   public Boolean getParentItem() {
      return this.parentItem;
   }

   public void setParentItem(Boolean parentItem) {
      this.parentItem = parentItem;
   }

   public Boolean getItem() {
      return this.item;
   }

   public void setItem(Boolean item) {
      this.item = item;
   }

   public Boolean getEntity() {
      return this.entity;
   }

   public void setEntity(Boolean entity) {
      this.entity = entity;
   }

   public Boolean getDepartment() {
      return this.department;
   }

   public void setDepartment(Boolean department) {
      this.department = department;
   }

   public Boolean get_class() {
      return this._class;
   }

   public void set_class(Boolean _class) {
      this._class = _class;
   }

   public Boolean getLocation() {
      return this.location;
   }

   public void setLocation(Boolean location) {
      this.location = location;
   }

   public Boolean getSubsidiary() {
      return this.subsidiary;
   }

   public void setSubsidiary(Boolean subsidiary) {
      this.subsidiary = subsidiary;
   }

   public Boolean getBook() {
      return this.book;
   }

   public void setBook(Boolean book) {
      this.book = book;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PostingTransactionSummaryField)) {
         return false;
      } else {
         PostingTransactionSummaryField other = (PostingTransactionSummaryField)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.period == null && other.getPeriod() == null || this.period != null && this.period.equals(other.getPeriod())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.parentItem == null && other.getParentItem() == null || this.parentItem != null && this.parentItem.equals(other.getParentItem())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.book == null && other.getBook() == null || this.book != null && this.book.equals(other.getBook()));
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
         int _hashCode = 1;
         if (this.getPeriod() != null) {
            _hashCode += this.getPeriod().hashCode();
         }

         if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
         }

         if (this.getParentItem() != null) {
            _hashCode += this.getParentItem().hashCode();
         }

         if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
         }

         if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
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

         if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
         }

         if (this.getBook() != null) {
            _hashCode += this.getBook().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "PostingTransactionSummaryField"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("period");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "period"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("account");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "account"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("parentItem");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "parentItem"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("item");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "item"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("entity");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "entity"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("department");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "department"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("_class");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "class"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "location"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("subsidiary");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "subsidiary"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("book");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "book"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
