package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AccountSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AccountingTransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.RevRecScheduleSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRow;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AccountingTransactionSearchRow extends SearchRow implements Serializable {
   private AccountingTransactionSearchRowBasic basic;
   private AccountSearchRowBasic accountJoin;
   private RevRecScheduleSearchRowBasic revRecScheduleJoin;
   private TransactionSearchRowBasic transactionJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AccountingTransactionSearchRow.class, true);

   public AccountingTransactionSearchRow() {
      super();
   }

   public AccountingTransactionSearchRow(AccountingTransactionSearchRowBasic basic, AccountSearchRowBasic accountJoin, RevRecScheduleSearchRowBasic revRecScheduleJoin, TransactionSearchRowBasic transactionJoin) {
      super();
      this.basic = basic;
      this.accountJoin = accountJoin;
      this.revRecScheduleJoin = revRecScheduleJoin;
      this.transactionJoin = transactionJoin;
   }

   public AccountingTransactionSearchRowBasic getBasic() {
      return this.basic;
   }

   public void setBasic(AccountingTransactionSearchRowBasic basic) {
      this.basic = basic;
   }

   public AccountSearchRowBasic getAccountJoin() {
      return this.accountJoin;
   }

   public void setAccountJoin(AccountSearchRowBasic accountJoin) {
      this.accountJoin = accountJoin;
   }

   public RevRecScheduleSearchRowBasic getRevRecScheduleJoin() {
      return this.revRecScheduleJoin;
   }

   public void setRevRecScheduleJoin(RevRecScheduleSearchRowBasic revRecScheduleJoin) {
      this.revRecScheduleJoin = revRecScheduleJoin;
   }

   public TransactionSearchRowBasic getTransactionJoin() {
      return this.transactionJoin;
   }

   public void setTransactionJoin(TransactionSearchRowBasic transactionJoin) {
      this.transactionJoin = transactionJoin;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AccountingTransactionSearchRow)) {
         return false;
      } else {
         AccountingTransactionSearchRow other = (AccountingTransactionSearchRow)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.accountJoin == null && other.getAccountJoin() == null || this.accountJoin != null && this.accountJoin.equals(other.getAccountJoin())) && (this.revRecScheduleJoin == null && other.getRevRecScheduleJoin() == null || this.revRecScheduleJoin != null && this.revRecScheduleJoin.equals(other.getRevRecScheduleJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin()));
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
         int _hashCode = super.hashCode();
         if (this.getBasic() != null) {
            _hashCode += this.getBasic().hashCode();
         }

         if (this.getAccountJoin() != null) {
            _hashCode += this.getAccountJoin().hashCode();
         }

         if (this.getRevRecScheduleJoin() != null) {
            _hashCode += this.getRevRecScheduleJoin().hashCode();
         }

         if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "AccountingTransactionSearchRow"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingTransactionSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accountJoin");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "accountJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("revRecScheduleJoin");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "revRecScheduleJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "RevRecScheduleSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("transactionJoin");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "transactionJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
