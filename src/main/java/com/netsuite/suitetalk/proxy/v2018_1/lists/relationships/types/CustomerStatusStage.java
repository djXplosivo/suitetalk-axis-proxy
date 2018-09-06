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

public class CustomerStatusStage implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __customer = "_customer";
   public static final String __lead = "_lead";
   public static final String __prospect = "_prospect";
   public static final CustomerStatusStage _customer = new CustomerStatusStage("_customer");
   public static final CustomerStatusStage _lead = new CustomerStatusStage("_lead");
   public static final CustomerStatusStage _prospect = new CustomerStatusStage("_prospect");
   private static TypeDesc typeDesc = new TypeDesc(CustomerStatusStage.class);

   protected CustomerStatusStage(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static CustomerStatusStage fromValue(String value) throws IllegalArgumentException {
      CustomerStatusStage enumeration = (CustomerStatusStage)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static CustomerStatusStage fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.relationships_2018_1.lists.webservices.netsuite.com", "CustomerStatusStage"));
   }
}
