package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

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

public class CustomRecordTypeTabsList implements Serializable {
   private CustomRecordTypeTabs[] tabs;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypeTabsList.class, true);

   public CustomRecordTypeTabsList() {
      super();
   }

   public CustomRecordTypeTabsList(CustomRecordTypeTabs[] tabs, boolean replaceAll) {
      super();
      this.tabs = tabs;
      this.replaceAll = replaceAll;
   }

   public CustomRecordTypeTabs[] getTabs() {
      return this.tabs;
   }

   public void setTabs(CustomRecordTypeTabs[] tabs) {
      this.tabs = tabs;
   }

   public CustomRecordTypeTabs getTabs(int i) {
      return this.tabs[i];
   }

   public void setTabs(int i, CustomRecordTypeTabs _value) {
      this.tabs[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomRecordTypeTabsList)) {
         return false;
      } else {
         CustomRecordTypeTabsList other = (CustomRecordTypeTabsList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.tabs == null && other.getTabs() == null || this.tabs != null && Arrays.equals(this.tabs, other.getTabs())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getTabs() != null) {
            for(int i = 0; i < Array.getLength(this.getTabs()); ++i) {
               Object obj = Array.get(this.getTabs(), i);
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeTabsList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("tabs");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "tabs"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeTabs"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
