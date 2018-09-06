package com.netsuite.suitetalk.proxy.v2018_1.transactions.bank;

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

public class DepositPaymentList implements Serializable {
   private DepositPayment[] depositPayment;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(DepositPaymentList.class, true);

   public DepositPaymentList() {
      super();
   }

   public DepositPaymentList(DepositPayment[] depositPayment, boolean replaceAll) {
      super();
      this.depositPayment = depositPayment;
      this.replaceAll = replaceAll;
   }

   public DepositPayment[] getDepositPayment() {
      return this.depositPayment;
   }

   public void setDepositPayment(DepositPayment[] depositPayment) {
      this.depositPayment = depositPayment;
   }

   public DepositPayment getDepositPayment(int i) {
      return this.depositPayment[i];
   }

   public void setDepositPayment(int i, DepositPayment _value) {
      this.depositPayment[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof DepositPaymentList)) {
         return false;
      } else {
         DepositPaymentList other = (DepositPaymentList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.depositPayment == null && other.getDepositPayment() == null || this.depositPayment != null && Arrays.equals(this.depositPayment, other.getDepositPayment())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getDepositPayment() != null) {
            for(int i = 0; i < Array.getLength(this.getDepositPayment()); ++i) {
               Object obj = Array.get(this.getDepositPayment(), i);
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
      typeDesc.setXmlType(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositPaymentList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("depositPayment");
      elemField.setXmlName(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "depositPayment"));
      elemField.setXmlType(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositPayment"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
