package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

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

public class AccountingBookDetailList implements Serializable {
   private AccountingBookDetail[] accountingBookDetail;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AccountingBookDetailList.class, true);

   public AccountingBookDetailList() {
      super();
   }

   public AccountingBookDetailList(AccountingBookDetail[] accountingBookDetail, boolean replaceAll) {
      super();
      this.accountingBookDetail = accountingBookDetail;
      this.replaceAll = replaceAll;
   }

   public AccountingBookDetail[] getAccountingBookDetail() {
      return this.accountingBookDetail;
   }

   public void setAccountingBookDetail(AccountingBookDetail[] accountingBookDetail) {
      this.accountingBookDetail = accountingBookDetail;
   }

   public AccountingBookDetail getAccountingBookDetail(int i) {
      return this.accountingBookDetail[i];
   }

   public void setAccountingBookDetail(int i, AccountingBookDetail _value) {
      this.accountingBookDetail[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AccountingBookDetailList)) {
         return false;
      } else {
         AccountingBookDetailList other = (AccountingBookDetailList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.accountingBookDetail == null && other.getAccountingBookDetail() == null || this.accountingBookDetail != null && Arrays.equals(this.accountingBookDetail, other.getAccountingBookDetail())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getAccountingBookDetail() != null) {
            for(int i = 0; i < Array.getLength(this.getAccountingBookDetail()); ++i) {
               Object obj = Array.get(this.getAccountingBookDetail(), i);
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("accountingBookDetail");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "accountingBookDetail"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingBookDetail"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
