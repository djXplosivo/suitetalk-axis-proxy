package com.netsuite.suitetalk.proxy.v2018_1.lists.marketing;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PromotionCodeCurrency implements Serializable {
   private RecordRef currency;
   private Double minimumOrderAmount;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PromotionCodeCurrency.class, true);

   public PromotionCodeCurrency() {
      super();
   }

   public PromotionCodeCurrency(RecordRef currency, Double minimumOrderAmount) {
      super();
      this.currency = currency;
      this.minimumOrderAmount = minimumOrderAmount;
   }

   public RecordRef getCurrency() {
      return this.currency;
   }

   public void setCurrency(RecordRef currency) {
      this.currency = currency;
   }

   public Double getMinimumOrderAmount() {
      return this.minimumOrderAmount;
   }

   public void setMinimumOrderAmount(Double minimumOrderAmount) {
      this.minimumOrderAmount = minimumOrderAmount;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PromotionCodeCurrency)) {
         return false;
      } else {
         PromotionCodeCurrency other = (PromotionCodeCurrency)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.minimumOrderAmount == null && other.getMinimumOrderAmount() == null || this.minimumOrderAmount != null && this.minimumOrderAmount.equals(other.getMinimumOrderAmount()));
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
         if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
         }

         if (this.getMinimumOrderAmount() != null) {
            _hashCode += this.getMinimumOrderAmount().hashCode();
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
      typeDesc.setXmlType(new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodeCurrency"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("currency");
      elemField.setXmlName(new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "currency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("minimumOrderAmount");
      elemField.setXmlName(new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "minimumOrderAmount"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
