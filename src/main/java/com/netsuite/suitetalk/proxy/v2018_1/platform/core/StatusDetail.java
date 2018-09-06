package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import com.netsuite.suitetalk.proxy.v2018_1.platform.faults.types.StatusDetailCodeType;
import com.netsuite.suitetalk.proxy.v2018_1.platform.faults.types.StatusDetailType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class StatusDetail implements Serializable {
   private StatusDetailCodeType code;
   private String message;
   private StatusDetailType type;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(StatusDetail.class, true);

   public StatusDetail() {
      super();
   }

   public StatusDetail(StatusDetailCodeType code, String message, StatusDetailType type) {
      super();
      this.code = code;
      this.message = message;
      this.type = type;
   }

   public StatusDetailCodeType getCode() {
      return this.code;
   }

   public void setCode(StatusDetailCodeType code) {
      this.code = code;
   }

   public String getMessage() {
      return this.message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public StatusDetailType getType() {
      return this.type;
   }

   public void setType(StatusDetailType type) {
      this.type = type;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof StatusDetail)) {
         return false;
      } else {
         StatusDetail other = (StatusDetail)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.code == null && other.getCode() == null || this.code != null && this.code.equals(other.getCode())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType()));
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
         if (this.getCode() != null) {
            _hashCode += this.getCode().hashCode();
         }

         if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
         }

         if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "StatusDetail"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("type");
      attrField.setXmlName(new QName("", "type"));
      attrField.setXmlType(new QName("urn:types.faults_2018_1.platform.webservices.netsuite.com", "StatusDetailType"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("code");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "code"));
      elemField.setXmlType(new QName("urn:types.faults_2018_1.platform.webservices.netsuite.com", "StatusDetailCodeType"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("message");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "message"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
