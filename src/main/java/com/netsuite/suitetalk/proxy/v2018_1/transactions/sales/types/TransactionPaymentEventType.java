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

public class TransactionPaymentEventType implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __authorizationRequest = "_authorizationRequest";
   public static final String __captureRequest = "_captureRequest";
   public static final String __creditRequest = "_creditRequest";
   public static final String __overrideHold = "_overrideHold";
   public static final String __refreshRequest = "_refreshRequest";
   public static final String __refundRequest = "_refundRequest";
   public static final String __saleRequest = "_saleRequest";
   public static final String __voidRequest = "_voidRequest";
   public static final TransactionPaymentEventType _authorizationRequest = new TransactionPaymentEventType("_authorizationRequest");
   public static final TransactionPaymentEventType _captureRequest = new TransactionPaymentEventType("_captureRequest");
   public static final TransactionPaymentEventType _creditRequest = new TransactionPaymentEventType("_creditRequest");
   public static final TransactionPaymentEventType _overrideHold = new TransactionPaymentEventType("_overrideHold");
   public static final TransactionPaymentEventType _refreshRequest = new TransactionPaymentEventType("_refreshRequest");
   public static final TransactionPaymentEventType _refundRequest = new TransactionPaymentEventType("_refundRequest");
   public static final TransactionPaymentEventType _saleRequest = new TransactionPaymentEventType("_saleRequest");
   public static final TransactionPaymentEventType _voidRequest = new TransactionPaymentEventType("_voidRequest");
   private static TypeDesc typeDesc = new TypeDesc(TransactionPaymentEventType.class);

   protected TransactionPaymentEventType(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static TransactionPaymentEventType fromValue(String value) throws IllegalArgumentException {
      TransactionPaymentEventType enumeration = (TransactionPaymentEventType)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static TransactionPaymentEventType fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "TransactionPaymentEventType"));
   }
}
