package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.CustomFieldRef;

public class CustomFieldList implements Serializable {
   private CustomFieldRef[] customField;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomFieldList.class, true);

   public CustomFieldList() {
      super();
   }

   public CustomFieldList(CustomFieldRef[] customField) {
      super();
      this.customField = customField;
   }

   public CustomFieldRef[] getCustomField() {
      return this.customField;
   }

   public void setCustomField(CustomFieldRef[] customField) {
      this.customField = customField;
   }

   public CustomFieldRef getCustomField(int i) {
      return this.customField[i];
   }

   public void setCustomField(int i, CustomFieldRef _value) {
      this.customField[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomFieldList)) {
         return false;
      } else {
         CustomFieldList other = (CustomFieldList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.customField == null && other.getCustomField() == null || this.customField != null && Arrays.equals(this.customField, other.getCustomField());
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
         if (this.getCustomField() != null) {
            for(int i = 0; i < Array.getLength(this.getCustomField()); ++i) {
               Object obj = Array.get(this.getCustomField(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("customField");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "customField"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomFieldRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
