package com.netsuite.suitetalk.proxy.v2018_1.lists.supplychain.types;

import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

import javax.xml.namespace.QName;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

public class ManufacturingLagType implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __quantity = "_quantity";
   public static final String __quantityPercentage = "_quantityPercentage";
   public static final String __time = "_time";
   public static final String __timePercentage = "_timePercentage";
   public static final ManufacturingLagType _quantity = new ManufacturingLagType("_quantity");
   public static final ManufacturingLagType _quantityPercentage = new ManufacturingLagType("_quantityPercentage");
   public static final ManufacturingLagType _time = new ManufacturingLagType("_time");
   public static final ManufacturingLagType _timePercentage = new ManufacturingLagType("_timePercentage");
   private static TypeDesc typeDesc = new TypeDesc(ManufacturingLagType.class);

   protected ManufacturingLagType(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ManufacturingLagType fromValue(String value) throws IllegalArgumentException {
      ManufacturingLagType enumeration = (ManufacturingLagType)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ManufacturingLagType fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingLagType"));
   }
}
