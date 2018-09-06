package com.netsuite.suitetalk.proxy.v2018_1.lists.employees.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class Gender implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __omitted = "_omitted";
   public static final String __female = "_female";
   public static final String __male = "_male";
   public static final Gender _omitted = new Gender("_omitted");
   public static final Gender _female = new Gender("_female");
   public static final Gender _male = new Gender("_male");
   private static TypeDesc typeDesc = new TypeDesc(Gender.class);

   protected Gender(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static Gender fromValue(String value) throws IllegalArgumentException {
      Gender enumeration = (Gender)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static Gender fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.employees_2018_1.lists.webservices.netsuite.com", "Gender"));
   }
}
