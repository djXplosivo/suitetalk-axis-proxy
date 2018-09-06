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

public class DepositCashBackList implements Serializable {
   private DepositCashBack[] depositCashBack;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(DepositCashBackList.class, true);

   public DepositCashBackList() {
      super();
   }

   public DepositCashBackList(DepositCashBack[] depositCashBack, boolean replaceAll) {
      super();
      this.depositCashBack = depositCashBack;
      this.replaceAll = replaceAll;
   }

   public DepositCashBack[] getDepositCashBack() {
      return this.depositCashBack;
   }

   public void setDepositCashBack(DepositCashBack[] depositCashBack) {
      this.depositCashBack = depositCashBack;
   }

   public DepositCashBack getDepositCashBack(int i) {
      return this.depositCashBack[i];
   }

   public void setDepositCashBack(int i, DepositCashBack _value) {
      this.depositCashBack[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof DepositCashBackList)) {
         return false;
      } else {
         DepositCashBackList other = (DepositCashBackList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.depositCashBack == null && other.getDepositCashBack() == null || this.depositCashBack != null && Arrays.equals(this.depositCashBack, other.getDepositCashBack())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getDepositCashBack() != null) {
            for(int i = 0; i < Array.getLength(this.getDepositCashBack()); ++i) {
               Object obj = Array.get(this.getDepositCashBack(), i);
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
      typeDesc.setXmlType(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositCashBackList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("depositCashBack");
      elemField.setXmlName(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "depositCashBack"));
      elemField.setXmlType(new QName("urn:bank_2018_1.transactions.webservices.netsuite.com", "DepositCashBack"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
