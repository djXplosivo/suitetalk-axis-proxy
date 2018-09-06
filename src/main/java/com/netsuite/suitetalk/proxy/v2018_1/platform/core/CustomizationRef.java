package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.types.RecordType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomizationRef extends RecordRef implements Serializable {
   private String scriptId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomizationRef.class, true);

   public CustomizationRef() {
      super();
   }

   public CustomizationRef(String name, String internalId, String externalId, RecordType type, String scriptId) {
      super(name, internalId, externalId, type);
      this.scriptId = scriptId;
   }

   public String getScriptId() {
      return this.scriptId;
   }

   public void setScriptId(String scriptId) {
      this.scriptId = scriptId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomizationRef)) {
         return false;
      } else {
         CustomizationRef other = (CustomizationRef)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && this.scriptId.equals(other.getScriptId()));
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "CustomizationRef"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("scriptId");
      attrField.setXmlName(new QName("", "scriptId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
   }
}
