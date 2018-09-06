package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SsoCredentials implements Serializable {
   private String email;
   private String password;
   private String account;
   private RecordRef role;
   private String authenticationToken;
   private String partnerId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SsoCredentials.class, true);

   public SsoCredentials() {
      super();
   }

   public SsoCredentials(String email, String password, String account, RecordRef role, String authenticationToken, String partnerId) {
      super();
      this.email = email;
      this.password = password;
      this.account = account;
      this.role = role;
      this.authenticationToken = authenticationToken;
      this.partnerId = partnerId;
   }

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return this.password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getAccount() {
      return this.account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public RecordRef getRole() {
      return this.role;
   }

   public void setRole(RecordRef role) {
      this.role = role;
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

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SsoCredentials)) {
         return false;
      } else {
         SsoCredentials other = (SsoCredentials)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.password == null && other.getPassword() == null || this.password != null && this.password.equals(other.getPassword())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.role == null && other.getRole() == null || this.role != null && this.role.equals(other.getRole())) && (this.authenticationToken == null && other.getAuthenticationToken() == null || this.authenticationToken != null && this.authenticationToken.equals(other.getAuthenticationToken())) && (this.partnerId == null && other.getPartnerId() == null || this.partnerId != null && this.partnerId.equals(other.getPartnerId()));
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
         if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
         }

         if (this.getPassword() != null) {
            _hashCode += this.getPassword().hashCode();
         }

         if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
         }

         if (this.getRole() != null) {
            _hashCode += this.getRole().hashCode();
         }

         if (this.getAuthenticationToken() != null) {
            _hashCode += this.getAuthenticationToken().hashCode();
         }

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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SsoCredentials"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("email");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "email"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("password");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "password"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("account");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "account"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("role");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "role"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
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
   }
}
