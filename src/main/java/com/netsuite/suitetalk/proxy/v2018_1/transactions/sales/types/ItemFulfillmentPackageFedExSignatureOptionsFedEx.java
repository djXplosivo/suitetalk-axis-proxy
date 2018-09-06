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

public class ItemFulfillmentPackageFedExSignatureOptionsFedEx implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __adult = "_adult";
   public static final String __direct = "_direct";
   public static final String __indirect = "_indirect";
   public static final ItemFulfillmentPackageFedExSignatureOptionsFedEx _adult = new ItemFulfillmentPackageFedExSignatureOptionsFedEx("_adult");
   public static final ItemFulfillmentPackageFedExSignatureOptionsFedEx _direct = new ItemFulfillmentPackageFedExSignatureOptionsFedEx("_direct");
   public static final ItemFulfillmentPackageFedExSignatureOptionsFedEx _indirect = new ItemFulfillmentPackageFedExSignatureOptionsFedEx("_indirect");
   private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageFedExSignatureOptionsFedEx.class);

   protected ItemFulfillmentPackageFedExSignatureOptionsFedEx(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ItemFulfillmentPackageFedExSignatureOptionsFedEx fromValue(String value) throws IllegalArgumentException {
      ItemFulfillmentPackageFedExSignatureOptionsFedEx enumeration = (ItemFulfillmentPackageFedExSignatureOptionsFedEx)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ItemFulfillmentPackageFedExSignatureOptionsFedEx fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExSignatureOptionsFedEx"));
   }
}
