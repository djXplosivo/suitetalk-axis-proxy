package com.netsuite.suitetalk.proxy.v2018_1.lists.relationships;

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

public class VendorPricingScheduleList implements Serializable {
   private VendorPricingSchedule[] pricingSchedule;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(VendorPricingScheduleList.class, true);

   public VendorPricingScheduleList() {
      super();
   }

   public VendorPricingScheduleList(VendorPricingSchedule[] pricingSchedule, boolean replaceAll) {
      super();
      this.pricingSchedule = pricingSchedule;
      this.replaceAll = replaceAll;
   }

   public VendorPricingSchedule[] getPricingSchedule() {
      return this.pricingSchedule;
   }

   public void setPricingSchedule(VendorPricingSchedule[] pricingSchedule) {
      this.pricingSchedule = pricingSchedule;
   }

   public VendorPricingSchedule getPricingSchedule(int i) {
      return this.pricingSchedule[i];
   }

   public void setPricingSchedule(int i, VendorPricingSchedule _value) {
      this.pricingSchedule[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof VendorPricingScheduleList)) {
         return false;
      } else {
         VendorPricingScheduleList other = (VendorPricingScheduleList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.pricingSchedule == null && other.getPricingSchedule() == null || this.pricingSchedule != null && Arrays.equals(this.pricingSchedule, other.getPricingSchedule())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getPricingSchedule() != null) {
            for(int i = 0; i < Array.getLength(this.getPricingSchedule()); ++i) {
               Object obj = Array.get(this.getPricingSchedule(), i);
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
      typeDesc.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorPricingScheduleList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("pricingSchedule");
      elemField.setXmlName(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "pricingSchedule"));
      elemField.setXmlType(new QName("urn:relationships_2018_1.lists.webservices.netsuite.com", "VendorPricingSchedule"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
