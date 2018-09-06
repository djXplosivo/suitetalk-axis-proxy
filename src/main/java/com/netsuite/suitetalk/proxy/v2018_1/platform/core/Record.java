package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public abstract class Record implements Serializable {
   private NullField nullFieldList;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(Record.class, true);

   public Record() {
      super();
   }

   public Record(NullField nullFieldList) {
      super();
      this.nullFieldList = nullFieldList;
   }

   public NullField getNullFieldList() {
      return this.nullFieldList;
   }

   public void setNullFieldList(NullField nullFieldList) {
      this.nullFieldList = nullFieldList;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof Record)) {
         return false;
      } else {
         Record other = (Record)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.nullFieldList == null && other.getNullFieldList() == null || this.nullFieldList != null && this.nullFieldList.equals(other.getNullFieldList());
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
         if (this.getNullFieldList() != null) {
            _hashCode += this.getNullFieldList().hashCode();
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("nullFieldList");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "nullFieldList"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "NullField"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
