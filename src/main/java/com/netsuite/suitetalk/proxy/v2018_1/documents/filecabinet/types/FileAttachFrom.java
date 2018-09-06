package com.netsuite.suitetalk.proxy.v2018_1.documents.filecabinet.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class FileAttachFrom implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __computer = "_computer";
   public static final String __web = "_web";
   public static final FileAttachFrom _computer = new FileAttachFrom("_computer");
   public static final FileAttachFrom _web = new FileAttachFrom("_web");
   private static TypeDesc typeDesc = new TypeDesc(FileAttachFrom.class);

   protected FileAttachFrom(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static FileAttachFrom fromValue(String value) throws IllegalArgumentException {
      FileAttachFrom enumeration = (FileAttachFrom)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static FileAttachFrom fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.filecabinet_2018_1.documents.webservices.netsuite.com", "FileAttachFrom"));
   }
}
