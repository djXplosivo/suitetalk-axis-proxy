package com.netsuite.suitetalk.proxy.v2018_1.transactions.inventory;

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

public class InventoryTransferInventoryList implements Serializable {
   private InventoryTransferInventory[] inventory;
   private boolean replaceAll;
   private Object __equalsCalc = null;
   private boolean __hashCodeCalc = false;
   private static TypeDesc typeDesc = new TypeDesc(InventoryTransferInventoryList.class, true);

   public InventoryTransferInventoryList() {
      super();
   }

   public InventoryTransferInventoryList(InventoryTransferInventory[] inventory, boolean replaceAll) {
      super();
      this.inventory = inventory;
      this.replaceAll = replaceAll;
   }

   public InventoryTransferInventory[] getInventory() {
      return this.inventory;
   }

   public void setInventory(InventoryTransferInventory[] inventory) {
      this.inventory = inventory;
   }

   public InventoryTransferInventory getInventory(int i) {
      return this.inventory[i];
   }

   public void setInventory(int i, InventoryTransferInventory _value) {
      this.inventory[i] = _value;
   }

   public boolean isReplaceAll() {
      return this.replaceAll;
   }

   public void setReplaceAll(boolean replaceAll) {
      this.replaceAll = replaceAll;
   }

   public synchronized boolean equals(Object obj) {
      if (!(obj instanceof InventoryTransferInventoryList)) {
         return false;
      } else {
         InventoryTransferInventoryList other = (InventoryTransferInventoryList)obj;
         if (obj == null) {
            return false;
         } else if (this == obj) {
            return true;
         } else if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
         } else {
            this.__equalsCalc = obj;
            boolean _equals = (this.inventory == null && other.getInventory() == null || this.inventory != null && Arrays.equals(this.inventory, other.getInventory())) && this.replaceAll == other.isReplaceAll();
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
         if (this.getInventory() != null) {
            for(int i = 0; i < Array.getLength(this.getInventory()); ++i) {
               Object obj = Array.get(this.getInventory(), i);
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
      typeDesc.setXmlType(new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryTransferInventoryList"));
      AttributeDesc attrField = new AttributeDesc();
      attrField.setFieldName("replaceAll");
      attrField.setXmlName(new QName("", "replaceAll"));
      attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
      typeDesc.addFieldDesc(attrField);
      ElementDesc elemField = new ElementDesc();
      elemField.setFieldName("inventory");
      elemField.setXmlName(new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "inventory"));
      elemField.setXmlType(new QName("urn:inventory_2018_1.transactions.webservices.netsuite.com", "InventoryTransferInventory"));
      elemField.setMinOccurs(0);
      elemField.setNillable(false);
      elemField.setMaxOccursUnbounded(true);
      typeDesc.addFieldDesc(elemField);
   }
}
