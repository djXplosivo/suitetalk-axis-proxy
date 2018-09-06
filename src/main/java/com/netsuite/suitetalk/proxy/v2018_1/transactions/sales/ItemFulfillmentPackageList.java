package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

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

public class ItemFulfillmentPackageList implements Serializable {
   private ItemFulfillmentPackage[] _package;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageList.class, true);

   public ItemFulfillmentPackageList() {
      super();
   }

   public ItemFulfillmentPackageList(ItemFulfillmentPackage[] _package, boolean replaceAll) {
      super();
      this._package = _package;
      this.replaceAll = replaceAll;
   }

   public ItemFulfillmentPackage[] get_package() {
      return this._package;
   }

   public void set_package(ItemFulfillmentPackage[] _package) {
      this._package = _package;
   }

   public ItemFulfillmentPackage get_package(int i) {
      return this._package[i];
   }

   public void set_package(int i, ItemFulfillmentPackage _value) {
      this._package[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ItemFulfillmentPackageList)) {
         return false;
      } else {
         ItemFulfillmentPackageList other = (ItemFulfillmentPackageList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this._package == null && other.get_package() == null || this._package != null && Arrays.equals(this._package, other.get_package())) && this.replaceAll == other.isReplaceAll();
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
         if (this.get_package() != null) {
            for(int i = 0; i < Array.getLength(this.get_package()); ++i) {
               Object obj = Array.get(this.get_package(), i);
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("_package");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "package"));
      elemField.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackage"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
