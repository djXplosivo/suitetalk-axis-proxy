package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SelectDimensionRef extends DimensionRef implements Serializable {
   private ListOrRecordRef value;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SelectDimensionRef.class, true);

   public SelectDimensionRef() {
      super();
   }

   public SelectDimensionRef(String scriptId, ListOrRecordRef value) {
      super(scriptId);
      this.value = value;
   }

   public ListOrRecordRef getValue() {
      return this.value;
   }

   public void setValue(ListOrRecordRef value) {
      this.value = value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SelectDimensionRef)) {
         return false;
      } else {
         SelectDimensionRef other = (SelectDimensionRef)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.value == null && other.getValue() == null || this.value != null && this.value.equals(other.getValue()));
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "SelectDimensionRef"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("value");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "value"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ListOrRecordRef"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
