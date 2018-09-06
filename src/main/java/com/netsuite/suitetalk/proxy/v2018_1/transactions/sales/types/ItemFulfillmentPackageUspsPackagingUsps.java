package com.netsuite.suitetalk.proxy.v2018_1.transactions.sales.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class ItemFulfillmentPackageUspsPackagingUsps implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __parcel = "_parcel";
   public static final String __flatRateBox = "_flatRateBox";
   public static final String __flatRateEnvelope = "_flatRateEnvelope";
   public static final String __smallFlatRateBox = "_smallFlatRateBox";
   public static final String __mediumFlatRateBox = "_mediumFlatRateBox";
   public static final String __largeFlatRateBox = "_largeFlatRateBox";
   public static final String __irregularPackage = "_irregularPackage";
   public static final String __largePackage = "_largePackage";
   public static final String __oversizedPackage = "_oversizedPackage";
   public static final ItemFulfillmentPackageUspsPackagingUsps _parcel = new ItemFulfillmentPackageUspsPackagingUsps("_parcel");
   public static final ItemFulfillmentPackageUspsPackagingUsps _flatRateBox = new ItemFulfillmentPackageUspsPackagingUsps("_flatRateBox");
   public static final ItemFulfillmentPackageUspsPackagingUsps _flatRateEnvelope = new ItemFulfillmentPackageUspsPackagingUsps("_flatRateEnvelope");
   public static final ItemFulfillmentPackageUspsPackagingUsps _smallFlatRateBox = new ItemFulfillmentPackageUspsPackagingUsps("_smallFlatRateBox");
   public static final ItemFulfillmentPackageUspsPackagingUsps _mediumFlatRateBox = new ItemFulfillmentPackageUspsPackagingUsps("_mediumFlatRateBox");
   public static final ItemFulfillmentPackageUspsPackagingUsps _largeFlatRateBox = new ItemFulfillmentPackageUspsPackagingUsps("_largeFlatRateBox");
   public static final ItemFulfillmentPackageUspsPackagingUsps _irregularPackage = new ItemFulfillmentPackageUspsPackagingUsps("_irregularPackage");
   public static final ItemFulfillmentPackageUspsPackagingUsps _largePackage = new ItemFulfillmentPackageUspsPackagingUsps("_largePackage");
   public static final ItemFulfillmentPackageUspsPackagingUsps _oversizedPackage = new ItemFulfillmentPackageUspsPackagingUsps("_oversizedPackage");
   private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageUspsPackagingUsps.class);

   protected ItemFulfillmentPackageUspsPackagingUsps(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static ItemFulfillmentPackageUspsPackagingUsps fromValue(String value) throws IllegalArgumentException {
      ItemFulfillmentPackageUspsPackagingUsps enumeration = (ItemFulfillmentPackageUspsPackagingUsps)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static ItemFulfillmentPackageUspsPackagingUsps fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.sales_2018_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsPackagingUsps"));
   }
}
