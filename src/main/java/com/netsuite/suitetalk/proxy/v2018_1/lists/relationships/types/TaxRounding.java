package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class TaxRounding implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __roundDown = "_roundDown";
   public static final String __roundOff = "_roundOff";
   public static final String __roundUp = "_roundUp";
   public static final TaxRounding _roundDown = new TaxRounding("_roundDown");
   public static final TaxRounding _roundOff = new TaxRounding("_roundOff");
   public static final TaxRounding _roundUp = new TaxRounding("_roundUp");
   private static TypeDesc typeDesc = new TypeDesc(TaxRounding.class);

   protected TaxRounding(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static TaxRounding fromValue(String value) throws IllegalArgumentException {
      TaxRounding enumeration = (TaxRounding)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static TaxRounding fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "TaxRounding"));
   }
}
