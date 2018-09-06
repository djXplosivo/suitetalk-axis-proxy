package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class LocationBusinessHoursList implements Serializable {
   private LocationBusinessHours[] locationBusinessHours;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(LocationBusinessHoursList.class, true);

   public LocationBusinessHoursList() {
      super();
   }

   public LocationBusinessHoursList(LocationBusinessHours[] locationBusinessHours, boolean replaceAll) {
      super();
      this.locationBusinessHours = locationBusinessHours;
      this.replaceAll = replaceAll;
   }

   public LocationBusinessHours[] getLocationBusinessHours() {
      return this.locationBusinessHours;
   }

   public void setLocationBusinessHours(LocationBusinessHours[] locationBusinessHours) {
      this.locationBusinessHours = locationBusinessHours;
   }

   public LocationBusinessHours getLocationBusinessHours(int i) {
      return this.locationBusinessHours[i];
   }

   public void setLocationBusinessHours(int i, LocationBusinessHours _value) {
      this.locationBusinessHours[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof LocationBusinessHoursList)) {
         return false;
      } else {
         LocationBusinessHoursList other = (LocationBusinessHoursList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.locationBusinessHours == null && other.getLocationBusinessHours() == null || this.locationBusinessHours != null && Arrays.equals(this.locationBusinessHours, other.getLocationBusinessHours())) && this.replaceAll == other.isReplaceAll();
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
         int _hashCode = 1;
         if (this.getLocationBusinessHours() != null) {
            for(int i = 0; i < Array.getLength(this.getLocationBusinessHours()); ++i) {
               Object obj = Array.get(this.getLocationBusinessHours(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
         }

         _hashCode += (this.isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LocationBusinessHoursList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("locationBusinessHours");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "locationBusinessHours"));
      elemField.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "LocationBusinessHours"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
