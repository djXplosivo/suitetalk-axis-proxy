package com.netsuite.suitetalk.proxy.v2018_1.activities.scheduling;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

import javax.xml.namespace.QName;
import java.io.Serializable;

public class CalendarEventResource implements Serializable {
   private RecordRef resource;
   private String location;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(CalendarEventResource.class, true);

   public CalendarEventResource() {
      super();
   }

   public CalendarEventResource(RecordRef resource, String location) {
      super();
      this.resource = resource;
      this.location = location;
   }

   public RecordRef getResource() {
      return this.resource;
   }

   public void setResource(RecordRef resource) {
      this.resource = resource;
   }

   public String getLocation() {
      return this.location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof CalendarEventResource)) {
         return false;
      } else {
         CalendarEventResource other = (CalendarEventResource)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.resource == null && other.getResource() == null || this.resource != null && this.resource.equals(other.getResource())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation()));
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
         if (this.getResource() != null) {
            _hashCode += this.getResource().hashCode();
         }

         if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
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
      typeDesc.setXmlType(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "CalendarEventResource"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("resource");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "resource"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
      elemField = new ElementDesc();
      elemField.setFieldName("location");
      elemField.setXmlName(new QName("urn:scheduling_2018_1.activities.webservices.netsuite.com", "location"));
      elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      typeDesc.addFieldDesc(elemField);
   }
}
