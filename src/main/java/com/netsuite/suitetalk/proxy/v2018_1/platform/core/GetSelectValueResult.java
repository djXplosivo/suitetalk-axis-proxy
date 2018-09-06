package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetSelectValueResult implements Serializable {
   private Status status;
   private Integer totalRecords;
   private Integer totalPages;
   private BaseRefList baseRefList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetSelectValueResult.class, true);

   public GetSelectValueResult() {
      super();
   }

   public GetSelectValueResult(Status status, Integer totalRecords, Integer totalPages, BaseRefList baseRefList) {
      super();
      this.status = status;
      this.totalRecords = totalRecords;
      this.totalPages = totalPages;
      this.baseRefList = baseRefList;
   }

   public Status getStatus() {
      return this.status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }

   public Integer getTotalRecords() {
      return this.totalRecords;
   }

   public void setTotalRecords(Integer totalRecords) {
      this.totalRecords = totalRecords;
   }

   public Integer getTotalPages() {
      return this.totalPages;
   }

   public void setTotalPages(Integer totalPages) {
      this.totalPages = totalPages;
   }

   public BaseRefList getBaseRefList() {
      return this.baseRefList;
   }

   public void setBaseRefList(BaseRefList baseRefList) {
      this.baseRefList = baseRefList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetSelectValueResult)) {
         return false;
      } else {
         GetSelectValueResult other = (GetSelectValueResult)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.totalRecords == null && other.getTotalRecords() == null || this.totalRecords != null && this.totalRecords.equals(other.getTotalRecords())) && (this.totalPages == null && other.getTotalPages() == null || this.totalPages != null && this.totalPages.equals(other.getTotalPages())) && (this.baseRefList == null && other.getBaseRefList() == null || this.baseRefList != null && this.baseRefList.equals(other.getBaseRefList()));
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
         if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
         }

         if (this.getTotalRecords() != null) {
            _hashCode += this.getTotalRecords().hashCode();
         }

         if (this.getTotalPages() != null) {
            _hashCode += this.getTotalPages().hashCode();
         }

         if (this.getBaseRefList() != null) {
            _hashCode += this.getBaseRefList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectValueResult"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("status");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "status"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Status"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("totalRecords");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "totalRecords"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("totalPages");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "totalPages"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("baseRefList");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "baseRefList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRefList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
