package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Rate implements Serializable {
   private Double value;
   private RecordRef priceLevel;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(Rate.class, true);

   public Rate() {
      super();
   }

   public Rate(Double value, RecordRef priceLevel) {
      super();
      this.value = value;
      this.priceLevel = priceLevel;
   }

   public Double getValue() {
      return this.value;
   }

   public void setValue(Double value) {
      this.value = value;
   }

   public RecordRef getPriceLevel() {
      return this.priceLevel;
   }

   public void setPriceLevel(RecordRef priceLevel) {
      this.priceLevel = priceLevel;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof Rate)) {
         return false;
      } else {
         Rate other = (Rate)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.value == null && other.getValue() == null || this.value != null && this.value.equals(other.getValue())) && (this.priceLevel == null && other.getPriceLevel() == null || this.priceLevel != null && this.priceLevel.equals(other.getPriceLevel()));
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
         if (this.getValue() != null) {
            _hashCode += this.getValue().hashCode();
         }

         if (this.getPriceLevel() != null) {
            _hashCode += this.getPriceLevel().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Rate"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("value");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "value"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("priceLevel");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "priceLevel"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
