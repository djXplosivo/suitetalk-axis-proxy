package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CashSaleTimeList implements Serializable {
   private CashSaleTime[] time;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CashSaleTimeList.class, true);

   public CashSaleTimeList() {
      super();
   }

   public CashSaleTimeList(CashSaleTime[] time, boolean replaceAll) {
      super();
      this.time = time;
      this.replaceAll = replaceAll;
   }

   public CashSaleTime[] getTime() {
      return this.time;
   }

   public void setTime(CashSaleTime[] time) {
      this.time = time;
   }

   public CashSaleTime getTime(int i) {
      return this.time[i];
   }

   public void setTime(int i, CashSaleTime _value) {
      this.time[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CashSaleTimeList)) {
         return false;
      } else {
         CashSaleTimeList other = (CashSaleTimeList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.time == null && other.getTime() == null || this.time != null && Arrays.equals(this.time, other.getTime())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getTime() != null) {
            for(int i = 0; i < Array.getLength(this.getTime()); ++i) {
               Object obj = Array.get(this.getTime(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         _hashCode += (this.isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleTimeList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("time");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "time"));
      elemField.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "CashSaleTime"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
