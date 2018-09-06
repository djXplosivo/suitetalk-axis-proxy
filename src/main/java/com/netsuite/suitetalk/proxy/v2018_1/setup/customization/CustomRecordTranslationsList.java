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

public class CustomRecordTranslationsList implements Serializable {
   private CustomRecordTranslations[] customRecordTranslations;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomRecordTranslationsList.class, true);

   public CustomRecordTranslationsList() {
      super();
   }

   public CustomRecordTranslationsList(CustomRecordTranslations[] customRecordTranslations, boolean replaceAll) {
      super();
      this.customRecordTranslations = customRecordTranslations;
      this.replaceAll = replaceAll;
   }

   public CustomRecordTranslations[] getCustomRecordTranslations() {
      return this.customRecordTranslations;
   }

   public void setCustomRecordTranslations(CustomRecordTranslations[] customRecordTranslations) {
      this.customRecordTranslations = customRecordTranslations;
   }

   public CustomRecordTranslations getCustomRecordTranslations(int i) {
      return this.customRecordTranslations[i];
   }

   public void setCustomRecordTranslations(int i, CustomRecordTranslations _value) {
      this.customRecordTranslations[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomRecordTranslationsList)) {
         return false;
      } else {
         CustomRecordTranslationsList other = (CustomRecordTranslationsList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.customRecordTranslations == null && other.getCustomRecordTranslations() == null || this.customRecordTranslations != null && Arrays.equals(this.customRecordTranslations, other.getCustomRecordTranslations())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getCustomRecordTranslations() != null) {
            for(int i = 0; i < Array.getLength(this.getCustomRecordTranslations()); ++i) {
               Object obj = Array.get(this.getCustomRecordTranslations(), i);
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTranslationsList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("customRecordTranslations");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "customRecordTranslations"));
      elemField.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTranslations"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
