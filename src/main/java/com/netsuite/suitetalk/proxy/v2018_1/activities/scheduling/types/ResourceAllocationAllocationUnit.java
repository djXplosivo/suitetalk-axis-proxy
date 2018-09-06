package com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling.types;

import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

import javax.xml.namespace.QName;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

public class ResourceAllocationAllocationUnit implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __hours = "_hours";
   public static final String __percentOfTime = "_percentOfTime";
   public static final ResourceAllocationAllocationUnit _hours = new ResourceAllocationAllocationUnit("_hours");
   public static final ResourceAllocationAllocationUnit _percentOfTime = new ResourceAllocationAllocationUnit("_percentOfTime");
   private static TypeDesc typeDesc = new TypeDesc(ResourceAllocationAllocationUnit.class);

   protected ResourceAllocationAllocationUnit(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ResourceAllocationAllocationUnit fromValue(String value) throws IllegalArgumentException {
      ResourceAllocationAllocationUnit enumeration = (ResourceAllocationAllocationUnit)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ResourceAllocationAllocationUnit fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "ResourceAllocationAllocationUnit"));
   }
}
