package com.netsuite.suitetalk.proxy.v2018_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2018_1.platform.core.RecordRef;
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

public class ItemOptionsList implements Serializable {
   private RecordRef[] itemOptions;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(ItemOptionsList.class, true);

   public ItemOptionsList() {
      super();
   }

   public ItemOptionsList(RecordRef[] itemOptions) {
      super();
      this.itemOptions = itemOptions;
   }

   public RecordRef[] getItemOptions() {
      return this.itemOptions;
   }

   public void setItemOptions(RecordRef[] itemOptions) {
      this.itemOptions = itemOptions;
   }

   public RecordRef getItemOptions(int i) {
      return this.itemOptions[i];
   }

   public void setItemOptions(int i, RecordRef _value) {
      this.itemOptions[i] = _value;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof ItemOptionsList)) {
         return false;
      } else {
         ItemOptionsList other = (ItemOptionsList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = this.itemOptions == null && other.getItemOptions() == null || this.itemOptions != null && Arrays.equals(this.itemOptions, other.getItemOptions());
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
         if (this.getItemOptions() != null) {
            for(int i = 0; i < Array.getLength(this.getItemOptions()); ++i) {
               Object obj = Array.get(this.getItemOptions(), i);
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
      typeDesc.setXmlType(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "ItemOptionsList"));
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("itemOptions");
      elemField.setXmlName(new QName("urn:accounting_2018_1.lists.webservices.netsuite.com", "itemOptions"));
      elemField.setXmlType(new QName("urn:core_2018_1.platform.webservices.netsuite.com", "RecordRef"));
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
