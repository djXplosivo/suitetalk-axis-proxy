package com.netsuite.suitetalk.proxy.v2018_1.setup.customization.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CustomRecordTypePermissionsPermittedLevel implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __create = "_create";
   public static final String __edit = "_edit";
   public static final String __full = "_full";
   public static final String __none = "_none";
   public static final String __view = "_view";
   public static final CustomRecordTypePermissionsPermittedLevel _create = new CustomRecordTypePermissionsPermittedLevel("_create");
   public static final CustomRecordTypePermissionsPermittedLevel _edit = new CustomRecordTypePermissionsPermittedLevel("_edit");
   public static final CustomRecordTypePermissionsPermittedLevel _full = new CustomRecordTypePermissionsPermittedLevel("_full");
   public static final CustomRecordTypePermissionsPermittedLevel _none = new CustomRecordTypePermissionsPermittedLevel("_none");
   public static final CustomRecordTypePermissionsPermittedLevel _view = new CustomRecordTypePermissionsPermittedLevel("_view");
   private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypePermissionsPermittedLevel.class);

   protected CustomRecordTypePermissionsPermittedLevel(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static CustomRecordTypePermissionsPermittedLevel fromValue(String value) throws IllegalArgumentException {
      CustomRecordTypePermissionsPermittedLevel enumeration = (CustomRecordTypePermissionsPermittedLevel)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static CustomRecordTypePermissionsPermittedLevel fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.customization_2018_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsPermittedLevel"));
   }
}
