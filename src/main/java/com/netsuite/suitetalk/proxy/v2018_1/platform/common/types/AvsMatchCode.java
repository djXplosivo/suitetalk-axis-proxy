package com.netsuite.suitetalk.proxy.v2018_1.platform.common.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class AvsMatchCode implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __n = "_n";
   public static final String __x = "_x";
   public static final String __y = "_y";
   public static final AvsMatchCode _n = new AvsMatchCode("_n");
   public static final AvsMatchCode _x = new AvsMatchCode("_x");
   public static final AvsMatchCode _y = new AvsMatchCode("_y");
   private static TypeDesc typeDesc = new TypeDesc(AvsMatchCode.class);

   protected AvsMatchCode(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static AvsMatchCode fromValue(String value) throws IllegalArgumentException {
      AvsMatchCode enumeration = (AvsMatchCode)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static AvsMatchCode fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "AvsMatchCode"));
   }
}
