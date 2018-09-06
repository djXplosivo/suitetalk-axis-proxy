package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ClassTranslation implements Serializable {
   private String locale;
   private String language;
   private String name;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ClassTranslation.class, true);

   public ClassTranslation() {
      super();
   }

   public ClassTranslation(String locale, String language, String name) {
      super();
      this.locale = locale;
      this.language = language;
      this.name = name;
   }

   public String getLocale() {
      return this.locale;
   }

   public void setLocale(String locale) {
      this.locale = locale;
   }

   public String getLanguage() {
      return this.language;
   }

   public void setLanguage(String language) {
      this.language = language;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ClassTranslation)) {
         return false;
      } else {
         ClassTranslation other = (ClassTranslation)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.locale == null && other.getLocale() == null || this.locale != null && this.locale.equals(other.getLocale())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName()));
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

         if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ClassTranslation"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("locale");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "locale"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("language");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "language"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("name");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "name"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
