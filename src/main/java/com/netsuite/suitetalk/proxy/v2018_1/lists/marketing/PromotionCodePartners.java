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

public class PromotionCodePartners implements Serializable {
   private RecordRef partner;
   private String code;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(PromotionCodePartners.class, true);

   public PromotionCodePartners() {
      super();
   }

   public PromotionCodePartners(RecordRef partner, String code) {
      super();
      this.partner = partner;
      this.code = code;
   }

   public RecordRef getPartner() {
      return this.partner;
   }

   public void setPartner(RecordRef partner) {
      this.partner = partner;
   }

   public String getCode() {
      return this.code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof PromotionCodePartners)) {
         return false;
      } else {
         PromotionCodePartners other = (PromotionCodePartners)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.code == null && other.getCode() == null || this.code != null && this.code.equals(other.getCode()));
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
         if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
         }

         if (this.getCode() != null) {
            _hashCode += this.getCode().hashCode();
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
      typeDesc.setXmlType(new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "PromotionCodePartners"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("partner");
      elemField.setXmlName(new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "partner"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("code");
      elemField.setXmlName(new QName("urn:marketing_2018_1.lists.webservices.netsuite.com", "code"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
