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

public class Promotions implements Serializable {
   private RecordRef promoCode;
   private RecordRef couponCode;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(Promotions.class, true);

   public Promotions() {
      super();
   }

   public Promotions(RecordRef promoCode, RecordRef couponCode) {
      super();
      this.promoCode = promoCode;
      this.couponCode = couponCode;
   }

   public RecordRef getPromoCode() {
      return this.promoCode;
   }

   public void setPromoCode(RecordRef promoCode) {
      this.promoCode = promoCode;
   }

   public RecordRef getCouponCode() {
      return this.couponCode;
   }

   public void setCouponCode(RecordRef couponCode) {
      this.couponCode = couponCode;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof Promotions)) {
         return false;
      } else {
         Promotions other = (Promotions)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && this.promoCode.equals(other.getPromoCode())) && (this.couponCode == null && other.getCouponCode() == null || this.couponCode != null && this.couponCode.equals(other.getCouponCode()));
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
         if (this.getPromoCode() != null) {
            _hashCode += this.getPromoCode().hashCode();
         }

         if (this.getCouponCode() != null) {
            _hashCode += this.getCouponCode().hashCode();
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "Promotions"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("promoCode");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "promoCode"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("couponCode");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "couponCode"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
