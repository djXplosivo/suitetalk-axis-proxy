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

public class CustomRecordTypeTranslationsList implements Serializable {
   private CustomRecordTypeTranslations[] translations;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypeTranslationsList.class, true);

   public CustomRecordTypeTranslationsList() {
      super();
   }

   public CustomRecordTypeTranslationsList(CustomRecordTypeTranslations[] translations, boolean replaceAll) {
      super();
      this.translations = translations;
      this.replaceAll = replaceAll;
   }

   public CustomRecordTypeTranslations[] getTranslations() {
      return this.translations;
   }

   public void setTranslations(CustomRecordTypeTranslations[] translations) {
      this.translations = translations;
   }

   public CustomRecordTypeTranslations getTranslations(int i) {
      return this.translations[i];
   }

   public void setTranslations(int i, CustomRecordTypeTranslations _value) {
      this.translations[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomRecordTypeTranslationsList)) {
         return false;
      } else {
         CustomRecordTypeTranslationsList other = (CustomRecordTypeTranslationsList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.translations == null && other.getTranslations() == null || this.translations != null && Arrays.equals(this.translations, other.getTranslations())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getTranslations() != null) {
            for(int i = 0; i < Array.getLength(this.getTranslations()); ++i) {
               Object obj = Array.get(this.getTranslations(), i);
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeTranslationsList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("translations");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "translations"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypeTranslations"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
