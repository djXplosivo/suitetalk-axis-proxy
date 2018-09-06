package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GiftCertRedemption implements Serializable {
   private RecordRef authCode;
   private Double authCodeApplied;
   private Double authCodeAmtRemaining;
   private Double giftCertAvailable;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GiftCertRedemption.class, true);

   public GiftCertRedemption() {
      super();
   }

   public GiftCertRedemption(RecordRef authCode, Double authCodeApplied, Double authCodeAmtRemaining, Double giftCertAvailable) {
      super();
      this.authCode = authCode;
      this.authCodeApplied = authCodeApplied;
      this.authCodeAmtRemaining = authCodeAmtRemaining;
      this.giftCertAvailable = giftCertAvailable;
   }

   public RecordRef getAuthCode() {
      return this.authCode;
   }

   public void setAuthCode(RecordRef authCode) {
      this.authCode = authCode;
   }

   public Double getAuthCodeApplied() {
      return this.authCodeApplied;
   }

   public void setAuthCodeApplied(Double authCodeApplied) {
      this.authCodeApplied = authCodeApplied;
   }

   public Double getAuthCodeAmtRemaining() {
      return this.authCodeAmtRemaining;
   }

   public void setAuthCodeAmtRemaining(Double authCodeAmtRemaining) {
      this.authCodeAmtRemaining = authCodeAmtRemaining;
   }

   public Double getGiftCertAvailable() {
      return this.giftCertAvailable;
   }

   public void setGiftCertAvailable(Double giftCertAvailable) {
      this.giftCertAvailable = giftCertAvailable;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GiftCertRedemption)) {
         return false;
      } else {
         GiftCertRedemption other = (GiftCertRedemption)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.authCode == null && other.getAuthCode() == null || this.authCode != null && this.authCode.equals(other.getAuthCode())) && (this.authCodeApplied == null && other.getAuthCodeApplied() == null || this.authCodeApplied != null && this.authCodeApplied.equals(other.getAuthCodeApplied())) && (this.authCodeAmtRemaining == null && other.getAuthCodeAmtRemaining() == null || this.authCodeAmtRemaining != null && this.authCodeAmtRemaining.equals(other.getAuthCodeAmtRemaining())) && (this.giftCertAvailable == null && other.getGiftCertAvailable() == null || this.giftCertAvailable != null && this.giftCertAvailable.equals(other.getGiftCertAvailable()));
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

         if (this.getAuthCodeApplied() != null) {
            _hashCode += this.getAuthCodeApplied().hashCode();
         }

         if (this.getAuthCodeAmtRemaining() != null) {
            _hashCode += this.getAuthCodeAmtRemaining().hashCode();
         }

         if (this.getGiftCertAvailable() != null) {
            _hashCode += this.getGiftCertAvailable().hashCode();
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "GiftCertRedemption"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("authCode");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "authCode"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("authCodeApplied");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "authCodeApplied"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("authCodeAmtRemaining");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "authCodeAmtRemaining"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("giftCertAvailable");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "giftCertAvailable"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
