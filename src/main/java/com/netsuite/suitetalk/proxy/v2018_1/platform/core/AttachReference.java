package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public abstract class AttachReference implements Serializable {
   private BaseRef attachTo;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AttachReference.class, true);

   public AttachReference() {
      super();
   }

   public AttachReference(BaseRef attachTo) {
      super();
      this.attachTo = attachTo;
   }

   public BaseRef getAttachTo() {
      return this.attachTo;
   }

   public void setAttachTo(BaseRef attachTo) {
      this.attachTo = attachTo;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AttachReference)) {
         return false;
      } else {
         AttachReference other = (AttachReference)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.attachTo == null && other.getAttachTo() == null || this.attachTo != null && this.attachTo.equals(other.getAttachTo());
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
         if (this.getAttachTo() != null) {
            _hashCode += this.getAttachTo().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AttachReference"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("attachTo");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "attachTo"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}