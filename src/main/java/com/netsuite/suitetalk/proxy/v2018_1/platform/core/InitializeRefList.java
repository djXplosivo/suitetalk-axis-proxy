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

public class InitializeRefList implements Serializable {
   private InitializeRef[] initializeRef;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(InitializeRefList.class, true);

   public InitializeRefList() {
      super();
   }

   public InitializeRefList(InitializeRef[] initializeRef) {
      super();
      this.initializeRef = initializeRef;
   }

   public InitializeRef[] getInitializeRef() {
      return this.initializeRef;
   }

   public void setInitializeRef(InitializeRef[] initializeRef) {
      this.initializeRef = initializeRef;
   }

   public InitializeRef getInitializeRef(int i) {
      return this.initializeRef[i];
   }

   public void setInitializeRef(int i, InitializeRef _value) {
      this.initializeRef[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof InitializeRefList)) {
         return false;
      } else {
         InitializeRefList other = (InitializeRefList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.initializeRef == null && other.getInitializeRef() == null || this.initializeRef != null && Arrays.equals(this.initializeRef, other.getInitializeRef());
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
         if (this.getInitializeRef() != null) {
            for(int i = 0; i < Array.getLength(this.getInitializeRef()); ++i) {
               Object obj = Array.get(this.getInitializeRef(), i);
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "InitializeRefList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("initializeRef");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "initializeRef"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "InitializeRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
