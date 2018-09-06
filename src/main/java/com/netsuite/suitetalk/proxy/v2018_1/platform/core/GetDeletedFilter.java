package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetDeletedFilter implements Serializable {
   private SearchDateField deletedDate;
   private SearchEnumMultiSelectField type;
   private SearchStringField scriptId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetDeletedFilter.class, true);

   public GetDeletedFilter() {
      super();
   }

   public GetDeletedFilter(SearchDateField deletedDate, SearchEnumMultiSelectField type, SearchStringField scriptId) {
      super();
      this.deletedDate = deletedDate;
      this.type = type;
      this.scriptId = scriptId;
   }

   public SearchDateField getDeletedDate() {
      return this.deletedDate;
   }

   public void setDeletedDate(SearchDateField deletedDate) {
      this.deletedDate = deletedDate;
   }

   public SearchEnumMultiSelectField getType() {
      return this.type;
   }

   public void setType(SearchEnumMultiSelectField type) {
      this.type = type;
   }

   public SearchStringField getScriptId() {
      return this.scriptId;
   }

   public void setScriptId(SearchStringField scriptId) {
      this.scriptId = scriptId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetDeletedFilter)) {
         return false;
      } else {
         GetDeletedFilter other = (GetDeletedFilter)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.deletedDate == null && other.getDeletedDate() == null || this.deletedDate != null && this.deletedDate.equals(other.getDeletedDate())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && this.scriptId.equals(other.getScriptId()));
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
         if (this.getDeletedDate() != null) {
            _hashCode += this.getDeletedDate().hashCode();
         }

         if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
         }

         if (this.getScriptId() != null) {
            _hashCode += this.getScriptId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetDeletedFilter"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("deletedDate");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "deletedDate"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchDateField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("type");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "type"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("scriptId");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "scriptId"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchStringField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
