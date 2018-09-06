package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Price implements Serializable {
   private Double value;
   private Double quantity;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(Price.class, true);

   public Price() {
      super();
   }

   public Price(Double value, Double quantity) {
      super();
      this.value = value;
      this.quantity = quantity;
   }

   public Double getValue() {
      return this.value;
   }

   public void setValue(Double value) {
      this.value = value;
   }

   public Double getQuantity() {
      return this.quantity;
   }

   public void setQuantity(Double quantity) {
      this.quantity = quantity;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof Price)) {
         return false;
      } else {
         Price other = (Price)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.value == null && other.getValue() == null || this.value != null && this.value.equals(other.getValue())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity()));
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

         if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Price"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("value");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "value"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("quantity");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "quantity"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
