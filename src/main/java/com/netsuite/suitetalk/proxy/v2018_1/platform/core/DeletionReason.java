package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class DeletionReason implements Serializable {
   private RecordRef deletionReasonCode;
   private String deletionReasonMemo;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(DeletionReason.class, true);

   public DeletionReason() {
      super();
   }

   public DeletionReason(RecordRef deletionReasonCode, String deletionReasonMemo) {
      super();
      this.deletionReasonCode = deletionReasonCode;
      this.deletionReasonMemo = deletionReasonMemo;
   }

   public RecordRef getDeletionReasonCode() {
      return this.deletionReasonCode;
   }

   public void setDeletionReasonCode(RecordRef deletionReasonCode) {
      this.deletionReasonCode = deletionReasonCode;
   }

   public String getDeletionReasonMemo() {
      return this.deletionReasonMemo;
   }

   public void setDeletionReasonMemo(String deletionReasonMemo) {
      this.deletionReasonMemo = deletionReasonMemo;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof DeletionReason)) {
         return false;
      } else {
         DeletionReason other = (DeletionReason)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.deletionReasonCode == null && other.getDeletionReasonCode() == null || this.deletionReasonCode != null && this.deletionReasonCode.equals(other.getDeletionReasonCode())) && (this.deletionReasonMemo == null && other.getDeletionReasonMemo() == null || this.deletionReasonMemo != null && this.deletionReasonMemo.equals(other.getDeletionReasonMemo()));
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
         if (this.getDeletionReasonCode() != null) {
            _hashCode += this.getDeletionReasonCode().hashCode();
         }

         if (this.getDeletionReasonMemo() != null) {
            _hashCode += this.getDeletionReasonMemo().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DeletionReason"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("deletionReasonCode");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "deletionReasonCode"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("deletionReasonMemo");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "deletionReasonMemo"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
