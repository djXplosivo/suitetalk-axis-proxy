package com.netsuite.suitetalk.proxy.v2018_1.transactions.customers;

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

public class CustomerPaymentCreditList implements Serializable {
   private CustomerPaymentCredit[] credit;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomerPaymentCreditList.class, true);

   public CustomerPaymentCreditList() {
      super();
   }

   public CustomerPaymentCreditList(CustomerPaymentCredit[] credit, boolean replaceAll) {
      super();
      this.credit = credit;
      this.replaceAll = replaceAll;
   }

   public CustomerPaymentCredit[] getCredit() {
      return this.credit;
   }

   public void setCredit(CustomerPaymentCredit[] credit) {
      this.credit = credit;
   }

   public CustomerPaymentCredit getCredit(int i) {
      return this.credit[i];
   }

   public void setCredit(int i, CustomerPaymentCredit _value) {
      this.credit[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomerPaymentCreditList)) {
         return false;
      } else {
         CustomerPaymentCreditList other = (CustomerPaymentCreditList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.credit == null && other.getCredit() == null || this.credit != null && Arrays.equals(this.credit, other.getCredit())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getCredit() != null) {
            for(int i = 0; i < Array.getLength(this.getCredit()); ++i) {
               Object obj = Array.get(this.getCredit(), i);
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
      typeDesc.setXmlType(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerPaymentCreditList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("credit");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "credit"));
      elemField.setXmlType(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerPaymentCredit"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
