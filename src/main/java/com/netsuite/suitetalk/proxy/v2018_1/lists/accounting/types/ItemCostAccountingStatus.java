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

public class ItemCostAccountingStatus implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __complete = "_complete";
   public static final String __failed = "_failed";
   public static final String __pending = "_pending";
   public static final String __processing = "_processing";
   public static final ItemCostAccountingStatus _complete = new ItemCostAccountingStatus("_complete");
   public static final ItemCostAccountingStatus _failed = new ItemCostAccountingStatus("_failed");
   public static final ItemCostAccountingStatus _pending = new ItemCostAccountingStatus("_pending");
   public static final ItemCostAccountingStatus _processing = new ItemCostAccountingStatus("_processing");
   private static TypeDesc typeDesc = new TypeDesc(ItemCostAccountingStatus.class);

   protected ItemCostAccountingStatus(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ItemCostAccountingStatus fromValue(String value) throws IllegalArgumentException {
      ItemCostAccountingStatus enumeration = (ItemCostAccountingStatus)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ItemCostAccountingStatus fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemCostAccountingStatus"));
   }
}