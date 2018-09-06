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

public class VendorCurrencyList implements Serializable {
   private VendorCurrency[] vendorCurrency;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(VendorCurrencyList.class, true);

   public VendorCurrencyList() {
      super();
   }

   public VendorCurrencyList(VendorCurrency[] vendorCurrency, boolean replaceAll) {
      super();
      this.vendorCurrency = vendorCurrency;
      this.replaceAll = replaceAll;
   }

   public VendorCurrency[] getVendorCurrency() {
      return this.vendorCurrency;
   }

   public void setVendorCurrency(VendorCurrency[] vendorCurrency) {
      this.vendorCurrency = vendorCurrency;
   }

   public VendorCurrency getVendorCurrency(int i) {
      return this.vendorCurrency[i];
   }

   public void setVendorCurrency(int i, VendorCurrency _value) {
      this.vendorCurrency[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof VendorCurrencyList)) {
         return false;
      } else {
         VendorCurrencyList other = (VendorCurrencyList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.vendorCurrency == null && other.getVendorCurrency() == null || this.vendorCurrency != null && Arrays.equals(this.vendorCurrency, other.getVendorCurrency())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getVendorCurrency() != null) {
            for(int i = 0; i < Array.getLength(this.getVendorCurrency()); ++i) {
               Object obj = Array.get(this.getVendorCurrency(), i);
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorCurrencyList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("vendorCurrency");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "vendorCurrency"));
      elemField.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorCurrency"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
