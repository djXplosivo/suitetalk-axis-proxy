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

public class ItemFulfillmentThirdPartyTypeUps implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __consigneeBilling = "_consigneeBilling";
   public static final String __noneSelected = "_noneSelected";
   public static final String __thirdPartyBilling = "_thirdPartyBilling";
   public static final ItemFulfillmentThirdPartyTypeUps _consigneeBilling = new ItemFulfillmentThirdPartyTypeUps("_consigneeBilling");
   public static final ItemFulfillmentThirdPartyTypeUps _noneSelected = new ItemFulfillmentThirdPartyTypeUps("_noneSelected");
   public static final ItemFulfillmentThirdPartyTypeUps _thirdPartyBilling = new ItemFulfillmentThirdPartyTypeUps("_thirdPartyBilling");
   private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentThirdPartyTypeUps.class);

   protected ItemFulfillmentThirdPartyTypeUps(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ItemFulfillmentThirdPartyTypeUps fromValue(String value) throws IllegalArgumentException {
      ItemFulfillmentThirdPartyTypeUps enumeration = (ItemFulfillmentThirdPartyTypeUps)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ItemFulfillmentThirdPartyTypeUps fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeUps"));
   }
}
