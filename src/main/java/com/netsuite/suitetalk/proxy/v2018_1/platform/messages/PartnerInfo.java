package com.netsuite.suitetalk.proxy.v2018_1.platform.messages;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PartnerInfo implements Serializable {
   private String partnerId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PartnerInfo.class, true);

   public PartnerInfo() {
      super();
   }

   public PartnerInfo(String partnerId) {
      super();
      this.partnerId = partnerId;
   }

   public String getPartnerId() {
      return this.partnerId;
   }

   public void setPartnerId(String partnerId) {
      this.partnerId = partnerId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PartnerInfo)) {
         return false;
      } else {
         PartnerInfo other = (PartnerInfo)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.partnerId == null && other.getPartnerId() == null || this.partnerId != null && this.partnerId.equals(other.getPartnerId());
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
         if (this.getPartnerId() != null) {
            _hashCode += this.getPartnerId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "PartnerInfo"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("partnerId");
      elemField.setXmlName(new QName("urn:messages_2018_1.platform.webservices.netsuite.com", "partnerId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
