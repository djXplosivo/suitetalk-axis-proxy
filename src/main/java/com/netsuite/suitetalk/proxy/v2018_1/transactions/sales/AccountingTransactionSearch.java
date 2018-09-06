package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AccountSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.AccountingTransactionSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.RevRecScheduleSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.common.TransactionSearchBasic;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.SearchRecord;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AccountingTransactionSearch extends SearchRecord implements Serializable {
   private AccountingTransactionSearchBasic basic;
   private AccountSearchBasic accountJoin;
   private RevRecScheduleSearchBasic revRecScheduleJoin;
   private TransactionSearchBasic transactionJoin;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(AccountingTransactionSearch.class, true);

   public AccountingTransactionSearch() {
      super();
   }

   public AccountingTransactionSearch(AccountingTransactionSearchBasic basic, AccountSearchBasic accountJoin, RevRecScheduleSearchBasic revRecScheduleJoin, TransactionSearchBasic transactionJoin) {
      super();
      this.basic = basic;
      this.accountJoin = accountJoin;
      this.revRecScheduleJoin = revRecScheduleJoin;
      this.transactionJoin = transactionJoin;
   }

   public AccountingTransactionSearchBasic getBasic() {
      return this.basic;
   }

   public void setBasic(AccountingTransactionSearchBasic basic) {
      this.basic = basic;
   }

   public AccountSearchBasic getAccountJoin() {
      return this.accountJoin;
   }

   public void setAccountJoin(AccountSearchBasic accountJoin) {
      this.accountJoin = accountJoin;
   }

   public RevRecScheduleSearchBasic getRevRecScheduleJoin() {
      return this.revRecScheduleJoin;
   }

   public void setRevRecScheduleJoin(RevRecScheduleSearchBasic revRecScheduleJoin) {
      this.revRecScheduleJoin = revRecScheduleJoin;
   }

   public TransactionSearchBasic getTransactionJoin() {
      return this.transactionJoin;
   }

   public void setTransactionJoin(TransactionSearchBasic transactionJoin) {
      this.transactionJoin = transactionJoin;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof AccountingTransactionSearch)) {
         return false;
      } else {
         AccountingTransactionSearch other = (AccountingTransactionSearch)obj;
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
      typeDesc.setXmlType(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "AccountingTransactionSearch"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("basic");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "basic"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountingTransactionSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("accountJoin");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "accountJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("revRecScheduleJoin");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "revRecScheduleJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "RevRecScheduleSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("transactionJoin");
      elemField.setXmlName(new QName("urn:sales_2018_1.transactions.webservices.netsuite.com", "transactionJoin"));
      elemField.setXmlType(new QName("urn:common_2018_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
