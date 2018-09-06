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

public class CustomerRefundDepositList implements Serializable {
   private CustomerRefundDeposit[] customerRefundDeposit;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CustomerRefundDepositList.class, true);

   public CustomerRefundDepositList() {
      super();
   }

   public CustomerRefundDepositList(CustomerRefundDeposit[] customerRefundDeposit, boolean replaceAll) {
      super();
      this.customerRefundDeposit = customerRefundDeposit;
      this.replaceAll = replaceAll;
   }

   public CustomerRefundDeposit[] getCustomerRefundDeposit() {
      return this.customerRefundDeposit;
   }

   public void setCustomerRefundDeposit(CustomerRefundDeposit[] customerRefundDeposit) {
      this.customerRefundDeposit = customerRefundDeposit;
   }

   public CustomerRefundDeposit getCustomerRefundDeposit(int i) {
      return this.customerRefundDeposit[i];
   }

   public void setCustomerRefundDeposit(int i, CustomerRefundDeposit _value) {
      this.customerRefundDeposit[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CustomerRefundDepositList)) {
         return false;
      } else {
         CustomerRefundDepositList other = (CustomerRefundDepositList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.customerRefundDeposit == null && other.getCustomerRefundDeposit() == null || this.customerRefundDeposit != null && Arrays.equals(this.customerRefundDeposit, other.getCustomerRefundDeposit())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getCustomerRefundDeposit() != null) {
            for(int i = 0; i < Array.getLength(this.getCustomerRefundDeposit()); ++i) {
               Object obj = Array.get(this.getCustomerRefundDeposit(), i);
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
      typeDesc.setXmlType(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerRefundDepositList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("customerRefundDeposit");
      elemField.setXmlName(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "customerRefundDeposit"));
      elemField.setXmlType(new QName("urn:customers_2018_1.transactions.webservices.netsuite.com", "CustomerRefundDeposit"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
