package com.netsuite.suitetalk.proxy.v2018_1.transactions.customers.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class ChargeStage implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __hold = "_hold";
   public static final String __nonBillable = "_nonBillable";
   public static final String __processed = "_processed";
   public static final String __ready = "_ready";
   public static final ChargeStage _hold = new ChargeStage("_hold");
   public static final ChargeStage _nonBillable = new ChargeStage("_nonBillable");
   public static final ChargeStage _processed = new ChargeStage("_processed");
   public static final ChargeStage _ready = new ChargeStage("_ready");
   private static TypeDesc typeDesc = new TypeDesc(ChargeStage.class);

   protected ChargeStage(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ChargeStage fromValue(String value) throws IllegalArgumentException {
      ChargeStage enumeration = (ChargeStage)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ChargeStage fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.customers_2018_1.transactions.webservices.netsuite.com", "ChargeStage"));
   }
}
