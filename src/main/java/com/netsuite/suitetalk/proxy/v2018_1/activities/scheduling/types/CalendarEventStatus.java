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

public class CalendarEventStatus implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __canceled = "_canceled";
   public static final String __completed = "_completed";
   public static final String __confirmed = "_confirmed";
   public static final String __tentative = "_tentative";
   public static final CalendarEventStatus _canceled = new CalendarEventStatus("_canceled");
   public static final CalendarEventStatus _completed = new CalendarEventStatus("_completed");
   public static final CalendarEventStatus _confirmed = new CalendarEventStatus("_confirmed");
   public static final CalendarEventStatus _tentative = new CalendarEventStatus("_tentative");
   private static TypeDesc typeDesc = new TypeDesc(CalendarEventStatus.class);

   protected CalendarEventStatus(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static CalendarEventStatus fromValue(String value) throws IllegalArgumentException {
      CalendarEventStatus enumeration = (CalendarEventStatus)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static CalendarEventStatus fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventStatus"));
   }
}
