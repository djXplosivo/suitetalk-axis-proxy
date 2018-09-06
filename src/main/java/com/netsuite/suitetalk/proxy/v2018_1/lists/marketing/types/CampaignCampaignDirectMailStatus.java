package com.netsuite.suitetalk.proxy.v2018_1.lists.marketing.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CampaignCampaignDirectMailStatus implements Serializable {
   private String _value_;
   private static HashMap _table_ = new HashMap();
   public static final String __completed = "_completed";
   public static final String __execute = "_execute";
   public static final String __inProgress = "_inProgress";
   public static final String __notStarted = "_notStarted";
   public static final CampaignCampaignDirectMailStatus _completed = new CampaignCampaignDirectMailStatus("_completed");
   public static final CampaignCampaignDirectMailStatus _execute = new CampaignCampaignDirectMailStatus("_execute");
   public static final CampaignCampaignDirectMailStatus _inProgress = new CampaignCampaignDirectMailStatus("_inProgress");
   public static final CampaignCampaignDirectMailStatus _notStarted = new CampaignCampaignDirectMailStatus("_notStarted");
   private static TypeDesc typeDesc = new TypeDesc(CampaignCampaignDirectMailStatus.class);

   protected CampaignCampaignDirectMailStatus(String value) {
      super();
      this._value_ = value;
      _table_.put(this._value_, this);
   }

   public String getValue() {
      return this._value_;
   }

   public static CampaignCampaignDirectMailStatus fromValue(String value) throws IllegalArgumentException {
      CampaignCampaignDirectMailStatus enumeration = (CampaignCampaignDirectMailStatus)_table_.get(value);
      if (enumeration == null) {
         throw new IllegalArgumentException();
      } else {
         return enumeration;
      }
   }

   public static CampaignCampaignDirectMailStatus fromString(String value) throws IllegalArgumentException {
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
      typeDesc.setXmlType(new QName("urn:types.marketing_2018_1.lists.webservices.netsuite.com", "CampaignCampaignDirectMailStatus"));
   }
}
