package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.GetAllRecordType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetAllRecord implements Serializable {
   private GetAllRecordType recordType;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetAllRecord.class, true);

   public GetAllRecord() {
      super();
   }

   public GetAllRecord(GetAllRecordType recordType) {
      super();
      this.recordType = recordType;
   }

   public GetAllRecordType getRecordType() {
      return this.recordType;
   }

   public void setRecordType(GetAllRecordType recordType) {
      this.recordType = recordType;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetAllRecord)) {
         return false;
      } else {
         GetAllRecord other = (GetAllRecord)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.recordType == null && other.getRecordType() == null || this.recordType != null && this.recordType.equals(other.getRecordType());
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
         if (this.getRecordType() != null) {
            _hashCode += this.getRecordType().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetAllRecord"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("recordType");
      attrField.setXmlName(new QName("", "recordType"));
      attrField.setXmlType(new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "GetAllRecordType"));
      typeDesc.addFieldDesc(attrField);
   }
}
