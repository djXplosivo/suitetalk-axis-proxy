package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SerializedInventoryItemNumbers implements Serializable {
   private RecordRef serialNumber;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SerializedInventoryItemNumbers.class, true);

   public SerializedInventoryItemNumbers() {
      super();
   }

   public SerializedInventoryItemNumbers(RecordRef serialNumber) {
      super();
      this.serialNumber = serialNumber;
   }

   public RecordRef getSerialNumber() {
      return this.serialNumber;
   }

   public void setSerialNumber(RecordRef serialNumber) {
      this.serialNumber = serialNumber;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SerializedInventoryItemNumbers)) {
         return false;
      } else {
         SerializedInventoryItemNumbers other = (SerializedInventoryItemNumbers)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.serialNumber == null && other.getSerialNumber() == null || this.serialNumber != null && this.serialNumber.equals(other.getSerialNumber());
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
         if (this.getSerialNumber() != null) {
            _hashCode += this.getSerialNumber().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SerializedInventoryItemNumbers"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("serialNumber");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "serialNumber"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
