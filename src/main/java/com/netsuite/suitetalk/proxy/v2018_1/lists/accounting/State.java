package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.common.types.Country;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2018_1.platform.core.Record;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class State extends Record implements Serializable {
   private Country country;
   private String fullName;
   private String shortname;
   private String internalId;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(State.class, true);

   public State() {
      super();
   }

   public State(NullField nullFieldList, String internalId, Country country, String fullName, String shortname) {
      super(nullFieldList);
      this.internalId = internalId;
      this.country = country;
      this.fullName = fullName;
      this.shortname = shortname;
   }

   public Country getCountry() {
      return this.country;
   }

   public void setCountry(Country country) {
      this.country = country;
   }

   public String getFullName() {
      return this.fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public String getShortname() {
      return this.shortname;
   }

   public void setShortname(String shortname) {
      this.shortname = shortname;
   }

   public String getInternalId() {
      return this.internalId;
   }

   public void setInternalId(String internalId) {
      this.internalId = internalId;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof State)) {
         return false;
      } else {
         State other = (State)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = super.equals(obj) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.fullName == null && other.getFullName() == null || this.fullName != null && this.fullName.equals(other.getFullName())) && (this.shortname == null && other.getShortname() == null || this.shortname != null && this.shortname.equals(other.getShortname())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId()));
            this.__equalsCalc = null;
            return _equals;
         }
      }
   }

   public synchronized int hashCode() {
      if (this.__hashCodeCalc) {
         return 0;
      } else {
         this.__hashCodeCalc = true;
         int _hashCode = super.hashCode();
         if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
         }

         if (this.getFullName() != null) {
            _hashCode += this.getFullName().hashCode();
         }

         if (this.getShortname() != null) {
            _hashCode += this.getShortname().hashCode();
         }

         if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
         }

         this.__hashCodeCalc = false;
         return _hashCode;
      }
   }

   public static TypeDesc getTypeDesc() {
      return typeDesc;
   }

   public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
      return new BeanSerializer(_javaType, _xmlType, typeDesc);
   }

   public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
      return new BeanDeserializer(_javaType, _xmlType, typeDesc);
   }

   static {
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "State"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("internalId");
      attrField.setXmlName(new QName("", "internalId"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("country");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "country"));
      elemField.setXmlType(new QName("urn:types.common_2018_1.platform.webservices.netsuite.com", "Country"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("fullName");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "fullName"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("shortname");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "shortname"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
