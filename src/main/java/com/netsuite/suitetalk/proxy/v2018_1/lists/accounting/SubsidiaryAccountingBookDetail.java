package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.lists.accounting.types.AccountingBookStatus;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SubsidiaryAccountingBookDetail implements Serializable {
   private RecordRef accountingBook;
   private RecordRef currency;
   private AccountingBookStatus bookStatus;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(SubsidiaryAccountingBookDetail.class, true);

   public SubsidiaryAccountingBookDetail() {
      super();
   }

   public SubsidiaryAccountingBookDetail(RecordRef accountingBook, RecordRef currency, AccountingBookStatus bookStatus) {
      super();
      this.accountingBook = accountingBook;
      this.currency = currency;
      this.bookStatus = bookStatus;
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

   public AccountingBookStatus getBookStatus() {
      return this.bookStatus;
   }

   public void setBookStatus(AccountingBookStatus bookStatus) {
      this.bookStatus = bookStatus;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof SubsidiaryAccountingBookDetail)) {
         return false;
      } else {
         SubsidiaryAccountingBookDetail other = (SubsidiaryAccountingBookDetail)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.bookStatus == null && other.getBookStatus() == null || this.bookStatus != null && this.bookStatus.equals(other.getBookStatus()));
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

         if (this.getBookStatus() != null) {
            _hashCode += this.getBookStatus().hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "SubsidiaryAccountingBookDetail"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("accountingBook");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "accountingBook"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("currency");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "currency"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("bookStatus");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "bookStatus"));
      elemField.setXmlType(new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "AccountingBookStatus"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
