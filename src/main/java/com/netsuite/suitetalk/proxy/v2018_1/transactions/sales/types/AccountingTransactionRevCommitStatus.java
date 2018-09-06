package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class AccountingTransactionRevCommitStatus implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __committed = "_committed";
   public static final String __partiallyCommitted = "_partiallyCommitted";
   public static final String __pendingCommitment = "_pendingCommitment";
   public static final AccountingTransactionRevCommitStatus _committed = new AccountingTransactionRevCommitStatus("_committed");
   public static final AccountingTransactionRevCommitStatus _partiallyCommitted = new AccountingTransactionRevCommitStatus("_partiallyCommitted");
   public static final AccountingTransactionRevCommitStatus _pendingCommitment = new AccountingTransactionRevCommitStatus("_pendingCommitment");
   private static TypeDesc typeDesc = new TypeDesc(AccountingTransactionRevCommitStatus.class);

   protected AccountingTransactionRevCommitStatus(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static AccountingTransactionRevCommitStatus fromValue(String value) throws IllegalArgumentException {
      AccountingTransactionRevCommitStatus enumeration = (AccountingTransactionRevCommitStatus)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static AccountingTransactionRevCommitStatus fromString(String value) throws IllegalArgumentException {
      return fromValue(value);
   }

   public boolean equals(Object obj) {
      return obj == this;
   }

   public int hashCode() {
      return this.toString().hashCode();
   }

   public String toString() {
      return this._value_;
   }

   public Object readResolve() throws ObjectStreamException {
      return fromValue(this._value_);
   }

   public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
      return new EnumSerializer(_javaType, _xmlType);
   }

   public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
      return new EnumDeserializer(_javaType, _xmlType);
   }

   public static TypeDesc getTypeDesc() {
      return typeDesc;
   }

   static {
      typeDesc.setXmlType(new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "AccountingTransactionRevCommitStatus"));
   }
}
