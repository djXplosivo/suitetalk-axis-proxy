package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class ItemOverallQuantityPricingType implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __byLineQuantity = "_byLineQuantity";
   public static final String __byOverallItemQuantity = "_byOverallItemQuantity";
   public static final String __byOverallParentQuantity = "_byOverallParentQuantity";
   public static final String __byOverallScheduleQuantity = "_byOverallScheduleQuantity";
   public static final ItemOverallQuantityPricingType _byLineQuantity = new ItemOverallQuantityPricingType("_byLineQuantity");
   public static final ItemOverallQuantityPricingType _byOverallItemQuantity = new ItemOverallQuantityPricingType("_byOverallItemQuantity");
   public static final ItemOverallQuantityPricingType _byOverallParentQuantity = new ItemOverallQuantityPricingType("_byOverallParentQuantity");
   public static final ItemOverallQuantityPricingType _byOverallScheduleQuantity = new ItemOverallQuantityPricingType("_byOverallScheduleQuantity");
   private static TypeDesc typeDesc = new TypeDesc(ItemOverallQuantityPricingType.class);

   protected ItemOverallQuantityPricingType(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ItemOverallQuantityPricingType fromValue(String value) throws IllegalArgumentException {
      ItemOverallQuantityPricingType enumeration = (ItemOverallQuantityPricingType)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ItemOverallQuantityPricingType fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemOverallQuantityPricingType"));
   }
}
