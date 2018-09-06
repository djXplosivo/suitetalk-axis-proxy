package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Status implements Serializable {
   private StatusDetail[] statusDetail;
   private boolean isSuccess;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(Status.class, true);

   public Status() {
      super();
   }

   public Status(StatusDetail[] statusDetail, boolean isSuccess) {
      super();
      this.statusDetail = statusDetail;
      this.isSuccess = isSuccess;
   }

   public StatusDetail[] getStatusDetail() {
      return this.statusDetail;
   }

   public void setStatusDetail(StatusDetail[] statusDetail) {
      this.statusDetail = statusDetail;
   }

   public StatusDetail getStatusDetail(int i) {
      return this.statusDetail[i];
   }

   public void setStatusDetail(int i, StatusDetail _value) {
      this.statusDetail[i] = _value;
   }

   public boolean isIsSuccess() {
      return this.isSuccess;
   }

   public void setIsSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof Status)) {
         return false;
      } else {
         Status other = (Status)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.statusDetail == null && other.getStatusDetail() == null || this.statusDetail != null && Arrays.equals(this.statusDetail, other.getStatusDetail())) && this.isSuccess == other.isIsSuccess();
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
         if (this.getStatusDetail() != null) {
            for(int i = 0; i < Array.getLength(this.getStatusDetail()); ++i) {
               Object obj = Array.get(this.getStatusDetail(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         _hashCode += (this.isIsSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Status"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("isSuccess");
      attrField.setXmlName(new QName("", "isSuccess"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("statusDetail");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "statusDetail"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "StatusDetail"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
