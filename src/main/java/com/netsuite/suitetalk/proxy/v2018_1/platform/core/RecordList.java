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

public class RecordList implements Serializable {
   private Record[] record;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(RecordList.class, true);

   public RecordList() {
      super();
   }

   public RecordList(Record[] record) {
      super();
      this.record = record;
   }

   public Record[] getRecord() {
      return this.record;
   }

   public void setRecord(Record[] record) {
      this.record = record;
   }

   public Record getRecord(int i) {
      return this.record[i];
   }

   public void setRecord(int i, Record _value) {
      this.record[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof RecordList)) {
         return false;
      } else {
         RecordList other = (RecordList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.record == null && other.getRecord() == null || this.record != null && Arrays.equals(this.record, other.getRecord());
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
         if (this.getRecord() != null) {
            for(int i = 0; i < Array.getLength(this.getRecord()); ++i) {
               Object obj = Array.get(this.getRecord(), i);
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("record");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "record"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "Record"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
