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

public class GetSelectFilterByFieldValueList implements Serializable {
   private GetSelectFilterByFieldValue[] filterBy;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(GetSelectFilterByFieldValueList.class, true);

   public GetSelectFilterByFieldValueList() {
      super();
   }

   public GetSelectFilterByFieldValueList(GetSelectFilterByFieldValue[] filterBy) {
      super();
      this.filterBy = filterBy;
   }

   public GetSelectFilterByFieldValue[] getFilterBy() {
      return this.filterBy;
   }

   public void setFilterBy(GetSelectFilterByFieldValue[] filterBy) {
      this.filterBy = filterBy;
   }

   public GetSelectFilterByFieldValue getFilterBy(int i) {
      return this.filterBy[i];
   }

   public void setFilterBy(int i, GetSelectFilterByFieldValue _value) {
      this.filterBy[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof GetSelectFilterByFieldValueList)) {
         return false;
      } else {
         GetSelectFilterByFieldValueList other = (GetSelectFilterByFieldValueList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.filterBy == null && other.getFilterBy() == null || this.filterBy != null && Arrays.equals(this.filterBy, other.getFilterBy());
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
         if (this.getFilterBy() != null) {
            for(int i = 0; i < Array.getLength(this.getFilterBy()); ++i) {
               Object obj = Array.get(this.getFilterBy(), i);
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectFilterByFieldValueList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("filterBy");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "filterBy"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "GetSelectFilterByFieldValue"));
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
