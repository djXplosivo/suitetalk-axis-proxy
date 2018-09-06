package com.netsuite.suitetalk.proxy.v2018_1.transactions.inventory.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class TransferOrderItemCommitInventory implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __availableQty = "_availableQty";
   public static final String __completeQty = "_completeQty";
   public static final String __doNotCommit = "_doNotCommit";
   public static final TransferOrderItemCommitInventory _availableQty = new TransferOrderItemCommitInventory("_availableQty");
   public static final TransferOrderItemCommitInventory _completeQty = new TransferOrderItemCommitInventory("_completeQty");
   public static final TransferOrderItemCommitInventory _doNotCommit = new TransferOrderItemCommitInventory("_doNotCommit");
   private static TypeDesc typeDesc = new TypeDesc(TransferOrderItemCommitInventory.class);

   protected TransferOrderItemCommitInventory(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static TransferOrderItemCommitInventory fromValue(String value) throws IllegalArgumentException {
      TransferOrderItemCommitInventory enumeration = (TransferOrderItemCommitInventory)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static TransferOrderItemCommitInventory fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.inventory_2018_1.transactions.webservices.netsuite.com", "TransferOrderItemCommitInventory"));
   }
}
