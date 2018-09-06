package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomerGroupPricingList implements Serializable {
   private CustomerGroupPricing[] groupPricing;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomerGroupPricingList.class, true);

   public CustomerGroupPricingList() {
      super();
   }

   public CustomerGroupPricingList(CustomerGroupPricing[] groupPricing, boolean replaceAll) {
      super();
      this.groupPricing = groupPricing;
      this.replaceAll = replaceAll;
   }

   public CustomerGroupPricing[] getGroupPricing() {
      return this.groupPricing;
   }

   public void setGroupPricing(CustomerGroupPricing[] groupPricing) {
      this.groupPricing = groupPricing;
   }

   public CustomerGroupPricing getGroupPricing(int i) {
      return this.groupPricing[i];
   }

   public void setGroupPricing(int i, CustomerGroupPricing _value) {
      this.groupPricing[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomerGroupPricingList)) {
         return false;
      } else {
         CustomerGroupPricingList other = (CustomerGroupPricingList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.groupPricing == null && other.getGroupPricing() == null || this.groupPricing != null && Arrays.equals(this.groupPricing, other.getGroupPricing())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getGroupPricing() != null) {
            for(int i = 0; i < Array.getLength(this.getGroupPricing()); ++i) {
               Object obj = Array.get(this.getGroupPricing(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         _hashCode += (this.isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerGroupPricingList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("groupPricing");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "groupPricing"));
      elemField.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "CustomerGroupPricing"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
