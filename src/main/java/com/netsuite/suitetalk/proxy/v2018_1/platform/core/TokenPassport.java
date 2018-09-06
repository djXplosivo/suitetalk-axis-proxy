package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class TokenPassport implements Serializable {
   private String account;
   private String consumerKey;
   private String token;
   private String nonce;
   private long timestamp;
   private TokenPassportSignature signature;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(TokenPassport.class, true);

   public TokenPassport() {
      super();
   }

   public TokenPassport(String account, String consumerKey, String token, String nonce, long timestamp, TokenPassportSignature signature) {
      super();
      this.account = account;
      this.consumerKey = consumerKey;
      this.token = token;
      this.nonce = nonce;
      this.timestamp = timestamp;
      this.signature = signature;
   }

   public String getAccount() {
      return this.account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public String getConsumerKey() {
      return this.consumerKey;
   }

   public void setConsumerKey(String consumerKey) {
      this.consumerKey = consumerKey;
   }

   public String getToken() {
      return this.token;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public String getNonce() {
      return this.nonce;
   }

   public void setNonce(String nonce) {
      this.nonce = nonce;
   }

   public long getTimestamp() {
      return this.timestamp;
   }

   public void setTimestamp(long timestamp) {
      this.timestamp = timestamp;
   }

   public TokenPassportSignature getSignature() {
      return this.signature;
   }

   public void setSignature(TokenPassportSignature signature) {
      this.signature = signature;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof TokenPassport)) {
         return false;
      } else {
         TokenPassport other = (TokenPassport)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.consumerKey == null && other.getConsumerKey() == null || this.consumerKey != null && this.consumerKey.equals(other.getConsumerKey())) && (this.token == null && other.getToken() == null || this.token != null && this.token.equals(other.getToken())) && (this.nonce == null && other.getNonce() == null || this.nonce != null && this.nonce.equals(other.getNonce())) && this.timestamp == other.getTimestamp() && (this.signature == null && other.getSignature() == null || this.signature != null && this.signature.equals(other.getSignature()));
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
         if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
         }

         if (this.getConsumerKey() != null) {
            _hashCode += this.getConsumerKey().hashCode();
         }

         if (this.getToken() != null) {
            _hashCode += this.getToken().hashCode();
         }

         if (this.getNonce() != null) {
            _hashCode += this.getNonce().hashCode();
         }

         _hashCode += (new Long(this.getTimestamp())).hashCode();
         if (this.getSignature() != null) {
            _hashCode += this.getSignature().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "TokenPassport"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("account");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "account"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("consumerKey");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "consumerKey"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("token");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "token"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("nonce");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "nonce"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("timestamp");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "timestamp"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("signature");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "signature"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "TokenPassportSignature"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
