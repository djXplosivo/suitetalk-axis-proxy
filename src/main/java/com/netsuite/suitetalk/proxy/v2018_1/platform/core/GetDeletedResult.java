package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetDeletedResult implements Serializable {
   private Status status;
   private Integer totalRecords;
   private Integer pageSize;
   private Integer totalPages;
   private Integer pageIndex;
   private DeletedRecordList deletedRecordList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetDeletedResult.class, true);

   public GetDeletedResult() {
      super();
   }

   public GetDeletedResult(Status status, Integer totalRecords, Integer pageSize, Integer totalPages, Integer pageIndex, DeletedRecordList deletedRecordList) {
      super();
      this.status = status;
      this.totalRecords = totalRecords;
      this.pageSize = pageSize;
      this.totalPages = totalPages;
      this.pageIndex = pageIndex;
      this.deletedRecordList = deletedRecordList;
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

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getTotalPages() {
      return this.totalPages;
   }

   public void setTotalPages(Integer totalPages) {
      this.totalPages = totalPages;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public DeletedRecordList getDeletedRecordList() {
      return this.deletedRecordList;
   }

   public void setDeletedRecordList(DeletedRecordList deletedRecordList) {
      this.deletedRecordList = deletedRecordList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetDeletedResult)) {
         return false;
      } else {
         GetDeletedResult other = (GetDeletedResult)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.totalRecords == null && other.getTotalRecords() == null || this.totalRecords != null && this.totalRecords.equals(other.getTotalRecords())) && (this.pageSize == null && other.getPageSize() == null || this.pageSize != null && this.pageSize.equals(other.getPageSize())) && (this.totalPages == null && other.getTotalPages() == null || this.totalPages != null && this.totalPages.equals(other.getTotalPages())) && (this.pageIndex == null && other.getPageIndex() == null || this.pageIndex != null && this.pageIndex.equals(other.getPageIndex())) && (this.deletedRecordList == null && other.getDeletedRecordList() == null || this.deletedRecordList != null && this.deletedRecordList.equals(other.getDeletedRecordList()));
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

         if (this.getPageSize() != null) {
            _hashCode += this.getPageSize().hashCode();
         }

         if (this.getTotalPages() != null) {
            _hashCode += this.getTotalPages().hashCode();
         }

         if (this.getPageIndex() != null) {
            _hashCode += this.getPageIndex().hashCode();
         }

         if (this.getDeletedRecordList() != null) {
            _hashCode += this.getDeletedRecordList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetDeletedResult"));
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
      elemField.setFieldName("pageSize");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "pageSize"));
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
      elemField.setFieldName("pageIndex");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "pageIndex"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("deletedRecordList");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "deletedRecordList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DeletedRecordList"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
