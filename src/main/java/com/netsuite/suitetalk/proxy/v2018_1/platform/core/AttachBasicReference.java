package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AttachBasicReference extends AttachReference implements Serializable {
   private BaseRef attachedRecord;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AttachBasicReference.class, true);

   public AttachBasicReference() {
      super();
   }

   public AttachBasicReference(BaseRef attachTo, BaseRef attachedRecord) {
      super(attachTo);
      this.attachedRecord = attachedRecord;
   }

   public BaseRef getAttachedRecord() {
      return this.attachedRecord;
   }

   public void setAttachedRecord(BaseRef attachedRecord) {
      this.attachedRecord = attachedRecord;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AttachBasicReference)) {
         return false;
      } else {
         AttachBasicReference other = (AttachBasicReference)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.attachedRecord == null && other.getAttachedRecord() == null || this.attachedRecord != null && this.attachedRecord.equals(other.getAttachedRecord()));
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
         if (this.getAttachedRecord() != null) {
            _hashCode += this.getAttachedRecord().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "AttachBasicReference"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("attachedRecord");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "attachedRecord"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "BaseRef"));
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
