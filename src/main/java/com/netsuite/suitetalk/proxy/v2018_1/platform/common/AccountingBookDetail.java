package com.netsuite.suitetalk.proxy.v2018_1.platform.common;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AccountingBookDetail implements Serializable {
   private RecordRef accountingBook;
   private RecordRef currency;
   private Double exchangeRate;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AccountingBookDetail.class, true);

   public AccountingBookDetail() {
      super();
   }

   public AccountingBookDetail(RecordRef accountingBook, RecordRef currency, Double exchangeRate) {
      super();
      this.accountingBook = accountingBook;
      this.currency = currency;
      this.exchangeRate = exchangeRate;
   }

   public RecordRef getAccountingBook() {
      return this.accountingBook;
   }

   public void setAccountingBook(RecordRef accountingBook) {
      this.accountingBook = accountingBook;
   }

   public RecordRef getCurrency() {
      return this.currency;
   }

   public void setCurrency(RecordRef currency) {
      this.currency = currency;
   }

   public Double getExchangeRate() {
      return this.exchangeRate;
   }

   public void setExchangeRate(Double exchangeRate) {
      this.exchangeRate = exchangeRate;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AccountingBookDetail)) {
         return false;
      } else {
         AccountingBookDetail other = (AccountingBookDetail)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate()));
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
         if (this.getAccountingBook() != null) {
            _hashCode += this.getAccountingBook().hashCode();
         }

         if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
         }

         if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
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
      typeDesc.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingBookDetail"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("accountingBook");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "accountingBook"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("currency");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "currency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("exchangeRate");
      elemField.setXmlName(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "exchangeRate"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
