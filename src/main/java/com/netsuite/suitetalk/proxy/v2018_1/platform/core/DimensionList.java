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

public class DimensionList implements Serializable {
   private DimensionRef[] dimension;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(DimensionList.class, true);

   public DimensionList() {
      super();
   }

   public DimensionList(DimensionRef[] dimension) {
      super();
      this.dimension = dimension;
   }

   public DimensionRef[] getDimension() {
      return this.dimension;
   }

   public void setDimension(DimensionRef[] dimension) {
      this.dimension = dimension;
   }

   public DimensionRef getDimension(int i) {
      return this.dimension[i];
   }

   public void setDimension(int i, DimensionRef _value) {
      this.dimension[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof DimensionList)) {
         return false;
      } else {
         DimensionList other = (DimensionList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.dimension == null && other.getDimension() == null || this.dimension != null && Arrays.equals(this.dimension, other.getDimension());
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
         if (this.getDimension() != null) {
            for(int i = 0; i < Array.getLength(this.getDimension()); ++i) {
               Object obj = Array.get(this.getDimension(), i);
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DimensionList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("dimension");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "dimension"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DimensionRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
