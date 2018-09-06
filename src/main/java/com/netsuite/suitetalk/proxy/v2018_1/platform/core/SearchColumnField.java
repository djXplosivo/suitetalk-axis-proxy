package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public abstract class SearchColumnField implements Serializable {
   private String customLabel;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SearchColumnField.class, true);

   public SearchColumnField() {
      super();
   }

   public SearchColumnField(String customLabel) {
      super();
      this.customLabel = customLabel;
   }

   public String getCustomLabel() {
      return this.customLabel;
   }

   public void setCustomLabel(String customLabel) {
      this.customLabel = customLabel;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SearchColumnField)) {
         return false;
      } else {
         SearchColumnField other = (SearchColumnField)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.customLabel == null && other.getCustomLabel() == null || this.customLabel != null && this.customLabel.equals(other.getCustomLabel());
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
         if (this.getCustomLabel() != null) {
            _hashCode += this.getCustomLabel().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SearchColumnField"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("customLabel");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "customLabel"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
