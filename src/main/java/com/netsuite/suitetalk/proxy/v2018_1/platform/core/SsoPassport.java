package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SsoPassport implements Serializable {
   private String authenticationToken;
   private String partnerId;
   private String partnerAccount;
   private String partnerUserId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SsoPassport.class, true);

   public SsoPassport() {
      super();
   }

   public SsoPassport(String authenticationToken, String partnerId, String partnerAccount, String partnerUserId) {
      super();
      this.authenticationToken = authenticationToken;
      this.partnerId = partnerId;
      this.partnerAccount = partnerAccount;
      this.partnerUserId = partnerUserId;
   }

   public String getAuthenticationToken() {
      return this.authenticationToken;
   }

   public void setAuthenticationToken(String authenticationToken) {
      this.authenticationToken = authenticationToken;
   }

   public String getPartnerId() {
      return this.partnerId;
   }

   public void setPartnerId(String partnerId) {
      this.partnerId = partnerId;
   }

   public String getPartnerAccount() {
      return this.partnerAccount;
   }

   public void setPartnerAccount(String partnerAccount) {
      this.partnerAccount = partnerAccount;
   }

   public String getPartnerUserId() {
      return this.partnerUserId;
   }

   public void setPartnerUserId(String partnerUserId) {
      this.partnerUserId = partnerUserId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SsoPassport)) {
         return false;
      } else {
         SsoPassport other = (SsoPassport)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.authenticationToken == null && other.getAuthenticationToken() == null || this.authenticationToken != null && this.authenticationToken.equals(other.getAuthenticationToken())) && (this.partnerId == null && other.getPartnerId() == null || this.partnerId != null && this.partnerId.equals(other.getPartnerId())) && (this.partnerAccount == null && other.getPartnerAccount() == null || this.partnerAccount != null && this.partnerAccount.equals(other.getPartnerAccount())) && (this.partnerUserId == null && other.getPartnerUserId() == null || this.partnerUserId != null && this.partnerUserId.equals(other.getPartnerUserId()));
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
         if (this.getAuthenticationToken() != null) {
            _hashCode += this.getAuthenticationToken().hashCode();
         }

         if (this.getPartnerId() != null) {
            _hashCode += this.getPartnerId().hashCode();
         }

         if (this.getPartnerAccount() != null) {
            _hashCode += this.getPartnerAccount().hashCode();
         }

         if (this.getPartnerUserId() != null) {
            _hashCode += this.getPartnerUserId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SsoPassport"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("authenticationToken");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "authenticationToken"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("partnerId");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "partnerId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("partnerAccount");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "partnerAccount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("partnerUserId");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "partnerUserId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
