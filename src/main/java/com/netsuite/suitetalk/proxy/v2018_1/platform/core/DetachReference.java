package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public abstract class DetachReference implements Serializable {
   private BaseRef detachFrom;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(DetachReference.class, true);

   public DetachReference() {
      super();
   }

   public DetachReference(BaseRef detachFrom) {
      super();
      this.detachFrom = detachFrom;
   }

   public BaseRef getDetachFrom() {
      return this.detachFrom;
   }

   public void setDetachFrom(BaseRef detachFrom) {
      this.detachFrom = detachFrom;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof DetachReference)) {
         return false;
      } else {
         DetachReference other = (DetachReference)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.detachFrom == null && other.getDetachFrom() == null || this.detachFrom != null && this.detachFrom.equals(other.getDetachFrom());
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
         if (this.getDetachFrom() != null) {
            _hashCode += this.getDetachFrom().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "DetachReference"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("detachFrom");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "detachFrom"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
