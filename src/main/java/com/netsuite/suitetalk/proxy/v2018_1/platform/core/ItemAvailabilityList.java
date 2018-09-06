package com.netsuite.suitetalk.proxy.v2018_1.platform.core;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemAvailabilityList implements Serializable {
   private ItemAvailability[] itemAvailability;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ItemAvailabilityList.class, true);

   public ItemAvailabilityList() {
      super();
   }

   public ItemAvailabilityList(ItemAvailability[] itemAvailability) {
      super();
      this.itemAvailability = itemAvailability;
   }

   public ItemAvailability[] getItemAvailability() {
      return this.itemAvailability;
   }

   public void setItemAvailability(ItemAvailability[] itemAvailability) {
      this.itemAvailability = itemAvailability;
   }

   public ItemAvailability getItemAvailability(int i) {
      return this.itemAvailability[i];
   }

   public void setItemAvailability(int i, ItemAvailability _value) {
      this.itemAvailability[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ItemAvailabilityList)) {
         return false;
      } else {
         ItemAvailabilityList other = (ItemAvailabilityList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.itemAvailability == null && other.getItemAvailability() == null || this.itemAvailability != null && Arrays.equals(this.itemAvailability, other.getItemAvailability());
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
         if (this.getItemAvailability() != null) {
            for(int i = 0; i < Array.getLength(this.getItemAvailability()); ++i) {
               Object obj = Array.get(this.getItemAvailability(), i);
               if (obj != null && !obj.getClass().isArray()) {
                  _hashCode += obj.hashCode();
               }
            }
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
      typeDesc.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ItemAvailabilityList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("itemAvailability");
      elemField.setXmlName(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "itemAvailability"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "ItemAvailability"));
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
