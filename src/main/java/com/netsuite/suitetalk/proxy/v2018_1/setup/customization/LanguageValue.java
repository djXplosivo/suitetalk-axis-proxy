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

public class LanguageValue implements Serializable {
   private Language locale;
   private String value;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(LanguageValue.class, true);

   public LanguageValue() {
      super();
   }

   public LanguageValue(Language locale, String value) {
      super();
      this.locale = locale;
      this.value = value;
   }

   public Language getLocale() {
      return this.locale;
   }

   public void setLocale(Language locale) {
      this.locale = locale;
   }

   public String getValue() {
      return this.value;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof LanguageValue)) {
         return false;
      } else {
         LanguageValue other = (LanguageValue)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.locale == null && other.getLocale() == null || this.locale != null && this.locale.equals(other.getLocale())) && (this.value == null && other.getValue() == null || this.value != null && this.value.equals(other.getValue()));
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

         if (this.getValue() != null) {
            _hashCode += this.getValue().hashCode();
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "LanguageValue"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("locale");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "locale"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "Language"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("value");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "value"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
