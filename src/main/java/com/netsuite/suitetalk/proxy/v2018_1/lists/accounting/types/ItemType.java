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

public class ItemType implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __assembly = "_assembly";
   public static final String __description = "_description";
   public static final String __discount = "_discount";
   public static final String __downloadItem = "_downloadItem";
   public static final String __giftCertificateItem = "_giftCertificateItem";
   public static final String __inventoryItem = "_inventoryItem";
   public static final String __itemGroup = "_itemGroup";
   public static final String __kit = "_kit";
   public static final String __markup = "_markup";
   public static final String __nonInventoryItem = "_nonInventoryItem";
   public static final String __otherCharge = "_otherCharge";
   public static final String __payment = "_payment";
   public static final String __service = "_service";
   public static final String __subtotal = "_subtotal";
   public static final ItemType _assembly = new ItemType("_assembly");
   public static final ItemType _description = new ItemType("_description");
   public static final ItemType _discount = new ItemType("_discount");
   public static final ItemType _downloadItem = new ItemType("_downloadItem");
   public static final ItemType _giftCertificateItem = new ItemType("_giftCertificateItem");
   public static final ItemType _inventoryItem = new ItemType("_inventoryItem");
   public static final ItemType _itemGroup = new ItemType("_itemGroup");
   public static final ItemType _kit = new ItemType("_kit");
   public static final ItemType _markup = new ItemType("_markup");
   public static final ItemType _nonInventoryItem = new ItemType("_nonInventoryItem");
   public static final ItemType _otherCharge = new ItemType("_otherCharge");
   public static final ItemType _payment = new ItemType("_payment");
   public static final ItemType _service = new ItemType("_service");
   public static final ItemType _subtotal = new ItemType("_subtotal");
   private static TypeDesc typeDesc = new TypeDesc(ItemType.class);

   protected ItemType(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ItemType fromValue(String value) throws IllegalArgumentException {
      ItemType enumeration = (ItemType)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ItemType fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.accounting_2018_1.lists.webservices.netsuite.com", "ItemType"));
   }
}
