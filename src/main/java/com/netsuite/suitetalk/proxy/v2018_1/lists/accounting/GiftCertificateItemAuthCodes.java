package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GiftCertificateItemAuthCodes implements Serializable {
   private String authCode;
   private Boolean used;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GiftCertificateItemAuthCodes.class, true);

   public GiftCertificateItemAuthCodes() {
      super();
   }

   public GiftCertificateItemAuthCodes(String authCode, Boolean used) {
      super();
      this.authCode = authCode;
      this.used = used;
   }

   public String getAuthCode() {
      return this.authCode;
   }

   public void setAuthCode(String authCode) {
      this.authCode = authCode;
   }

   public Boolean getUsed() {
      return this.used;
   }

   public void setUsed(Boolean used) {
      this.used = used;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GiftCertificateItemAuthCodes)) {
         return false;
      } else {
         GiftCertificateItemAuthCodes other = (GiftCertificateItemAuthCodes)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.authCode == null && other.getAuthCode() == null || this.authCode != null && this.authCode.equals(other.getAuthCode())) && (this.used == null && other.getUsed() == null || this.used != null && this.used.equals(other.getUsed()));
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
         if (this.getAuthCode() != null) {
            _hashCode += this.getAuthCode().hashCode();
         }

         if (this.getUsed() != null) {
            _hashCode += this.getUsed().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "GiftCertificateItemAuthCodes"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("authCode");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "authCode"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("used");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "used"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
