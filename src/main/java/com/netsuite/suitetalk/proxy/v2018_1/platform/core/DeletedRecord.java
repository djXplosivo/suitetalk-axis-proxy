package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class DeletedRecord implements Serializable {
   private Calendar deletedDate;
   private BaseRef record;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(DeletedRecord.class, true);

   public DeletedRecord() {
      super();
   }

   public DeletedRecord(Calendar deletedDate, BaseRef record) {
      super();
      this.deletedDate = deletedDate;
      this.record = record;
   }

   public Calendar getDeletedDate() {
      return this.deletedDate;
   }

   public void setDeletedDate(Calendar deletedDate) {
      this.deletedDate = deletedDate;
   }

   public BaseRef getRecord() {
      return this.record;
   }

   public void setRecord(BaseRef record) {
      this.record = record;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof DeletedRecord)) {
         return false;
      } else {
         DeletedRecord other = (DeletedRecord)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.deletedDate == null && other.getDeletedDate() == null || this.deletedDate != null && this.deletedDate.equals(other.getDeletedDate())) && (this.record == null && other.getRecord() == null || this.record != null && this.record.equals(other.getRecord()));
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

         if (this.getRecord() != null) {
            _hashCode += this.getRecord().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DeletedRecord"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("deletedDate");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "deletedDate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("record");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "record"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
