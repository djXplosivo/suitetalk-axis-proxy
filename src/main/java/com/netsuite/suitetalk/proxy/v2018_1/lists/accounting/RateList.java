package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

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

public class RateList implements Serializable {
   private Rate[] rate;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(RateList.class, true);

   public RateList() {
      super();
   }

   public RateList(Rate[] rate) {
      super();
      this.rate = rate;
   }

   public Rate[] getRate() {
      return this.rate;
   }

   public void setRate(Rate[] rate) {
      this.rate = rate;
   }

   public Rate getRate(int i) {
      return this.rate[i];
   }

   public void setRate(int i, Rate _value) {
      this.rate[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof RateList)) {
         return false;
      } else {
         RateList other = (RateList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.rate == null && other.getRate() == null || this.rate != null && Arrays.equals(this.rate, other.getRate());
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
         if (this.getRate() != null) {
            for(int i = 0; i < Array.getLength(this.getRate()); ++i) {
               Object obj = Array.get(this.getRate(), i);
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "RateList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("rate");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "rate"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "Rate"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
