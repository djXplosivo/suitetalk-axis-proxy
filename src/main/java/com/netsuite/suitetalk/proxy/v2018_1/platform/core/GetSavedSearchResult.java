package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetSavedSearchResult implements Serializable {
   private Status status;
   private Integer totalRecords;
   private RecordRefList recordRefList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetSavedSearchResult.class, true);

   public GetSavedSearchResult() {
      super();
   }

   public GetSavedSearchResult(Status status, Integer totalRecords, RecordRefList recordRefList) {
      super();
      this.status = status;
      this.totalRecords = totalRecords;
      this.recordRefList = recordRefList;
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

   public RecordRefList getRecordRefList() {
      return this.recordRefList;
   }

   public void setRecordRefList(RecordRefList recordRefList) {
      this.recordRefList = recordRefList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetSavedSearchResult)) {
         return false;
      } else {
         GetSavedSearchResult other = (GetSavedSearchResult)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.totalRecords == null && other.getTotalRecords() == null || this.totalRecords != null && this.totalRecords.equals(other.getTotalRecords())) && (this.recordRefList == null && other.getRecordRefList() == null || this.recordRefList != null && this.recordRefList.equals(other.getRecordRefList()));
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

         if (this.getRecordRefList() != null) {
            _hashCode += this.getRecordRefList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSavedSearchResult"));
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
      elemField.setFieldName("recordRefList");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "recordRefList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRefList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
