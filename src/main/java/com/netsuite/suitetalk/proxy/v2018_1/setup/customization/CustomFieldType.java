package com.netsuite.suitetalk.proxy.v2018_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types.CustomizationFieldType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public abstract class CustomFieldType extends Record implements Serializable {
   private CustomizationFieldType fieldType;
   private String scriptId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomFieldType.class, true);

   public CustomFieldType() {
      super();
   }

   public CustomFieldType(NullField nullFieldList, CustomizationFieldType fieldType, String scriptId) {
      super(nullFieldList);
      this.fieldType = fieldType;
      this.scriptId = scriptId;
   }

   public CustomizationFieldType getFieldType() {
      return this.fieldType;
   }

   public void setFieldType(CustomizationFieldType fieldType) {
      this.fieldType = fieldType;
   }

   public String getScriptId() {
      return this.scriptId;
   }

   public void setScriptId(String scriptId) {
      this.scriptId = scriptId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomFieldType)) {
         return false;
      } else {
         CustomFieldType other = (CustomFieldType)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.fieldType == null && other.getFieldType() == null || this.fieldType != null && this.fieldType.equals(other.getFieldType())) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && this.scriptId.equals(other.getScriptId()));
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
         int _hashCode = super.hashCode();
         if (this.getFieldType() != null) {
            _hashCode += this.getFieldType().hashCode();
         }

         if (this.getScriptId() != null) {
            _hashCode += this.getScriptId().hashCode();
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
      typeDesc.setXmlType(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "CustomFieldType"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("fieldType");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "fieldType"));
      elemField.setXmlType(new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomizationFieldType"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("scriptId");
      elemField.setXmlName(new QName("urn:customization_2018_1.setup.webservices.netsuite.com", "scriptId"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
