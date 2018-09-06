package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaymentMethodVisuals implements Serializable {
   private String flags;
   private String location;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PaymentMethodVisuals.class, true);

   public PaymentMethodVisuals() {
      super();
   }

   public PaymentMethodVisuals(String flags, String location) {
      super();
      this.flags = flags;
      this.location = location;
   }

   public String getFlags() {
      return this.flags;
   }

   public void setFlags(String flags) {
      this.flags = flags;
   }

   public String getLocation() {
      return this.location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PaymentMethodVisuals)) {
         return false;
      } else {
         PaymentMethodVisuals other = (PaymentMethodVisuals)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.flags == null && other.getFlags() == null || this.flags != null && this.flags.equals(other.getFlags())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation()));
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
         if (this.getFlags() != null) {
            _hashCode += this.getFlags().hashCode();
         }

         if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "PaymentMethodVisuals"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("flags");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "flags"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "location"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
