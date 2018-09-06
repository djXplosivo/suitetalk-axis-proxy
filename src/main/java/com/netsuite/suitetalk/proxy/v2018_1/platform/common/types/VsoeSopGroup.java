package com.netsuite.suitetalk.proxy.v2018_1.platform.common.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class VsoeSopGroup implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __exclude = "_exclude";
   public static final String __normal = "_normal";
   public static final String __software = "_software";
   public static final VsoeSopGroup _exclude = new VsoeSopGroup("_exclude");
   public static final VsoeSopGroup _normal = new VsoeSopGroup("_normal");
   public static final VsoeSopGroup _software = new VsoeSopGroup("_software");
   private static TypeDesc typeDesc = new TypeDesc(VsoeSopGroup.class);

   protected VsoeSopGroup(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static VsoeSopGroup fromValue(String value) throws IllegalArgumentException {
      VsoeSopGroup enumeration = (VsoeSopGroup)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static VsoeSopGroup fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "VsoeSopGroup"));
   }
}
