package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.GetCustomizationType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomizationType implements Serializable {
   private GetCustomizationType getCustomizationType;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomizationType.class, true);

   public CustomizationType() {
      super();
   }

   public CustomizationType(GetCustomizationType getCustomizationType) {
      super();
      this.getCustomizationType = getCustomizationType;
   }

   public GetCustomizationType getGetCustomizationType() {
      return this.getCustomizationType;
   }

   public void setGetCustomizationType(GetCustomizationType getCustomizationType) {
      this.getCustomizationType = getCustomizationType;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomizationType)) {
         return false;
      } else {
         CustomizationType other = (CustomizationType)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.getCustomizationType == null && other.getGetCustomizationType() == null || this.getCustomizationType != null && this.getCustomizationType.equals(other.getGetCustomizationType());
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
         if (this.getGetCustomizationType() != null) {
            _hashCode += this.getGetCustomizationType().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomizationType"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("getCustomizationType");
      attrField.setXmlName(new QName("", "getCustomizationType"));
      attrField.setXmlType(new QName("urn:types.core_2018_1.platform.webservices.netsuite.com", "GetCustomizationType"));
      typeDesc.addFieldDesc(attrField);
   }
}
