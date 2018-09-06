package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.Language;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomRecordTranslations implements Serializable {
   private Language locale;
   private String language;
   private String label;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomRecordTranslations.class, true);

   public CustomRecordTranslations() {
      super();
   }

   public CustomRecordTranslations(Language locale, String language, String label) {
      super();
      this.locale = locale;
      this.language = language;
      this.label = label;
   }

   public Language getLocale() {
      return this.locale;
   }

   public void setLocale(Language locale) {
      this.locale = locale;
   }

   public String getLanguage() {
      return this.language;
   }

   public void setLanguage(String language) {
      this.language = language;
   }

   public String getLabel() {
      return this.label;
   }

   public void setLabel(String label) {
      this.label = label;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomRecordTranslations)) {
         return false;
      } else {
         CustomRecordTranslations other = (CustomRecordTranslations)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.locale == null && other.getLocale() == null || this.locale != null && this.locale.equals(other.getLocale())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.label == null && other.getLabel() == null || this.label != null && this.label.equals(other.getLabel()));
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
         if (this.getLocale() != null) {
            _hashCode += this.getLocale().hashCode();
         }

         if (this.getLanguage() != null) {
            _hashCode += this.getLanguage().hashCode();
         }

         if (this.getLabel() != null) {
            _hashCode += this.getLabel().hashCode();
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTranslations"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("locale");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "locale"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "Language"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("language");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "language"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("label");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "label"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
