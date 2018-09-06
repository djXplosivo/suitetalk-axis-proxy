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

public class ManufacturingOperationTaskPredecessorPredecessorType implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __finishToFinish = "_finishToFinish";
   public static final String __finishToStart = "_finishToStart";
   public static final String __startToFinish = "_startToFinish";
   public static final String __startToStart = "_startToStart";
   public static final ManufacturingOperationTaskPredecessorPredecessorType _finishToFinish = new ManufacturingOperationTaskPredecessorPredecessorType("_finishToFinish");
   public static final ManufacturingOperationTaskPredecessorPredecessorType _finishToStart = new ManufacturingOperationTaskPredecessorPredecessorType("_finishToStart");
   public static final ManufacturingOperationTaskPredecessorPredecessorType _startToFinish = new ManufacturingOperationTaskPredecessorPredecessorType("_startToFinish");
   public static final ManufacturingOperationTaskPredecessorPredecessorType _startToStart = new ManufacturingOperationTaskPredecessorPredecessorType("_startToStart");
   private static TypeDesc typeDesc = new TypeDesc(ManufacturingOperationTaskPredecessorPredecessorType.class);

   protected ManufacturingOperationTaskPredecessorPredecessorType(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ManufacturingOperationTaskPredecessorPredecessorType fromValue(String value) throws IllegalArgumentException {
      ManufacturingOperationTaskPredecessorPredecessorType enumeration = (ManufacturingOperationTaskPredecessorPredecessorType)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ManufacturingOperationTaskPredecessorPredecessorType fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.supplychain_2018_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessorPredecessorType"));
   }
}
