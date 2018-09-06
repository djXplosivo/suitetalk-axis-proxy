package com.netsuite.suitetalk.proxy.v2018_1.transactions.purchases.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class InboundShipmentShipmentStatus implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __closed = "_closed";
   public static final String __inTransit = "_inTransit";
   public static final String __partiallyReceived = "_partiallyReceived";
   public static final String __received = "_received";
   public static final String __toBeShipped = "_toBeShipped";
   public static final InboundShipmentShipmentStatus _closed = new InboundShipmentShipmentStatus("_closed");
   public static final InboundShipmentShipmentStatus _inTransit = new InboundShipmentShipmentStatus("_inTransit");
   public static final InboundShipmentShipmentStatus _partiallyReceived = new InboundShipmentShipmentStatus("_partiallyReceived");
   public static final InboundShipmentShipmentStatus _received = new InboundShipmentShipmentStatus("_received");
   public static final InboundShipmentShipmentStatus _toBeShipped = new InboundShipmentShipmentStatus("_toBeShipped");
   private static TypeDesc typeDesc = new TypeDesc(InboundShipmentShipmentStatus.class);

   protected InboundShipmentShipmentStatus(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static InboundShipmentShipmentStatus fromValue(String value) throws IllegalArgumentException {
      InboundShipmentShipmentStatus enumeration = (InboundShipmentShipmentStatus)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static InboundShipmentShipmentStatus fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.purchases_2018_1.transactions.webservices.netsuite.com", "InboundShipmentShipmentStatus"));
   }
}
