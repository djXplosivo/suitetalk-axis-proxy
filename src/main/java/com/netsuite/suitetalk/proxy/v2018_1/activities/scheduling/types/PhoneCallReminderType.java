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

public class PhoneCallReminderType implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __eMail = "_eMail";
   public static final String __popupWindow = "_popupWindow";
   public static final PhoneCallReminderType _eMail = new PhoneCallReminderType("_eMail");
   public static final PhoneCallReminderType _popupWindow = new PhoneCallReminderType("_popupWindow");
   private static TypeDesc typeDesc = new TypeDesc(PhoneCallReminderType.class);

   protected PhoneCallReminderType(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static PhoneCallReminderType fromValue(String value) throws IllegalArgumentException {
      PhoneCallReminderType enumeration = (PhoneCallReminderType)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static PhoneCallReminderType fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "PhoneCallReminderType"));
   }
}
